class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n =arr.length;
        int count=0;
        int ans=0;
        int i=0,j=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                ans =Math.max(ans,count);
                i++;
            }else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return ans;
    }
}
