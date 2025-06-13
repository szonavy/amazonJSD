package thirdsession.practiceLinkedList;

import java.util.ListIterator;
import java.util.LinkedList;

public class Tasks {
    public static void main(String[] args) {
        // Step 1: Initialize the LinkedList with the initial tasks
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Check emails.");
        tasks.add("Attend a team meeting.");
        tasks.add("Complete project report.");

        System.out.println("Initila tasks:");

        tasks.addFirst("Start your day with a smoothy!");
        tasks.add(2,"Wash the dishes!");
        tasks.removeLast();
        for(String s : tasks){
            System.out.println(s);
        }

        ListIterator<String> iterator = tasks.listIterator();

        System.out.println("Forward:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Backward:");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
