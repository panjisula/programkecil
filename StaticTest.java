public class StaticTest{
    public static void main(String[] args){
        //static void memanggil static method lain dalam class yang sama
        contohMethodStatic();
        StaticTest.contohMethodStatic();
    }

    public static void contohMethodStatic(){
        System.out.println("method static dipanggil");
    }
}