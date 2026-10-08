class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int zero1=0, zero2=0;
        long sum1=0, sum2=0;

        for (int n:nums1){
            sum1+=n;
            if (n==0) zero1++;
        }

        for (int n:nums2){
            sum2+=n;
            if (n==0) zero2++;
        }

        long minSum1=sum1+zero1;
        long minSum2=sum2+zero2;

        if (minSum1==minSum2){
            return minSum1;
        }
        else if (minSum1<minSum2){
            return zero1>0?minSum2:-1;
        }
        return zero2>0?minSum1:-1;
    }
}