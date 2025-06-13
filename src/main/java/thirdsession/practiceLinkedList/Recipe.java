package thirdsession.practiceLinkedList;

import java.util.ListIterator;
import java.util.LinkedList;

public class Recipe {
    public static void main(String[] args) {
        LinkedList<String> recipeSteps = new LinkedList<>();
        recipeSteps.add("Preheat oven");
        recipeSteps.add("Mix ingredients");
        recipeSteps.add("Bake for 30 minutes");

        ListIterator<String> iterator = recipeSteps.listIterator();

        System.out.println("Traversing forward:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nTraversing backward:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
