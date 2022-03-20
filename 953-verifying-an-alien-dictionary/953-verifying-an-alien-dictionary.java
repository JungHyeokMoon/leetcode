class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] mapping=new int[26];
        for(int i=0; i<mapping.length; i++){
            mapping[order.charAt(i)-'a']=i;
        }
        
        for(int i=1; i<words.length; i++){
            if(bigger(words[i-1],words[i],mapping)){
                return false;
            }
        }
        
        return true;
    }
    
    private boolean bigger(String word1, String word2, int[] mapping){
        int n=word1.length();
        int m=word2.length();
        
        for(int i=0; i<n && i<m; i++){
            char c1=word1.charAt(i);
            char c2=word2.charAt(i);
            
            if(c1!=c2){
                return mapping[c1-'a'] > mapping[c2-'a'];
            }
        }
        
        return n>m;
    }
}