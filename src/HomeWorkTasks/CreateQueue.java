//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
// очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
package HomeWorkTasks;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class CreateQueue {
    private static LinkedList<String> newLinkList = new LinkedList<>();
    public static void logic(){
        System.out.println("********** Задача № 2 **********");
        for (int i = 0; i < 15; i++) {
            enqueue(newLinkList, getStroke());
        }
        System.out.println("Помещаем элементы в конец очереди: ");
        System.out.println(newLinkList);
        System.out.println("Возрващаем первый элемент из очереди и удаляем его: ");
        System.out.println(dequeue(newLinkList));
        System.out.println(newLinkList);
        System.out.println("Возрващаем первый элемент из очереди, не удаляя: ");
        System.out.println(first(newLinkList));
        System.out.println(newLinkList);
    }
    private static void enqueue(LinkedList<String> inputLinkList, String inputString) {
        inputLinkList.addLast(inputString);
    }
    private static String dequeue(LinkedList<String> inputLinkList) {
        return inputLinkList.pop();
    }
    private static String first(LinkedList<String> inputLinkList) {
        return inputLinkList.getFirst();
    }

    private static String getStroke() {
        Random rand = new Random();
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            data.append(Integer.toString(rand.nextInt(1,10)));
        }
        return data.toString();
    }
}
