class Solution {
    class Item{
        int wt,val;
        Item(int w, int v){
            wt=w;
            val=v;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n =val.length;
        Item[] arr=new Item[n];
        
        for(int i=0;i<n;i++){
        
            arr[i]=new Item(wt[i],val[i]);
        }
        Arrays.sort(arr,(a,b)->(b.val*a.wt)-(a.val*b.wt));
        double res=0.0;
        for(int i=0;i<n;i++){
            if(arr[i].wt<=capacity){
                res+=arr[i].val;
                capacity-=arr[i].wt;
            }else{
                res+= arr[i].val*((double)capacity/arr[i].wt);
                break;
            }
        }
        return res;
    }
}