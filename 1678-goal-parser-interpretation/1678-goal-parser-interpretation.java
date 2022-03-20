class Solution {
    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray=command.toCharArray();
        for(int i=0; i<charArray.length; i++){
            char c = charArray[i];
            if(c=='G'){
                stringBuilder.append(c);
            }
            else if(c==')'){
                if(charArray[i-1]=='('){
                    stringBuilder.append('o');
                }
                else{
                    stringBuilder.append("al");
                }
            }
        }
        
        return stringBuilder.toString();
    }
}