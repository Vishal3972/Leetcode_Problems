class Solution {
    public boolean find132pattern(int[] nums) {
        
    //     for(int i=0;i<nums.length-2; i++){
    //         for(int j=i+1;j<nums.length-1;j++){
    //             for(int k=j+1;k<nums.length;k++){
    //                 if(nums[i]<nums[k] && nums[k]<nums[j]){
    //                     return true;
    //                 }
    //             }
    //         }
    //     }
    //     return false;
        
        

     int n = nums.length-1;
     Stack<Integer> stack = new Stack<>();
     int secondmax = Integer.MIN_VALUE;
     
     for(int j=n;j>=0;j--){
         if(!stack.isEmpty()) {
        if(nums[j]> stack.peek()){
         while(!stack.isEmpty() && nums[j]> stack.peek()){
             int p = stack.pop();
             secondmax = Math.max(p,secondmax);
         }
         }
         else if(!stack.isEmpty() && nums[j]<stack.peek() && nums[j]<secondmax)
             return true;
        stack.push(nums[j]);
         }
        else stack.push(nums[j]);
     }
     return false;
    
    }
}