class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        while (!map.isEmpty()){
            List<Integer> temp=new ArrayList<>(map.keySet());
            Collections.sort(temp);
            for (int n:temp){
                ans.add(n);
                
                if (map.get(n)==1){
                    map.remove(n);
                }
                else{
                    map.put(n,map.get(n)-1);
                }
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}