package lr8.tasks;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class parser_news {

    public static void main(String[] args) {
        String url = "https://habr.com/ru/news/";
        int maxRetries = 3;
        int attempt = 0;
        boolean success = false;

        Document doc = null;


        while (attempt < maxRetries && !success) {
            try {
                doc = Jsoup.connect(url).userAgent("Mozilla").get();
                success = true;
            } catch (IOException e) {
                attempt++;
                System.out.println("Ошибка подключения: " + e.getMessage());
                System.out.println("Попытка " + attempt + " из " + maxRetries);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }

        if (!success) {
            System.out.println("Не удалось подключиться к сайту после " + maxRetries + " попыток.");
            return;
        }


        Elements newsItems = doc.select("article");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("news.txt"))) {
            for (Element item : newsItems) {
                String title = item.select("h2").text();
                String link = item.select("a").attr("href");
                String time = item.select("time").attr("datetime");

                writer.write("Заголовок: " + title);
                writer.newLine();
                writer.write("Дата: " + time);
                writer.newLine();
                writer.write("Ссылка: " + link);
                writer.newLine();
                writer.write("----------------------------------------");
                writer.newLine();
            }

            System.out.println("Новости успешно сохранены в файл news.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
