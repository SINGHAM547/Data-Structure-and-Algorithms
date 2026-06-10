class Solution {
    public static int getMaxArea(int arr[]) {
        int max=0;
        int ps[]=prevsmaller(arr);
        int ns[]=nextsmaller(arr);
        for(int i=0;i<arr.length;i++){
            int curr=(ns[i]-ps[i]-1)*arr[i];
            max=Math.max(curr,max);
        }
        return max;
    }
    static int[] prevsmaller(int arr[]){
        int ps[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()) ps[i]=-1;
            else ps[i]=s.peek();
            s.push(i);
        }
        return ps;
    }
    static int [] nextsmaller(int arr[]){
        int ns[]=new int [arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) ns[i]=arr.length;
            else ns[i]=s.peek();
            s.push(i);
        }
        return ns;
    }
}
