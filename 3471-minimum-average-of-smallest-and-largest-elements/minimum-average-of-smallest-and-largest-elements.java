class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int left=0;
        int right=n-1;

        while (left<right){
            double avg=((double)nums[right]+(double)nums[left])/2;
            min=Math.min(min,avg);
            left++;
            right--;
        }
        return min;
    }
}