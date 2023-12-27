class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalMinTime = 0;
        int n = colors.length();

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {

                int prevTime = neededTime[i - 1];
                int currentTime = neededTime[i];
                totalMinTime += Math.min(prevTime, currentTime);

                neededTime[i] = Math.max(prevTime, currentTime);
            }
        }

        return totalMinTime;
    }
}