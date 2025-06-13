class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        int large = -1, SecondLarge = -1;
        
        for(int i = 0; i < n; i++) {
            if (arr[i] > large) {
                SecondLarge = large;
                large = arr[i];
            }
            else if (arr[i] > SecondLarge && arr[i] != large) {
                SecondLarge = arr[i];
            }
        }
        return SecondLarge;
    }
}