class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        for (int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }

        return k*(max-min);
    }
}