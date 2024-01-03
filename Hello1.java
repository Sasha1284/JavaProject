import java.util.Scanner;
public class Hello1 {
    public static void main(String[] args) {

 try (Scanner in = new Scanner(System.in)) {//очень важная вещь без неё мы не сможем загонять в терминал цифры

                    int a = in.nextInt(); //вводим первое число Int 
                     int b = in.nextInt(); //вводим второе число Int

             System.out.println( a + b ); //сумма
        }
    }
}
