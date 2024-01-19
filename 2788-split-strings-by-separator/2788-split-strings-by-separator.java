class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        
        for(String word:words){
            StringBuffer str = new StringBuffer();
            for(char c:word.toCharArray()){
                if(c != separator){
                    str.append(c);
                }else if(!str.isEmpty()){
                    ans.add(str.toString());
                    str = new StringBuffer();
                }
            }
            if(!str.isEmpty()){
                ans.add(str.toString());
            }
        }   
        return ans;
    }
}