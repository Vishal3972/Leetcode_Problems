class Solution {
    public boolean checkRecord(String s) {
       // if(s.contains("LLL")){
       //     return false;
       // }
       // if(s.contains("AA")){
       //     return false;
       // }
       // return true;
        
        return !s.matches(".*LLL.*|.*A.*A.*");
    }
}