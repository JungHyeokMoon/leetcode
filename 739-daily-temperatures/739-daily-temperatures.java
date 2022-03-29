class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack=new Stack<>();
        int[] answer=new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && stack.peek().value<temperatures[i]){
                Pair pop=stack.pop();       
                answer[pop.index]=i-pop.index;
            }
            stack.add(new Pair(i, temperatures[i]));
        }
        
        return answer;
    }
    
    static class Pair{
        int index;
        int value;
        
        Pair(int index, int value){
            this.index=index;
            this.value=value;
        }
    }
}