class Solution {
    public String largestGoodInteger(String num) {
        for (int i=9;i>=0;i--){
            for (int j=0;j<=num.length()-3;j++){
                if (num.substring(j,j+3).equals(""+i+i+i)){
                    return ""+i+i+i;
                }
            }
        }
        return "";
    }
}