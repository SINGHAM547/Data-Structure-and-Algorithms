class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<m&&j<n){
            if(i>0&& a[i]==a[i-1]) {
                i++;
                continue;
            }if(j>0&& b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]>b[j]){
                ans.add(b[j]);
                j++;
            }else if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
       while(i<m){
           if(i==0||a[i]!=a[i-1]){
               ans.add(a[i]);
           }
           i++;
       }while(j<n){
           if(j==0|| b[j]!=b[j-1]){
               ans.add(b[j]);
           }
           j++;
       }
        
        return ans;
    }
}
