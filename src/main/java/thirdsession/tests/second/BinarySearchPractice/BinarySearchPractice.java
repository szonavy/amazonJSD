package thirdsession.tests.second.BinarySearchPractice;

public class BinarySearchPractice {

        public static void main(String[] args) {
            int[] arr = {10, 20, 20, 30, 40, 50};
            int target = 20;

            boolean multiple = hasMultipleOccurrences(arr, target);
            System.out.println("Has Multiple Occurrences: " + multiple);
        }

        public static boolean hasMultipleOccurrences(int[] arr, int target) {
            // TODO: implement the method to find if target is appearing more than once in arr

            int left = 0;
            int right = arr.length-1;


            while(left < right){
                int mid = left + (right - left) / 2;

                if(arr[mid] == target){
                    if((arr[mid + 1] == target && mid < arr.length-1) ||( arr[mid -1] == target && mid > 0)){
                        return true;
                    }else{
                        return false;
                    }
                }

                if(arr[mid] > target){
                    right = mid - 1;
                }
                if(arr[mid] < target){
                    left = mid +1;
                }
            }
            return false;
        }

}
