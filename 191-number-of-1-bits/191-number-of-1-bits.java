public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int answer=0;
        for(int i=0; i<32; i++){
            answer+=(n&1);
            n=n>>1;
        }
        return answer;
    }
}