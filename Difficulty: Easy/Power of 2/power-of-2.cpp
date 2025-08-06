// User function Template for C++

class Solution {
  public:
    // Function to check if given number n is a power of two.
    bool isPowerofTwo(int n) {
        // code here
        int ans = 1;
        for(int i =0; i<=30; i++){
            if (ans == n)
            {
                return true;
                
            }
            if(ans<INT_MAX/2)
            ans = ans*2;
            
        }
        return false;
    }
};
