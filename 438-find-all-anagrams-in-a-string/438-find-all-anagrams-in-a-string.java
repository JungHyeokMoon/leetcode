class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] sArray=s.toCharArray();
        char[] pArray=p.toCharArray();

        int sLength=sArray.length;
        int pLength=pArray.length;

        List<Integer> answer=new ArrayList<>();
        if(sLength<pLength){
            return answer;
        }

        Map<Character, Integer> pMap=new HashMap<>();
        Map<Character, Integer> sMap=new HashMap<>();
        for(int i=0; i<pLength; i++){
            sMap.compute(sArray[i],(k,v)->v==null ? 1 : v+1);
            pMap.compute(pArray[i],(k,v)->v==null ? 1 : v+1);
        }

        int i=0;
        int j=pLength;
        while(j<sLength){
            if(sMap.equals(pMap)){
                answer.add(i);
            }
            sMap.compute(sArray[i++],(k,v)-> v==1 ? null : v-1);
            sMap.compute(sArray[j++],(k,v)-> v==null ? 1 : v+1);
        }
        
        if(sMap.equals(pMap)){
            answer.add(i);
        }

        return answer;
    }
}