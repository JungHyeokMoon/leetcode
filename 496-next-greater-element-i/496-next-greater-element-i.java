class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer=new int[nums1.length];
        Map<Integer, Integer> map= new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i]=map.getOrDefault(nums1[i],-1);
        }
        return answer;
    }
}