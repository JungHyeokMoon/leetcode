class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> map=new HashMap<>();
        for(String str : strs){
            Map<Character, Integer> countMap=new HashMap();
            for(char c : str.toCharArray()){
                countMap.compute(c,(k,v)-> v==null ? 1: v+1);
            }
            map.compute(countMap, (k, v) -> v == null ? new ArrayList<>() : v).add(str);
        }
        List<List<String>> answer = new ArrayList<>(map.values());
        return answer;
    }   
}