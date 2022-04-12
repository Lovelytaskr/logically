
package logically;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args){
        float bill, hasil;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("ganjil genap");
        System.out.println("Masukkan bilangan= ");
        bill= scan.nextFloat();
        
        if (bill%2==0)
            System.out.println("ini adalah bilangan genap");
        
        else if (bill%2!=0)
            System.out.println("Ini adalah bilangan ganjil");
    
}
}
