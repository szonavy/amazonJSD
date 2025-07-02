package thirdsession.tests.second;

public class BubbleSort {

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
            for(int i = 0; i < l-1; i++){
                for(int j = 0; j < l-1-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
}


