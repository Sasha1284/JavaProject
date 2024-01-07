import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {

/*Задача: 
        Написать алгоритмы для вычесления S, P, V прямоугольника и куба. 
        Для прямоугольника:                     Для куба:
        S =  a * b                              S = 6 * a^2
        P = (a + b) * 2                         P = 12 * a
        V =  a * b * h                          V = a^3
 */
 try (Scanner in = new Scanner(System.in)) {//очень важная вещь без неё мы не сможем загонять в терминал цифры
/*1Прямоугольник */   
                    System.out.println("Введите 2 стороны и высоту");
            int a1 = in.nextInt(); // 1 сторона
            int b1 = in.nextInt(); // 2 сторона
            int h1 = in.nextInt(); // высота
                    System.out.println("У прямоугольника");
                            /*Площадь*/     System.out.println("Площадь = " + (a1 * b1));
                            /*Периметр */   System.out.println("Периметр = " + ((a1 + b1) * 2));
                            /*Объём */      System.out.println("Объем = " + (a1* b1 * h1));

/*2Куб:*/ 
                    System.out.println("Введите сторону куба");
            int a2 = in.nextInt();
                    System.out.println("У куба");
                            /*Площадь*/     System.out.println("Площадь = " + ( 6 * a2^2) );
                            /*Периметр */   System.out.println("Периметр = " + (12 * a2));
                            /*Объём */      System.out.println("Объем = " + (a2^3) );

/*3Треугольник */               
                    System.out.println("Введите 3 стороны и высоту треугольника");
            int a3 = in.nextInt();
            int b3 = in.nextInt();
            int c3 = in.nextInt();
            int h3 = in.nextInt();
                    System.out.println("У треугольника");
                            /*Площадь */    System.out.println("Площадь = " + (a3*h3)*2);
                            /*Периметр*/    System.out.println("Периметр = " + (a3 + b3 + c3));
                            /*Объём */      System.out.println("Объем = " + ("ERROR"));
/*4Шар*/                      
                    System.out.println("Введите радиус (Для нахождение обьёма и площади шара) pi= 3.14");
            int r4 = in.nextInt();
            double pi = 3.14;
                    System.out.println("У шара ");
                                            System.out.println("Объем шара = " +   ( 4 * pi  * (r4^3) / 3 ));
                                            System.out.println("Площадь шара = " + ("ERROR"));
        }   
    }
}
