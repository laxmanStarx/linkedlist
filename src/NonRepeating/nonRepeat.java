package NonRepeating;

public class nonRepeat {

    static int hello(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            boolean hasDuplicate = false;


            for (int j = 0; j < n; j++) {
                // Skip comparing the element with itself
                if (i != j && arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break; // Stop looking, this element repeats
                }
            }

            // If the loop finished and no duplicate was found, this is the first one
            if (!hasDuplicate) {
                return arr[i];
            }
        }

        // If all elements repeat, return 0
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        System.out.println(hello(arr)); // Output: 3
    }
}
