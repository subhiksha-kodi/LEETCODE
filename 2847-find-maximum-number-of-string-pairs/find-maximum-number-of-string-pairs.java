class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n=words.length;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                String rev=new StringBuilder(words[j]).reverse().toString();
                if (words[i].equals(rev)) count++;
            }
        }
        return count;
    }
}