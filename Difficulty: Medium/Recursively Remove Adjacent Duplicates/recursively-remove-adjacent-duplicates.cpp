// User function template for C++

class Solution {
  public:
    string removeUtil(string &s) {
    
    if (s.length() <= 1) return s;
    string result = "";
    bool hasDuplicates = false;
  
    for (size_t i = 0; i < s.length();) {
        if (i < s.length() - 1 && s[i] == s[i + 1]) {
            hasDuplicates = true;
          
            while (i < s.length() - 1 && s[i] == s[i + 1]) {
                i++;
            }
            i++;
        } else {
            result += s[i];
            i++;
        }
    }
    
    if (hasDuplicates) {
        return removeUtil(result);
    }
    return result;
  } 
};
