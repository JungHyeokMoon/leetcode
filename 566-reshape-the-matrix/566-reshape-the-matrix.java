class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(n*m!=r*c){
            return mat;
        }
        
        int[][] reshapeMatrix=new int[r][c];
        
        for(int i=0; i<r*c ; i++){
            reshapeMatrix[i/c][i%c]=mat[i/m][i%m];
        }
        
        return reshapeMatrix;
    }
}