class Solution2{
  public int answer(int[] nums) {
    int n = nums.length;

    int sum = nums[0];
    for (int i = 0; i < n - 1; i++){
      if (nums[i] != nums[i+1]){
        sum += nums[i+1];
      }
    }
    return sum;
  }
}
