class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        int max=Arrays.stream(arr).max().getAsInt();
        int answer=arr[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]>answer){
                answer=arr[i];
                count=1;
            }else{
                count++;
            }
            if(count>=k || answer==max){
                return answer;
            }
        }
        return answer;
    }
}