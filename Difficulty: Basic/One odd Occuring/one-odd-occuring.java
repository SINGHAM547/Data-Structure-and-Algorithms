class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res =  res^arr[i];
        }
        return res;
    }
}