import java.util.Scanner;

public class Kelipatan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int  batasAwal,batasAkhir;

        System.out.print("Masukan Batas Akhir Anda: ");
        batasAwal = input.nextInt();
        System.out.print("Masukan Batas Akhir Anda: ");
        batasAkhir = input.nextInt();

        while (i >= batasAwal && i <= batasAkhir) {
        System.out.print(i+ " , ");
      
        try {
          Thread.sleep(450);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
          i+=6; 
    }
      
        System.out.println("TERIMAKASI.");
  }
  
}