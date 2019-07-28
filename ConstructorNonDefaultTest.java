public class ConstructorNonDefaultTest{
    public ConstructorNonDefaultTest(String text){
        methodSederhana(text);
    }
    public void methodSederhana(String text){
        System.out.println("method sederhana dipanggil dengan :" + text);    
    }

    public static void main(String[] args){
        //ConstructorNonDefaultTest test = new ConstructorNonDefaultTest();

        //constructor non default dengan satu parameter bertipe string
        ConstructorNonDefaultTest test1 = 
        new ConstructorNonDefaultTest("ini test");
    }
}