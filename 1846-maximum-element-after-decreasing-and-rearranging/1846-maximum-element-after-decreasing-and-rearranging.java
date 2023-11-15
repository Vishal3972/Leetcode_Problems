class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=1){
            return arr.length;
        }

        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1]<=1)){
                continue;
            }else if(arr[i]!=arr[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }

        return arr[arr.length-1];
    }
}