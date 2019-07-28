public class PropertyStaticTest{
    public static String nilaiStatic;
    public static void main(String[] args){
        PropertyStaticTest.nilaiStatic = "INI NILAI DARI METHOD MAIN";
        
        System.out.println(nilaiStatic);
        
        ubahNilaiStatic();
        System.out.println(nilaiStatic);
    }

    public static void ubahNilaiStatic(){
        PropertyStaticTest.nilaiStatic = "INI NILAI DARI METHOD ubahNilaiStatic";
    }
}