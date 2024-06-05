class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        List<String> list = new ArrayList<>();
        
        int commonCharacters[] = new int[26];
        int currentCharacters[] = new int[26];
        
        for(int i=0;i<words[0].length();i++){
           commonCharacters[words[0].charAt(i)-'a']++;
        }
        
        for(int i=1;i<n;i++){
            Arrays.fill(currentCharacters,0);
            
            for(char c:words[i].toCharArray()){
                currentCharacters[c-'a']++;
            }
            
            for(int j=0;j<26;j++){
                commonCharacters[j]=Math.min(commonCharacters[j],currentCharacters[j]);
            }
        }
        for(int j=0;j<26;j++){
            for(int i=0;i<commonCharacters[j];i++){
                list.add(String.valueOf((char)(j+'a')));
            }
        }
        return list;
    }
}