// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int l = 0, r = arr.length - 1;
        
        while (l <= r){
            
            int m = (l + r) / 2;
            
            if(arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return (arr[m]);
            } else if (arr[m] < arr[m + 1] && arr[m] > arr[m - 1]) {
                l = m;
            } else if (arr[m] > arr[m + 1] && arr[m] < arr[m - 1]) {
                r = m + 1;
            }
            m = r / 2;
        }
        return (arr[r]);
        
    }
}