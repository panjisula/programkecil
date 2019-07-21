import java.util.*;

class FirstProgram{
    public static void main(String[] args){
        int var = 5;

        System.out.println("value in = "+var);

        var = firstMethod(var);

        System.out.println("value out = "+var);
    }


public static int firstMethod(int inData){
    long time = new Date().getTime();

    if(time % 2==0){
        System.out.println("Even time = "+time);
    }else{
        System.out.println("Odd time = "+time);
    }

    int countA = 0;
    while(countA < 3){
        System.out.println("CountA = "+countA);
        countA = countA + 1;
    }

    for(int countB = 0; countB < 3; countB = countB+1){
        System.out.println("countB = "+countB);
    }
    
    return 2*inData;
    }
}