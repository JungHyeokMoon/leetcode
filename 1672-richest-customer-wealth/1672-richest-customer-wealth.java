class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer=Integer.MIN_VALUE;
        for(int[] account : accounts){
            int tempSum=0;
            for(int money : account){
                tempSum+=money;
            }
            answer=Math.max(answer,tempSum);
        }
        
        return answer;
    }
}