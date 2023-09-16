class Solution {
    public int mostWordsFound(String[] sentences) {
        int cnt = 1;
        int max = 1;
        for(int i=0; i<sentences.length; i++){
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j)==' '){
                    cnt++;
                }
            }
            if(cnt > max){
                max = cnt;
            }
            cnt = 1;
        }
        return max>cnt?max:cnt;
    }
}