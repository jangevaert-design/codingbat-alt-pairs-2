public class AltPairs2 {
  public String altPairs(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      result += str.charAt(i);
      if (i % 2 != 0) {
        i += 2;
      }
    }
    return result;
  }
}
