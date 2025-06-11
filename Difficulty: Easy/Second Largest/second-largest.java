class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>seclargest){
                seclargest = arr[i];
            }
        }if(seclargest == Integer.MIN_VALUE){
            return -1;
        }else{
            return seclargest;
        }
    }
}