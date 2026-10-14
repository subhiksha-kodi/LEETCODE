class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder();
        int n=word.length();

        int index=-1;
        for (int i=0;i<n;i++){
            if (word.charAt(i)==ch){
                index=i;
                break;
            }
        }

        for (int i=index;i>=0;i--){
            str.append(word.charAt(i));
        }
        for (int i=index+1;i<n;i++){
            str.append(word.charAt(i));
        }
        return str.toString();
    }
}