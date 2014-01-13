public class EvenFib {


  public static void main(String[] args) {
    int previous = 0;
    int current = 1;
    int temp = 0;
    int sum = 0;

    while(current <= 4000000){
      if(current % 2 == 0)
        sum += current;
      temp = current;
      current += previous;
      previous = temp;
    }
    System.out.println(sum);
  }

}