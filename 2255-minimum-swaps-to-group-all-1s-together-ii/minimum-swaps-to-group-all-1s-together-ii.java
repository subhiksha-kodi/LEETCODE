class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int ones=0;
        for (int i=0;i<n;i++){
            ones+=nums[i];
        }

        int max=Integer.MIN_VALUE;
        int dupOnes=0;
        for (int i=0;i<ones;i++){
            dupOnes+=nums[i];
        }

        max=Math.max(max,dupOnes);
        for (int i=1;i<2*n;i++){
            dupOnes-=nums[(i-1)%n];
            dupOnes+=nums[(i+ones-1)%n];
            max=Math.max(max,dupOnes);
        }
        return ones-max;
    }
}