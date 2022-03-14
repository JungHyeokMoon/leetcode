class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index=-1;
        int smallestManhattanDistance=Integer.MAX_VALUE;
        for(int i=0; i<points.length; i++){
            if(x==points[i][0] || y==points[i][1]){
                int tempDistance= Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(smallestManhattanDistance > tempDistance){
                    index=i;
                    smallestManhattanDistance=tempDistance;
                }
            }
        }
        return index;
    }
}