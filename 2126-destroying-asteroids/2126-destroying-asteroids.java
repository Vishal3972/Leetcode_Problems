class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long ans = (long)mass;
        for(int i: asteroids){
            if(ans >= i){
                ans += i;
            }else{
                return false;
            }
        }
        return true;
    }
}