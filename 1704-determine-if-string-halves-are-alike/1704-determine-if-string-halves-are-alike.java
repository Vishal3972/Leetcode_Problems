class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count=0;
        s=s.toLowerCase();
        // for(int i=0;i<n/2;i++){
        //     if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
        //         count++;
        //     }
        // }
        // for(int i=n/2;i<n;i++){
        //     if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
        //         count--;
        //     }
        // }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                if(i<n/2){count++;}
                else{count--;}
            }
        }
        return count==0;
    }
}