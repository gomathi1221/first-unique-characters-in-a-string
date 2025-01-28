class Solution {
    public int firstUniqChar(String s) {
        boolean a=false;
        for(int i=0;i<s.length();i++){
            a=false;
            for(int j=0;j<s.length();j++){
                if(i!=j&&s.charAt(i)==s.charAt(j)){
                    a=true;
                    break;
                }
            }
            if(a==false){
                return i;
            }
        }
        return -1;

    }
}