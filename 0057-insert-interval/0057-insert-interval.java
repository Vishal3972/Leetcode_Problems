
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int start = newInterval[0], end = newInterval[1];
        boolean inserted = false;
        
        for (int[] arr : intervals) {
            int a = arr[0], b = arr[1];
            
            if (b < start || inserted) {
                ans.add(new int[]{a, b});
                continue;
            }
            
            start = Math.min(start, a);
            if (end < a) {
                ans.add(new int[]{start, end});
                ans.add(new int[]{a, b});
                inserted = true;
                continue;
            }
            
            if (end <= b) {
                ans.add(new int[]{start, b});
                inserted = true;
            }
        }
        
        if (!inserted) {
            ans.add(new int[]{start, end});
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}