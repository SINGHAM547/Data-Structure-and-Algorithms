
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n =arr.length;
        int start = 0;
        long sum=0;
        for(int end=0;end<n;end++){
            sum += arr[end];
            while(sum>target &&start <=end){
                sum -= arr[start];
                start++;
            }
            if(sum == target){
                if(target==0 && start>end){
                    continue;
                }
                ArrayList<Integer> result = new ArrayList<>();
                result.add(start+1);
                result.add(end+1);
                return result;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }
}
