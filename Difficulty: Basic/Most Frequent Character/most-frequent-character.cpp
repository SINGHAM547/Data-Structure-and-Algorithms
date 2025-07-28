

class Solution {
  public:
    char getMaxOccuringChar(string& s) {
        vector<int> freq(26, 0); 

        for (char c : s) {
            freq[c - 'a']++;
        }
        int maxFreq = 0;
        char result = 'z'; 

        for (int i = 0; i < 26; ++i) {
            if (freq[i] > maxFreq || (freq[i] == maxFreq && i + 'a' < result)) {
                maxFreq = freq[i];
                result = i + 'a';
            }
        }
        return result;
    }

};
