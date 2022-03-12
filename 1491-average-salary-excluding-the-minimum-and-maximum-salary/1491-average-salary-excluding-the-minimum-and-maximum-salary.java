class Solution {
    public double average(int[] salaries) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        int sum=0;
        for(int salary : salaries){
            min=Math.min(min, salary);
            max=Math.max(max, salary);
            sum+=salary;
        }
        
        sum=sum-min-max;
        
        return (double)sum/(salaries.length-2);
    }
}