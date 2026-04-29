class Main{
    // solution:#1 Brute force
    public int[] twoSum(int[] nums,int target){
        for(int i = 0 ; i<nums.length;i++){
            for(int j=i+1; j<nums.lengthj++){
                if (nums[i]+nums[j]==target){
                    return int[] {i,j}
                }
            }
    
        }
        return int[] {}
    }

}