class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        int f = 0;
        // code here
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                f = 1;
            }
            
        }
        return (f == 0);
    }
}