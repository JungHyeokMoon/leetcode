class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map=new HashMap<>();
        for(char c : t.toCharArray()){
            map.compute(c, (k,v) -> v==null ? 1 : v+1);
        }
        for(char c : s.toCharArray()){
            map.compute(c, (k,v) -> v==1 ? null :v-1);
        }
        return map.keySet().stream().findFirst().get();
    }
}