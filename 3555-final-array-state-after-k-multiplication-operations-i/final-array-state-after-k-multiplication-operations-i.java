class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        int index=0;
        for (int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            for (int j=n-1;j>=0;j--){
                if (nums[j]<=min){
                    min=nums[j];
                    index=j;
                }
            }
            nums[index]=nums[index]*multiplier;
        }
        return nums;
    }
}