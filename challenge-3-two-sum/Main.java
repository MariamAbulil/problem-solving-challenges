import java.util.Arrays;
class Main{
    // solution:#1 Brute force
    public int[] twoSumUsedBruteForce(int[] nums,int target){
        for(int i = 0 ; i<nums.length;i++){
            for(int j=i+1; j<nums.lengthj++){
                if (nums[i]+nums[j]==target){
                    return int[] {i,j}
                }
            }
    
        }
        return int[] {}
    }
    // 2. Sorting + Binary Search
     public int[] twoSumUsedSortingBinarySearch(int[] nums, int target) {

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        for (int i = 0; i < sortedNums.length; i++) {

            int complement = target - sortedNums[i];

            int index = Arrays.binarySearch(
                sortedNums,
                i + 1,
                sortedNums.length,
                complement
            );

            if (index > i) {
                return new int[]{i, index};
            }
        }

        return new int[]{};
    }

}