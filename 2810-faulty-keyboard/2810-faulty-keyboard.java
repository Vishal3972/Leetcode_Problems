class Solution {
    public String finalString(String s) {
       StringBuilder str = new StringBuilder();
        for(var ch : s.toCharArray()){
            if(ch == 'i'){
                if(str.length() > 0){
                    str.reverse();
                }  
            }else
             str.append(ch);
        }
        return str.toString(); 
    }
}