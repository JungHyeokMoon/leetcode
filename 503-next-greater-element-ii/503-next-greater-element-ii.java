class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] answer=new int[n];
        Arrays.fill(answer,-1);
        for(int i=0; i<2*n ; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n]) {
                answer[stack.pop()]=nums[i%n];
            }
            stack.add(i%n);
        }
        
        return answer;
    }
}