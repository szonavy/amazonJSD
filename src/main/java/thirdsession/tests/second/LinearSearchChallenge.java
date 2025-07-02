package thirdsession.tests.second;
import java.util.ArrayList;
import java.util.List;
public class LinearSearchChallenge {

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 20, 50};
            int target = 20; // Value to search for

            int[] indices = findAllOccurrences(arr, target);
            System.out.print("Find All Occurrences: ");
            if (indices.length > 0) {
                for (int index : indices) {
                    if(index != 0){
                        System.out.print(index + " ");
                    }
                }
            } else {
                System.out.print("No occurrences found.");
            }
            System.out.println();
        }

        public static int[] findAllOccurrences(int[] arr, int target) {
            // TODO: Implement this method to return all indices where the target value is found
            int i = 0;
            int[] result = new int[arr.length];
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == target){
                    result[i] = j;
                    i++;
                }
            }
            return result;
            // You might want to use a list to collect indices and then convert it to an array
            // Consider returning an empty array if the target value is not found
        }
}



