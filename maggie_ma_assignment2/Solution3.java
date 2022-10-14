class Solution3 {
  KthSum obj = new Kthsum(k, nums);
  int param_1 = obj.add(val);

  public KthSum(int k, int[] nums){
    List<Integer> obj = new ArrayList<>();

    for (int val : obj){
      if(param_1.size() < k){
        param_1.add(val);
      } else {
        if (val > param_1.peek){
          list.add(param_1.peek());
        } else {
          list.add(-1);
        }
        return list;
      }
    }
  }

  public int add(int val){
    int sum = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++){
      int sumK = 0;

      for (int j = i; j < n; j += k){
        sumK += nums[j];
        sum = Math.max(sum, sumK);
      }
      return sum;
    }
  }
}
