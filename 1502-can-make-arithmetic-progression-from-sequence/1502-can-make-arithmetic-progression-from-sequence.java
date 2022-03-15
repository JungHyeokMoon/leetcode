class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diffA=arr[0]-arr[1];
        int diffB=arr[1]-arr[0];
        
        for(int i=2; i<arr.length; i++){
            int tempDiffA=arr[i-1]-arr[i];
            int tempDiffB=arr[i]-arr[i-1];
            
            if(!(tempDiffA==diffA && tempDiffB==diffB)){
                return false;
            }
        }
        
        return true;
    }
}