import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String space;

        System.out.println("press space after that you will see prime numbers one to hundred=");
        space = input.nextLine();
        Boolean isPrime = true ;

        if (space.equals(" ")) {
            for (int i = 2 ; i < 100 ; i++){
                int count =0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        count++;
                    }
                }
                if (count ==0){
                    System.out.print(i + " ");
                }
            }
        } else
            System.out.println("Man ain't you listen to me");
    }

}
