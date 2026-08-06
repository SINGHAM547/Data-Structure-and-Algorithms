class Solution {
    static HashMap<String,Integer>map;
    static int countWays(String s) {
        map = new HashMap<>();
        return solve(s,0,s.length()-1,true);
    }
    static int solve(String s, int i, int j, boolean isTrue){
        if(i>j)return 0;
        if(i==j){
            if(isTrue){
                return s.charAt(i)=='T'?1:0;
            }else{
                return s.charAt(i)=='F'?1:0;
            }
        }
        String temp = Integer.toString(i);
        temp+=" ";
        temp+=Integer.toString(j);
        temp+=" ";
        temp+=Boolean.toString(isTrue);
        
        if(map.containsKey(temp)){
            return map.get(temp);
        }
        int ans = 0;
        for(int k=i+1;k<j;k+=2){
            int LT = solve(s,i,k-1,true);
            int LF = solve(s,i,k-1,false);
            int RT = solve(s,k+1,j,true);
            int RF = solve(s,k+1,j,false);
            
            if(s.charAt(k)=='&'){
                if(isTrue){
                    ans += LT*RT;
                }else{
                    ans+= LT*RF+LF*RT+LF*RF;
                }
            }
            if(s.charAt(k)=='|'){
                if(isTrue){
                    ans+= LT*RT+LT*RF+LF*RT;
                }else{
                    ans += LF*RF;
                }
            }
            if(s.charAt(k)=='^'){
                if(isTrue){
                    ans+= LT*RF+LF*RT;
                }else{
                    ans += LT*RT+LF*RF;
                }
            }
        }
        map.put(temp,ans);
        return ans;
    }
}