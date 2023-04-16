//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package HomeWorkTasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class ReverseList {
    public static void logic() {
        LinkedList<Integer> newLinkList = createLinkedList(0, 25, 20);
        System.out.println("********** Задача № 1 **********");
        System.out.println("Изначальный список: \n" + newLinkList);
        System.out.println("Реверсивный список: \n" + reverseList(newLinkList) + "\n");
    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> inputLinkList) {
        Collections.reverse(inputLinkList);
        return inputLinkList;
    }

    private static LinkedList<Integer> createLinkedList(int min, int max, int size) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            ll.add(rand.nextInt(min, max));
        }
        return ll;
    }
}
