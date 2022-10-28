import java.util.*;

public class ConvertiBin {
    public static void main (String []args){

        Scanner in = new Scanner(System.in);
        System.out.println("numero tra 0 e 127");
        int num = in.nextInt();
        if (num<0 || num>127){
            System.out.println("numero non compreso tra 0 e 127");
            System.exit(0);
        }
        String bin ="";
        for (int i = 0; i<7; i++){
            if (num%2==0){
                bin = "0"+bin;
                num = num/2;
            }else{
                bin = "1" + bin;
                num = num/2;
            }
        }
        System.out.println("in binario: "+bin);
        in.close();
    }
}
