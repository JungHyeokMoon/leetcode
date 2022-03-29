class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new LinkedList<>();
        
        int carry=0;
        
        int i=num.length-1;
        
        while(i>=0 && k!=0){
            int sum=carry+num[i--]+k%10;
            carry=sum/10;
            sum=sum%10;
            k=k/10;
            list.add(0,sum);
        }
        
        while(i>=0){
            int sum=carry+num[i--];
            carry=sum/10;
            sum=sum%10;
            k=k/10;
            list.add(0,sum);
        }
        
        while(k!=0){
            int sum=carry+k%10;
            carry=sum/10;
            sum=sum%10;
            k=k/10;
            list.add(0,sum);
        }
        
        if(carry!=0){
            list.add(0,carry);
        }
        
        return list;
    }
}