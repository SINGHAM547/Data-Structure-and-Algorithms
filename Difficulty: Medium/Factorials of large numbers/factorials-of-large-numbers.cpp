// User function template for C++

class Solution {
  public:
    vector<int> factorial(int n) {
        vector<int> result = {1}; 
        
        for (int i = 2; i <= n; ++i) {
            int carry = 0;
            for (int j = 0; j < result.size(); ++j) {
                int product = result[j] * i + carry;
                result[j] = product % 10;
                carry = product / 10;    
            }
            
            while (carry) {
                result.push_back(carry % 10);
                carry /= 10;
            }
        }
        
        reverse(result.begin(), result.end());
        return result;
    }
};
