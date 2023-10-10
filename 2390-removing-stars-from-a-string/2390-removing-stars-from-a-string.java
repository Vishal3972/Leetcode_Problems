class Solution {
    public String removeStars(String s) {
        // String str ="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='*'){
        //         str=str.substring(0,str.length()-1);
        //     }else{
        //         str+=s.charAt(i);
        //     }
        // }
        // return str;
        
        // #BETTER APPROACH
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder("");
        for(char i:s.toCharArray()){
            if(i!='*'){
                stack.push(i);
            }
            else{
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            ans=ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}