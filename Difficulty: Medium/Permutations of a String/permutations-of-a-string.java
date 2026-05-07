class Solution {
    public ArrayList<String> findPermutation(String s) {

        ArrayList<String> result = new ArrayList<>();

        permute(s.toCharArray(), 0, result);

        Collections.sort(result);

        return result;
    }

    void permute(char[] arr, int index, ArrayList<String> result) {

        if(index == arr.length) {
            result.add(new String(arr));
            return;
        }

        HashSet<Character> set = new HashSet<>();

        for(int i = index; i < arr.length; i++) {

            if(set.contains(arr[i]))
                continue;

            set.add(arr[i]);

            swap(arr, index, i);

            permute(arr, index + 1, result);

            swap(arr, index, i);
        }
    }

    void swap(char[] arr, int i, int j) {

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}