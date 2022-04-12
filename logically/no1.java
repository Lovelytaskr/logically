
package logically;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args){
        float bil1, bil2 = 0, terbesar;
        System.out.println("menentukan bilangan terbesar");
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan bilangan pertama= ");
        bil1= scan.nextFloat();
        System.out.print("Masukkan bilangan kedua= ");
        bil1= scan.nextFloat();
        
        terbesar= bil1;
        
        if (terbesar < bil2)
            terbesar=bil2;
        System.out.println("Bilangan terbesar adalah "+terbesar);
    }
}
