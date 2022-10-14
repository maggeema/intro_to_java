class Solution2 {
  public int maximumWealth(int[][] accounts) {
    int currentamount = -1;
    for (int i = 0; i < accounts.length; i++){
      tempamount = 0;
      for (int j = 0; j < accounts[i].length; j++){
        tempamount = accounts[i][j];
        }
      }
      if (tempamount > currentamount){
        currentamount = tempammount;
      }
    }
    return currentamount;
  }
}
