class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int product=1;
        
        int answer=0;
        while(j<n){
            product*=nums[j];
            while(i<=j && product>=k){
                product/=nums[i++];
            }
            answer+=(j-i+1);
            j++;
        }
        
        return answer;
    }
}