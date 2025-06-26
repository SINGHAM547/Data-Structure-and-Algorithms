class Solution {
    int floorSqrt(int n) {
        if(n==0 || n==1)
        return n;
        
        int start = 1, end=n,ans=0;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<=n/mid){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}