class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = Collections.max(map.values());
        int sum = 0;
        for (int frequency : map.values()) {
            if (frequency == maxFrequency) {
                sum += frequency;
            }
        }
        
        return sum;
    }
}
