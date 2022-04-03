class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String str : strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String sortedStr=new String(chars);
            map.compute(sortedStr, (k, v) -> v == null ? new ArrayList<>() : v).add(str);
        }
        return new ArrayList<>(map.values());

    }   
}