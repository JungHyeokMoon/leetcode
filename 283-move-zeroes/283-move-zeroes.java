class Solution {
    public void moveZeroes(int[] nums) {
        int i=0, j=0;
        while(i!=nums.length && j!=nums.length){
            if (nums[i]==0 && nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            } else if(nums[i]==0 && nums[j]==0){
                j++;
            } else {
                i++;
                j++;
            } 
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}