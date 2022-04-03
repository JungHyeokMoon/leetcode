class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {   
        int count=0;
        int n=mat.length;
        while(true){
            if(match(mat,target,n)){
                return true;
            }
            
            if(count==3){
                return false;
            }
            
            count++;
            rotate(mat);
        }
    }
    
    private boolean match(int[][] mat1, int[][] mat2, int n){
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               if(mat1[i][j]!=mat2[i][j]){
                   return false;
               }
           }
        }
        return true;
    }
    
    private void rotate(int[][] matrix) {
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