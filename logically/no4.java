
package logically;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class no4 {
    public static void main(String[] args) {

        int[] bilangan = new int[5];
        int bil1,bil2,bil3,bil4,bil5;
        int i;
        
         for (i = 0; i<5; i++){
            String nilai = JOptionPane.showInputDialog("Masukkan Bilangan: ");
            bilangan[i] = Integer.parseInt(nilai);
            System.out.println("Input Bilangan: "+nilai);
        }
        
        //menentukan bilangan ganjil genap
        for (i=0; i<5; i++){
            if (bilangan[i] %2 == 1){
            System.out.println("Bilangan "+bilangan[i]+" GANJIL");
            }
            else
            System.out.println("Bilangan "+bilangan[i]+" GENAP");
        }
    }  
}
