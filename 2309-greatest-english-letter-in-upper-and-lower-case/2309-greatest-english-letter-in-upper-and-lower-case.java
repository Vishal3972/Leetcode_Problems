class Solution {
    public String greatestLetter(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                list.add(c);
            }
        }
        String output="";
        Collections.sort(list);
        for(char c:list){
            int i=0;
            while(i<s.length()){
                if(s.charAt(i)-c==32){
                    output=Character.toString(c);
                }
                i++;
            }
        }
        System.out.println(output);
        return output;
    }
}