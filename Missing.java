public class Missing  {
    public static void main(String[] args) {
      int[] arrNum = {1, 2, 4, 5, 6};
      int n = arrNum.length;
      int max = arrNum[n - 1];
  
      System.out.print("Missing numbers are: ");
      for (int i = 0; i < n - 1; i++) {
        if (arrNum[i + 1] - arrNum[i] > 1) {
          for (int j = arrNum[i] + 1; j < arrNum[i + 1]; j++) {
            System.out.print(j + " ");
          }
        }
      }
    }
  }
  
