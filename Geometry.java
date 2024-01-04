import java.util.Scanner;
public class entering_numbers {
    public static void main(String[] args) {

/*Задача: 
        Написать алгоритмы для вычесления S, P, V прямоугольника и куба. 
        Для прямоугольника:                     Для куба:
        S =  a * b                              S = 6 * a^2
        P = (a + b) * 2                         P = 12 * a
        V =  a * b * h                          V = a^3
 */
 try (Scanner in = new Scanner(System.in)) {//очень важная вещь без неё мы не сможем загонять в терминал цифры

                //У нас есть 3 переменные a - 1  cторона, 2 - сторона, h - высота
                    int a = in.nextInt(); // 1 сторона
                    int b = in.nextInt(); // 2 сторона
                    int h = in.nextInt(); // высота
/*Прямоугольник */              System.out.println("У прямоугольника");
                    /*Площадь*/     System.out.println("Площадь = " + (a * b));
                    /*Периметр */   System.out.println("Периметр = " + ((a + b) * 2));
                    /*Обьём */      System.out.println("Обьем = " + (a * b * h));

/*Куб:*/                        System.out.println("У куба");
                    /*Площадь*/     System.out.println("Площадь = " + ( 6 * a^2) );
                    /*Периметр */   System.out.println("Периметр = " + (12 * a));
                    /*Обьём */      System.out.println("Обьем = " + (a^3) );5

        }
    }
}
