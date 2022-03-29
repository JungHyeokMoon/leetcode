class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        
        char[] aArray=a.toCharArray();
        char[] bArray=b.toCharArray();
        
        int carry=0;
        int i=aArray.length-1;
        int j=bArray.length-1;
        
        while(i>=0 && j>=0){
            int sum=carry+(aArray[i--]-'0')+(bArray[j--]-'0');
            carry=sum/2;
            sum=sum%2;
            sb.append(sum);
        }
        
        while(i>=0){
            int sum=carry+(aArray[i--]-'0');
            carry=sum/2;
            sum=sum%2;
            sb.append(sum);
        }
        
        while(j>=0){
            int sum=carry+(bArray[j--]-'0');
            carry=sum/2;
            sum=sum%2;
            sb.append(sum);
        }
        
        if(carry!=0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}