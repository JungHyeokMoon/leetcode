class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int stringLength=s1.length();
        
        Set<Character> characterOfS1=new HashSet<>();
        Set<Character> characterOfS2=new HashSet<>();
        
        for(int i=0; i<stringLength; i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            
            if(c1!=c2){
                count++;
                characterOfS1.add(c1);
                characterOfS2.add(c2);
            }
        }
        
        if(!(count==2 || count==0)){
            return false;
        }
        else{
            return characterOfS1.equals(characterOfS2);
        }
    }
}