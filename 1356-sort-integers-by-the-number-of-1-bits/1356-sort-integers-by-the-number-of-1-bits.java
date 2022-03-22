class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> collect = Arrays.stream(arr).boxed().sorted((o1, o2) -> {
            int zeroCount1 = getZeroCount(o1);
            int zeroCount2 = getZeroCount(o2);
            if(zeroCount1==zeroCount2){
                return o1 - o2;
            }
            return zeroCount1 - zeroCount2;
        }).collect(Collectors.toList());
        return collect.stream().mapToInt(i -> i).toArray();
    }

    private int getZeroCount(int num){
        int count=0;
        while(num!=0){
            if(num%2==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}