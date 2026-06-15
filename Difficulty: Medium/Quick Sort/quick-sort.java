class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=i+1;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
            return i+1;
    }
    void swap(int []arr, int low , int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}