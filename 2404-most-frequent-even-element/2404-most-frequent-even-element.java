class Solution {
    public int mostFrequentEven(int[] nums) {
        int mostFrequentEven = -1; 
        int maxCount = 0;           // Initialize count of most frequent even element.
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int currentElement = nums[i];
                int currentCount = 1;
                
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == currentElement) {
                        currentCount++;
                    }
                }
                
                if (currentCount > maxCount || (currentCount == maxCount && currentElement < mostFrequentEven)) {
                    mostFrequentEven = currentElement;
                    maxCount = currentCount;
                }
            }
        }
        
        return mostFrequentEven;
    }
}