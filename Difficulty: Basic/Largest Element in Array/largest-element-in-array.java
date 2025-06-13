class Solution {
    public static int largest(int[] arr) {
        // code here
        int large = arr[0];
        for (int i : arr) {
            if (i > large) {
                large = i;
            }
        }
        return large;
    }
}
