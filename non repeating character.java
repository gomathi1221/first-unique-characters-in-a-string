class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
       for(int i=0;i<s.length();i++){
           boolean a=false;
           for(int j=0;j<s.length();j++){
               if(i!=j&&s.charAt(i)==s.charAt(j)){
                   a=true;
                   break;
               }
           }
           if(a==false){
               return s.charAt(i);
           }
       }
       return '$';
        
    }
}