import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> resultlist = new ArrayList<>();
        backtrack(resultlist, new ArrayList<>(), arr, 0);
        return resultlist;
    }

    private void backtrack(ArrayList<ArrayList<Integer>> resultsets, 
                           ArrayList<Integer> tempSet, 
                           int arr[], int start) {

        resultsets.add(new ArrayList<>(tempSet));

        for (int i = start; i < arr.length; i++) {
            tempSet.add(arr[i]);                                 
            backtrack(resultsets, tempSet, arr, i + 1);
            tempSet.remove(tempSet.size() - 1);        
        }
    }
}