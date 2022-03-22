class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map= new HashMap<>();
        for(char c : s.toCharArray()){
            map.compute(c,(k,v)->v==null ? 1 :v+1);
        }
        
        for(char c: t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.compute(c,(k,v)->v==1 ? null : v-1);
        }
        
        return map.size()==0;
    }
}