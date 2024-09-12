import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapa objek yg dibuat? (Max 10)");
        int jumlah = in.nextInt();
        System.out.println("CD atau DVD?");
        String pilihan = in.next();

        if(pilihan.equals("CD")) {
           CD c1 = new CD();
           c1.print();
        }else if (pilihan.equals("DVD")){
           DVD d1 = new DVD();
           d1.print();
        } else {
            System.out.println("Input Salah.");
        }
        
        while (true) {
            System.out.println("CD atau DVD? (ketik 'keluar' untuk berhenti)");
            pilihan = in.next();
           
            if (pilihan.equalsIgnoreCase("keluar")) {
                System.out.println("Terima kasih, program dihentikan.");
                break;  
            }

            if (pilihan.equalsIgnoreCase("CD"));
     
        }
         
    }
    
}
