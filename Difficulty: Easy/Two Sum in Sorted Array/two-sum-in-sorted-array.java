import java.util.*;

class Solution {

    public ArrayList<Integer> twoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                ans.add(left + 1);   
                ans.add(right + 1);

                return ans;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }
        ans.add(-1);
        ans.add(-1);

        return ans;
    }
}