class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int i=0, j=n-1;
        
        int answer=0;
        for(int k=0; k<n; k++){
            answer=answer+mat[k][i++]+mat[k][j--];
        }
        
        if(n%2!=0){
            answer=answer-mat[n/2][n/2];
        }
        
        return answer;
    }
}