class Solution {
    public void sortColors(int[] nums) {
        int n =nums.length;
        int l = 0;
        int m= 0;
        int h = n-1;

        while(m<=h){
            switch(nums[m]){
                case 0:
                    swap(nums,l,m);
                    m++;
                    l++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(nums,m,h);
                    h--;
                    break;
            }
        }
        
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
