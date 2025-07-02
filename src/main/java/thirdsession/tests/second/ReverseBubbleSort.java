package thirdsession.tests.second;

public class ReverseBubbleSort {

        public static void main(String[] args) {
            int[] heights = {198, 185, 210, 176, 195};

            bubbleSortDescending(heights);

            System.out.print("Sorted heights in descending order: ");
            for (int height : heights) {
                System.out.print(height + " ");
            }
        }
        public static void bubbleSortDescending(int[] arr) {
            //TODO: write your bubble sort logic here
            int l = arr.length;
            for(int i = l-1; i > 0; i--){
                for(int j = l-1; j >= i ; j--){
                    if(arr[j-1] < arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
        }
}

