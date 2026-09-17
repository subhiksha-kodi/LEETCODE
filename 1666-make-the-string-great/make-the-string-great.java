class Solution {
    public String makeGood(String s) {
        StringBuilder str=new StringBuilder();

        for (char ch:s.toCharArray()){
            if (str.length()>0 && Character.toLowerCase(str.charAt(str.length()-1))==Character.toLowerCase(ch) && str.charAt(str.length()-1)!=ch){
                str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}