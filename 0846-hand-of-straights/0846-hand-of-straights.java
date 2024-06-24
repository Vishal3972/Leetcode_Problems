class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i:hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while (map.size() > 0) {
            int cur = map.entrySet().iterator().next().getKey();
            for (int i = 0; i < groupSize; i++) {
                if (!map.containsKey(cur + i)) return false;
                map.put(cur + i,map.get(cur + i) - 1);
                if (map.get(cur + i) == 0) map.remove(cur+i);
            }
        }
        return true;
    }
}