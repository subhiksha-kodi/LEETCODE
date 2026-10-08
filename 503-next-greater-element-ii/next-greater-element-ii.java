class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        Arrays.fill(ans,-1);
        for (int i=0;i<2*n;i++){
            while (!stack.isEmpty() && nums[i%n]>nums[stack.peek()]){
                ans[stack.peek()]=nums[i%n];
                stack.pop();
            }
            stack.push(i%n);
        }
        return ans;
    }
}