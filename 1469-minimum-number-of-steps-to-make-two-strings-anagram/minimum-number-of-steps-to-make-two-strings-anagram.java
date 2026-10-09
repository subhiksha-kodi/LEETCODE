class Solution {
    public int minSteps(String s, String t) {
        int[] fre=new int[26];

        for (int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
            fre[t.charAt(i)-'a']--;
        }
        int count=0;

        for (int x:fre){
            if (x>0) count+=x;
        }
        return count;
    }
}