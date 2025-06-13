class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left = 0, right = arr.length - 1;
        while (left < right){
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}
