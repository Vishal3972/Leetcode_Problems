class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int sum, count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        for (int c1 = 0; c1 < m; c1++) {
            for (int c2 = c1; c2 < m; c2++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                sum = 0;

                for (int i = 0; i < n; i++) {
                    sum += matrix[i][c2] - (c1 > 0 ? matrix[i][c1 - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return count;
    }
}