class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int answer=0;
        int[] prefixSum=new int[arr.length+1];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i-1];
        }
        
        for(int i=1; i<prefixSum.length; i+=2){
            
            for(int j=i; j<prefixSum.length; j++){
                answer+=(prefixSum[j]-prefixSum[j-i]);
            }
            
        }
        return answer;
    }
}