class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int answer=nums[n-1]-nums[0];
        int right=nums[n-1]-k;
        int left=nums[0]+k;
        
        for(int i=0; i<n-1; i++){
            int max=Math.max(nums[i]+k,right);
            int min=Math.min(nums[i+1]-k, left);
            answer=Math.min(answer, max-min);
        }
        
        return answer;
    }
}