class Solution {
    public char repeatedCharacter(String s) {
        int[] freq=new int[26];

        for (char ch:s.toCharArray()){
            freq[ch-'a']++;
            for (int i=0;i<26;i++){
                if (freq[ch-'a']==2){
                    return (char)('a'+(ch-'a'));
                }
            }
        }
        return ' ';
    }
}