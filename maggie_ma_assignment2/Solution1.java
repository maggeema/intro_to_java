class Solution1{
  public int answer(int[] nums) {
    int n = nums.length;
    int majority = nums.length / 2;
    int majorityCounter = 0;
    int majorityElement = 0;
    int index = -1;

    for (int i = 0; i < n; i++){
      int counter = 0;
      for (int j = 0; j < n; j++){
        if (nums[i] == nums[j]){
          counter++;
        }

        if (counter > majorityCounter) {
          majorityCounter = counter;
          index = i;
        }
      }
    }

    if (majorityCounter > majority) {
      majorityElement = nums[index];
    }

    return majorityElement;
  }
}
