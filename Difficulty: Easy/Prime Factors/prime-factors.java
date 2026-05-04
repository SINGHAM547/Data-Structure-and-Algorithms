class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(n%2==0){
            ans.add(2);
            while(n%2==0){
            n=n/2;
            }
        }
        if(n%3==0){
            ans.add(3);
            while(n%3==0){
            n=n/3;
            }
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0){
                ans.add(i);
                while(n%i==0){
                n=n/i;
                }
            }
            if(n%(i+2)==0){
                ans.add(i+2);
                while(n%(i+2)==0){
                n=n/(i+2);
                }
            }
        }
        if(n>3){
            ans.add(n);
        }
        return ans;
    }
}