class Solution {
    public int maxProductDifference(int[] nums) {
        int bigger=0;
        int secondbigger=0;
        int smaller=Integer.MAX_VALUE;
        int secondsmaller=Integer.MAX_VALUE;
        
        for(int i:nums){
            if(i>bigger){
                secondbigger=bigger;
                bigger=i;
            }else{
                secondbigger=Math.max(secondbigger,i);
            }
            
            if(i<smaller){
                secondsmaller=smaller;
                smaller=i;
            }else{
                secondsmaller=Math.min(secondsmaller,i);
            }
        }
        
        return bigger*secondbigger-smaller*secondsmaller;
    }
}