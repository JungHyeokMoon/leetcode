class Solution {
    
    private int[] dy = {0,1,0,-1};
    private int[] dx = {1,0,-1,0};
    
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        int count=m*n;
        
        int y=0;
        int x=0;
        int d=0;
        List<Integer> list=new ArrayList<>();
        while(true){
            if(list.size()==count){
                break;
            }
            
            list.add(matrix[y][x]);
            matrix[y][x]=Integer.MIN_VALUE;
            
            int ny=y+dy[d];
            int nx=x+dx[d];
            if(!isInside(ny,nx,m,n) || matrix[ny][nx]==Integer.MIN_VALUE){
                d=(d+1)%4;
                y=y+dy[d];
                x=x+dx[d];
            }else{
                y=ny;
                x=nx;
            }
            
        }
        
        return list;
    }
    
    private boolean isInside(int y, int x, int m, int n){
        return y>=0 && y<m && x>=0 && x<n;
    }
}