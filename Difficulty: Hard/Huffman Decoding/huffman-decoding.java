// class MinHeapNode
// {
//     char data;
//     int freq;
//     MinHeapNode left, right, top;
//     MinHeapNode(char c, int freq)
//     {
//         left = right = null;
//         this.data = c;
//         this.freq = freq;
//     }
class Solution {
    public String huffDecode(MinHeapNode root, String binaryString) {

        if (root.left == null && root.right == null) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < binaryString.length(); i++) {
                ans.append(root.data);
            }
            return ans.toString();
        }
        StringBuilder ans = new StringBuilder();
        MinHeapNode curr = root;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0')
                curr = curr.left;
            else
                curr = curr.right;
            if (curr.left == null && curr.right == null) {
                ans.append(curr.data);
                curr = root;
            }
        }
        return ans.toString();
    }
}