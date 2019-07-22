import java.util.*;
public class ListExampleAnyar{
    public static void main(String []args){
        //menggunakan generic tipe string
        List <String> al = new ArrayList <String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");

        List <String> listBaru =new ArrayList <String>();

        //memindahkan nilai dari list al ke listBaru
        listBaru.addAll(al);

        System.out.println("An element at 2nd position: "+listBaru.get(2));
        for(String s:listBaru){
            System.out.println(s);
        }
    }
}