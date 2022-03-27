class Solution {
    public String multiply(String num1, String num2) {
        
        int n=num1.length();
        int m=num2.length();
        
        int[] array=new int[n+m];
        
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                int mul=(num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                
                int k=i+j;
                int l=i+j+1;
                
                int sum=mul+array[l];
                
                array[l]=sum%10;
                array[k]+=sum/10;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(int p : array){
            if(!(sb.length()==0 && p==0)) sb.append(p);
        }
        
        return sb.length()==0 ? "0" : sb.toString();
    }
}