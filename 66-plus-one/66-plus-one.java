class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list=new ArrayList<>();
        
        int sum=0;
        int carry=0;
        for(int i=digits.length-1; i>=0; i--){
            if(i==digits.length-1){
                sum=digits[i]+1;
            }else{
                sum=digits[i]+carry;
            }
            carry=sum/10;
            sum=sum%10;
            
            list.add(sum);
        }
        
        if(carry!=0){
            list.add(carry);
        }
        Collections.reverse(list);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}