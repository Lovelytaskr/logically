
package logically;

public class no6 {
    static boolean cari(int bilangan[],int ukuran, int K){
        for(int i = 0; i < (ukuran - 1); i++){
            for(int j = (i + 1); j < ukuran; j++ ){
                if(bilangan[i] + bilangan[j] == K){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] bilangan = {4, 3, 6, 7, 1};
        int ukuran = bilangan.length;
        int K = 10;
        
        if(cari(bilangan, ukuran, K)){
            System.out.println("BISA");
        }else{
            System.out.println("TIDAK BISA");
        }
        
    }
}
