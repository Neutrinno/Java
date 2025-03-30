package lr3.exercise;

import java.util.*;

public class task6 {
    private static final int ELEMENTS_COUNT = 10_000;
    private static final int GET_OPERATIONS = 10_000;

    public static void main(String[] args) {
        System.out.println("Таблица 1. Сравнение времени выполнения операции добавления (мс)");
        System.out.println("Коллекция\tВ начало\tВ середину\tВ конец");
        long arrayListAddStart = measureAddToBeginning(new ArrayList<>());
        long linkedListAddStart = measureAddToBeginning(new LinkedList<>());
        long arrayListAddMiddle = measureAddToMiddle(new ArrayList<>());
        long linkedListAddMiddle = measureAddToMiddle(new LinkedList<>());
        long arrayListAddEnd = measureAddToEnd(new ArrayList<>());
        long linkedListAddEnd = measureAddToEnd(new LinkedList<>());
        long treeSetAddEnd = measureAddToSet(new TreeSet<>());

        System.out.println("ArrayList\t" + arrayListAddStart + "\t\t" + arrayListAddMiddle + "\t\t" + arrayListAddEnd);
        System.out.println("SortedSet\tN/A\t\tN/A\t\t" + treeSetAddEnd);
        System.out.println("LinkedList\t" + linkedListAddStart + "\t\t" + linkedListAddMiddle + "\t\t" + linkedListAddEnd);

        System.out.println("\nТаблица 2. Сравнение времени выполнения операции удаления (мс)");
        System.out.println("Коллекция\tВ начале\tВ середине\tВ конце");
        long arrayListRemoveStart = measureRemoveFromBeginning(new ArrayList<>());
        long linkedListRemoveStart = measureRemoveFromBeginning(new LinkedList<>());
        long arrayListRemoveMiddle = measureRemoveFromMiddle(new ArrayList<>());
        long linkedListRemoveMiddle = measureRemoveFromMiddle(new LinkedList<>());
        long arrayListRemoveEnd = measureRemoveFromEnd(new ArrayList<>());
        long linkedListRemoveEnd = measureRemoveFromEnd(new LinkedList<>());

        System.out.println("ArrayList\t" + arrayListRemoveStart + "\t\t" + arrayListRemoveMiddle + "\t\t" + arrayListRemoveEnd);
        System.out.println("SortedSet\tN/A\t\tN/A\t\tN/A");
        System.out.println("LinkedList\t" + linkedListRemoveStart + "\t\t" + linkedListRemoveMiddle + "\t\t" + linkedListRemoveEnd);

        System.out.println("\nТаблица 3. Сравнение времени выполнения операции получения элемента по индексу (мс)");
        System.out.println("Коллекция\tПо индексу");
        long arrayListGet = measureGetByIndex(new ArrayList<>());
        long linkedListGet = measureGetByIndex(new LinkedList<>());

        System.out.println("ArrayList\t" + arrayListGet);
        System.out.println("SortedSet\tN/A");
        System.out.println("LinkedList\t" + linkedListGet);
    }

    private static long measureAddToBeginning(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureAddToMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            int mid = list.size() / 2;
            list.add(mid, i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureAddToEnd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureAddToSet(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            set.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureRemoveFromBeginning(List<Integer> list) {
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.removeFirst();
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureRemoveFromMiddle(List<Integer> list) {
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            int mid = list.size() / 2;
            list.remove(mid);
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureRemoveFromEnd(List<Integer> list) {
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.removeLast();
        }
        return System.currentTimeMillis() - start;
    }

    private static long measureGetByIndex(List<Integer> list) {
        for (int i = 0; i < task6.ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        Random random = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < task6.GET_OPERATIONS; i++) {
            int index = random.nextInt(task6.ELEMENTS_COUNT);
            list.get(index);
        }
        return System.currentTimeMillis() - start;
    }
}
