class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int min=Integer.MAX_VALUE;
        // boolean mark=false;
        // for(int i=0;i<nums.length-1;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //             min=Math.min(min,j-i+1);
        //             mark=true;
        //             break;
        //         }         
        //     }
        // }
        // return mark?min:0;
        
        
        int len=Integer.MAX_VALUE,sum=0;
        int i=0,j=0;
        boolean mark=false;
        while(j<nums.length){
            sum+=nums[j];
            if(sum>=target){
                 while (sum >= target) {
                    mark = true;
                    len = Math.min(len, (j - i + 1));
                    sum -= nums[i];
                    i++;
                }
            }
            j++;
        }
        return mark?len:0;
    }
}