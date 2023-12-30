class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuffer str = new StringBuffer("");
        int i=0;
        Collections.sort(dictionary);
        while(i<sentence.length()){
            int k=i;
            while(i<sentence.length() && sentence.charAt(i)!=' '){
                i++;
            }
            boolean b=false;
            for(String word:dictionary){
                if((sentence.substring(k,i).startsWith(word))){
                    str.append(word);
                    b=true;
                    break;
                }
            }
            if(!b){
                str.append(sentence.substring(k,i));
            }
            str.append(" ");
            i++;
        }
            
        return str.toString().trim();
    }
}
