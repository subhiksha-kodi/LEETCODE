class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";

        ArrayList<String> res=new ArrayList<>();
        
        for (String word: words){
            int row;
            String w=word.toLowerCase();

            if (row1.indexOf(w.charAt(0))!=-1) row=1;
            else if (row2.indexOf(w.charAt(0))!=-1) row=2;
            else row=3;

            boolean flag=true;

            for (int i=0;i<w.length();i++){
                if (row==1 && row1.indexOf(w.charAt(i))==-1){
                    flag=false;
                    break;
                }

                if (row==2 && row2.indexOf(w.charAt(i))==-1){
                    flag=false;
                    break;
                }

                if (row==3 && row3.indexOf(w.charAt(i))==-1){
                    flag=false;
                    break;
                }
            }

            if (flag == true){
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}