class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {

                ans.add(arr1[i]);

                i++;
                j++;
            }
        }

        return ans;
    }
}