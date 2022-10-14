public class algos{
  public String reverseWords(String s){
    String[] str = s.split(" ");
    String reverseStr = "";

    for (int i = 0; i < str.length; i++){
      String word = str[i];
      String reverseWord = "";

      for (int j = word.length()-1; j >= 0; j--){
        reverseWord += word.charAt(j);
      }
      reverseStr += reverseWord + " ";
    }
    return reverseStr;
  }
}
