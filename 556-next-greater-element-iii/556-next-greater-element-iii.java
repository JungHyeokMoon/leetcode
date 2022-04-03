class Solution {
    public int nextGreaterElement(int n) {
        char[] chars = Integer.toString(n).toCharArray();

        int i = chars.length - 2;
        StringBuilder stringBuilder = new StringBuilder();
        while (i>=0 && chars[i]>=chars[i+1]){
            i--;
        }

        if(i==-1){
            return -1;
        }

        int j = chars.length - 1;
        while (chars[j]<=chars[i]){
            j--;
        }

        swap(chars,i,j);

        for(int k=0; k<=i; k++){
            stringBuilder.append(chars[k]);
        }

        for(int k= chars.length-1; k>i; k--){
            stringBuilder.append(chars[k]);
        }

        long answer = Long.parseLong(stringBuilder.toString());

        if(answer>Integer.MAX_VALUE){
            return -1;
        }
        return (int) answer;
    }

    private void swap(char[] array, int i, int j){
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}