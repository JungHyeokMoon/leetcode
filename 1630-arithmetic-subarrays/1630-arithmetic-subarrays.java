class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;

        List<Boolean> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int start = l[i];
            int end = r[i];
            List<Integer> list = new ArrayList<>();
            for(int j=start; j<=end; j++){
                list.add(nums[j]);
            }
            answer.add(isArithmetic(list));
        }
        return answer;
    }

    private boolean isArithmetic(List<Integer> list){
        Collections.sort(list);
        int diff = list.get(1) - list.get(0);
        for(int i=2; i<list.size(); i++){
            int tempDiff = list.get(i) - list.get(i - 1);
            if(diff!=tempDiff){
                return false;
            }
        }

        return true;
    }
}