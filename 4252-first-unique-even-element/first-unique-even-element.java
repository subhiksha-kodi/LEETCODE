class Solution {
    public int firstUniqueEven(int[] nums) {
        boolean flag;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                flag=true;
                for (int j=0;j<nums.length;j++){
                    if (i!=j && nums[i]==nums[j]){
                        flag=false;
                        break;
                    }
                }
                if (flag==true){
                    return nums[i];
                }
            }
        }

        return -1;
    }
}