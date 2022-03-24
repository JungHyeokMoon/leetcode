class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        
        int nonEqualIndex=1;
        while(nonEqualIndex<nums.length){
            if(nums[nonEqualIndex-1]!=nums[nonEqualIndex]){
                break;
            }
            nonEqualIndex++;
        }
        
        if(nonEqualIndex==nums.length){
            return true;
        }
        
        int diff=nums[nonEqualIndex]-nums[nonEqualIndex-1];
        
        if(diff>0){
            
            for(int i=nonEqualIndex; i<nums.length; i++){
                if(nums[i]-nums[i-1]<0){
                    return false;
                }
            }
            
        }else{
            for(int i=nonEqualIndex; i<nums.length; i++){
                if(nums[i]-nums[i-1]>0){
                    return false;
                }
            }
        }
        
        return true;
    }
}