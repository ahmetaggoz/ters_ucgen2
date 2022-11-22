package Giris;
import java.util.Scanner;
public class ters_ucgen {
    public static void main(String[] args) {
        Scanner kedi = new Scanner(System.in);


        System.out.print("Yıldız basamak sayısını girin : ");
        int a = kedi.nextInt();


        for (int i = 1; i <= a; i++){
            for (int m = 1; m <= i -1; m++){
                System.out.print(" ");
            }
            for (int k = (2 * a) - 1; k >= (2 * i) - 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
