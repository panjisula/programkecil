import java.util.Scanner;
public class Latihan {
    
    public static void main(String[] args){
        String depan, tengah, belakang;
        int a, b, c, dua;
        char satu, duaNew, tiga;
        char test;
        Scanner in = new Scanner(System.in);
        System.out.print("Nama depan : ");depan = in.nextLine();
        System.out.print("Nama tengah : ");tengah = in.nextLine();
        System.out.print("Nama belakang : ");belakang = in.nextLine();
        
        satu=depan.charAt(0);
        dua=tengah.length();
        tiga=belakang.charAt(0);
        
        duaNew = tengah.charAt(dua-1);
                
         System.out.println("Huruf pertama nama depan : "+satu);
          System.out.println("Huruf terakhir nama tengah : "+duaNew);
           System.out.println("Huruf pertama nama belakang : "+tiga);
      
        System.out.println("Nama lengkap anda : "+depan+" "+tengah+" "+belakang);
        
        a = depan.length();
        b = tengah.length();
        c = belakang.length();
        int d = a+b+c;
        
            System.out.println("Jumlah huruf nama anda : "+ d );
    }
}
