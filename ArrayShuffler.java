public class ArrayShuffler {
  public static void main(String[] args)  {
    
    int[] numbers = new int[10];
      //generate array
      for (int i=0; i<numbers.length;i++){
        numbers[i] = i;
      }
      //print unshuffled array
      for (int i=0; i<numbers.length;i++){
        System.out.print(numbers[i] + " ");
      }
      System.out.println();

      //shuffle array
      for (int i=0;i<numbers.length;i++) {
        int index = (int)(Math.random() * numbers.length);
        int temp = numbers[i];
        numbers[i] = numbers[index];
        numbers[index] = temp;
      }
      //print shuffled array
      for (int i=0; i<numbers.length;i++){
        System.out.print(numbers[i] + " ");
      }
      System.out.println();
    }
  }