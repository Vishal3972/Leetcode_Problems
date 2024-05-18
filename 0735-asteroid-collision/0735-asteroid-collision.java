class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            
            while(!st.isEmpty() && st.peek()>0 && i<0){
                int sum = i+st.peek();
                if(sum<0){
                    st.pop();
                }else if(sum>0){
                    i=0;
                }else{
                    st.pop();
                    i=0;
                }
            }   
            
            if(i!=0){
                st.push(i);
            }
            
            
        }
        int arr[] = new int[st.size()];
        int idx = st.size()-1;
        while(!st.isEmpty()){
            arr[idx--] = st.pop();
        }
        return arr;
    }
}