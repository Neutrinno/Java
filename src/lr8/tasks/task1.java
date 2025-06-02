package lr8.tasks;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class task1{

    private static final String FILE_PATH = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr8\\tasks\\products.xml";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить продукт");
            System.out.println("2. Поиск по категории");
            System.out.println("3. Поиск по цене");
            System.out.println("4. Удалить продукт");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addProduct(scanner);
                case "2" -> searchByCategory(scanner);
                case "3" -> searchByPrice(scanner);
                case "4" -> deleteProduct(scanner);
                case "5" -> System.exit(0);
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private static Document getDocument() throws Exception {
        File file = new File(FILE_PATH);
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        return file.exists() ? builder.parse(file) : builder.newDocument();
    }

    private static void saveDocument(Document doc) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(new File(FILE_PATH)));
    }

    private static void addProduct(Scanner scanner) throws Exception {
        Document doc = getDocument();

        Element root = doc.getDocumentElement();
        if (root == null) {
            root = doc.createElement("products");
            doc.appendChild(root);
        }

        System.out.print("Название продукта: ");
        String name = scanner.nextLine();
        System.out.print("Категория: ");
        String category = scanner.nextLine();
        System.out.print("Цена: ");
        String price = scanner.nextLine();
        System.out.print("Количество: ");
        String quantity = scanner.nextLine();

        Element product = doc.createElement("product");

        Element nameElem = doc.createElement("name");
        nameElem.setTextContent(name);
        product.appendChild(nameElem);

        Element catElem = doc.createElement("category");
        catElem.setTextContent(category);
        product.appendChild(catElem);

        Element priceElem = doc.createElement("price");
        priceElem.setTextContent(price);
        product.appendChild(priceElem);

        Element qtyElem = doc.createElement("quantity");
        qtyElem.setTextContent(quantity);
        product.appendChild(qtyElem);

        root.appendChild(product);
        saveDocument(doc);
        System.out.println("Продукт добавлен!");
    }

    private static void searchByCategory(Scanner scanner) throws Exception {
        System.out.print("Введите категорию: ");
        String search = scanner.nextLine();

        Document doc = getDocument();
        NodeList products = doc.getElementsByTagName("product");

        boolean found = false;
        for (int i = 0; i < products.getLength(); i++) {
            Element product = (Element) products.item(i);
            String cat = product.getElementsByTagName("category").item(0).getTextContent();
            if (cat.equalsIgnoreCase(search)) {
                printProduct(product);
                found = true;
            }
        }

        if (!found) System.out.println("Ничего не найдено.");
    }

    private static void searchByPrice(Scanner scanner) throws Exception {
        System.out.print("Введите максимальную цену: ");
        double maxPrice = Double.parseDouble(scanner.nextLine());

        Document doc = getDocument();
        NodeList products = doc.getElementsByTagName("product");

        boolean found = false;
        for (int i = 0; i < products.getLength(); i++) {
            Element product = (Element) products.item(i);
            double price = Double.parseDouble(product.getElementsByTagName("price").item(0).getTextContent());
            if (price <= maxPrice) {
                printProduct(product);
                found = true;
            }
        }

        if (!found) System.out.println("Нет продуктов дешевле указанной цены.");
    }

    private static void deleteProduct(Scanner scanner) throws Exception {
        System.out.print("Введите название продукта для удаления: ");
        String target = scanner.nextLine();

        Document doc = getDocument();
        NodeList products = doc.getElementsByTagName("product");

        boolean deleted = false;
        for (int i = 0; i < products.getLength(); i++) {
            Element product = (Element) products.item(i);
            String name = product.getElementsByTagName("name").item(0).getTextContent();
            if (name.equalsIgnoreCase(target)) {
                product.getParentNode().removeChild(product);
                deleted = true;
                break;
            }
        }

        if (deleted) {
            saveDocument(doc);
            System.out.println("Продукт удалён.");
        } else {
            System.out.println("Продукт не найден.");
        }
    }

    private static void printProduct(Element product) {
        String name = product.getElementsByTagName("name").item(0).getTextContent();
        String category = product.getElementsByTagName("category").item(0).getTextContent();
        String price = product.getElementsByTagName("price").item(0).getTextContent();
        String quantity = product.getElementsByTagName("quantity").item(0).getTextContent();

        System.out.println("Название: " + name + ", Категория: " + category +
                ", Цена: " + price + ", Количество: " + quantity);
    }
}
