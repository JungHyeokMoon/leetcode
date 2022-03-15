class Solution {
    public boolean isHappy(int n) {
        int slow=n, fast=next(n);
        
        while(slow!=fast){
            
            slow=next(slow);
            fast=next(next(fast));
        }
        
        return slow==1;
    }
    
    private int next(int n){
        int returnValue=0;
        while(n!=0){
            int digit=n%10;
            returnValue+=digit*digit;
            n=n/10;
        }
        return returnValue;
    }
}