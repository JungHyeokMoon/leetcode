class Solution {
    public int countOdds(int low, int high) {
        int diff=high-low+1;
        if(diff%2==0){
            return diff/2;
        }
        else{
            if(low%2!=0 || high%2!=0){
                return (diff/2)+1;
            }
            return diff/2;
        }
    }
}

// 8 10 => 9, answer 1, diff 3
// 8 12 => 9 11, answer 2, diff 5
// 7 12 => 7 9 11, answer 3, diff 6
// 1 12 => 1 3 5 7 9 11, answer 6 diff 12
// 3 7 => 3 5 7, answer 3 diff 5
// 3 6 => 3 5, answer 2 diff 4
// 4 8 => 5 7, answer 2 diff 5
// 4 10 => 5 7 9, answer 3 diff 7
// 3 9 => 3 5 7 9, answer 4 diff 7
