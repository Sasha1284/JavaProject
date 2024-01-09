import java.util.Scanner;
public class HardMath {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
                int x = in.nextInt();
                int y = in.nextInt();
                if (y == 1) {
                    return x;
                } else {
                    return x * pow(x, y - 1);
                }
             }
        }
    }
