class Solution {
    public void rotate(int[][] matrix) {
        for (int r = 0, n = matrix.length - 1; r <= n / 2; r++) {
            for (int c = r; c < n - r; c++) {
                int copy = matrix[r][c];
                matrix[r][c] = matrix[n - c][r];
                matrix[n - c][r] = matrix[n - r][n - c];
                matrix[n - r][n - c] = matrix[c][n - r];
                matrix[c][n - r] = copy;
            }
        }
    }
}