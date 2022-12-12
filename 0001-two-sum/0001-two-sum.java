class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        for (int i = 0;i <n-1;i++){
            int sum = nums[i];
            for(int j = i+1;j<n;j++){
                sum += nums[j];
                if(sum == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
                sum -= nums[j];
            }
        }
        return ans;
    }
}