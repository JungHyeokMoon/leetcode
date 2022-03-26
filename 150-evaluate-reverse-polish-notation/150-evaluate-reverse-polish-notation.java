class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(var token : tokens){
            if(token.equals("+") || token.equals("*") || token.equals("-") || token.equals("/")){
                int first=stack.pop();
                int second=stack.pop();

                if(token.equals("+")){
                    stack.add(first+second);
                }
                else if(token.equals("-")){
                    stack.add(second-first);
                }else if(token.equals("*")){
                    stack.add(first*second);
                }else{
                    stack.add(second/first);
                }
            }
            else{
                stack.add(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}