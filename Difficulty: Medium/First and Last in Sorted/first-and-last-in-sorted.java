class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int left=0,right = arr.length-1;
        list.add(-1);
        list.add(-1);
        while(left<=right){
            if(arr[left]==x && arr[right]==x){
                list.add(0,left);
                list.add(1,right);
                break;
            }
            if(arr[left]!=x) left++;
            if(arr[right]!=x) right--;
        }
        return list;
    }
}
