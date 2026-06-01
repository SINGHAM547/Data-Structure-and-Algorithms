class Solution {
    public int findPages(int[] arr, int k) {
        int sum=0,mx=0;
        if(k>arr.length) return -1;
        int n= arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int low = mx, high = sum,res=0;
        while(low<=high){
            int mid  = (low+high)/2;
            if(isfeasible(arr,n,k,mid)){
                res =mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    boolean isfeasible(int[] arr, int n, int k, int ans){
        n = arr.length;
        int req=1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return(req<=k);
    }
}