import java.util.Scanner;

public class Gravitacija {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double visina = sc.nextInt();
        System.out.println(visina);
        System.out.println(gravitacija(visina));

    }
    public static double gravitacija(double visina) {
        double C = 6.674 * Math.pow(10,-11); 
        double M = 5.972 * Math.pow(10,24);
        double R = 6.371 * Math.pow(10,6);

        return (C * M) / Math.pow((R + visina), 2);
    }
}