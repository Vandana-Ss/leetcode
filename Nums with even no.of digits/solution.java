class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int i =0; i<nums.length; i++){
            if((totDigits(nums[i]))%2 == 0){
                count++;
            }
        }
        
        return count;
    }
    public int totDigits(int n){
        int i = 0;
        
        while(n>0){
            n = n/10;
            i += 1;
        }
        
        return i;
    }
}
