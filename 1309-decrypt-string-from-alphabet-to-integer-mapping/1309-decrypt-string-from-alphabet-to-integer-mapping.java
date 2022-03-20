class Solution {
    public String freqAlphabets(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        int i=s.length()-1;
        
        int v=0;
        while(i>=0){
            if(s.charAt(i)=='#'){
                v=Integer.parseInt(s.substring(i-2,i))-1;
                i-=3;
            }else{
                v=s.charAt(i)-'0'-1;
                i--;    
            }
            
            stringBuilder.append((char)('a'+v));
        }
        
        return stringBuilder.reverse().toString();
    }
}