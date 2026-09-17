class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for (int i=0;i<apple.length;i++){
            sum+=apple[i];
        }

        int count=0;
        int temp=0;
        Arrays.sort(capacity);

        for (int i=capacity.length-1;i>=0;i--){
            temp+=capacity[i];
            count++;
            if (temp>=sum){
                return count;
            }
        }

        return count;
    }
}