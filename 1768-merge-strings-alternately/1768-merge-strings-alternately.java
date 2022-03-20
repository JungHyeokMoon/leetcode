class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length=word1.length();
        int word2Length=word2.length();
        int minLength=Math.min(word1Length, word2Length);
        char[] answer=new char[word1Length+word2Length];
        int i=0, j=0;
        for(int k=0; k<minLength*2; k++){
            if(k%2==0 && i<word1Length){
                answer[k]=word1.charAt(i++);
            }
            else if(k%2!=0 && j<word2Length){
                answer[k]=word2.charAt(j++);
            }
        }
        
        int index=minLength*2;
        for(int k=i; k<word1Length; k++){
            answer[index++]=word1.charAt(k);
        }
        for(int k=j; k<word2Length; k++){
            answer[index++]=word2.charAt(k);
        }
        
        return new String(answer);
    }
}