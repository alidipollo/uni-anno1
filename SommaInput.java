import java.util.Scanner;

public class SommaInput{
    public static void main (String [] args) {

        Scanner in = new Scanner (System.in);
        int num = 0;
        int som = 0;

        System.out.println("INSERISCI UN NUMERO CHE ABBIA ALMENO 2 CIFRE  -> ");
        String prendi = in.nextLine();
        
        for (int i=0; i<prendi.length(); i++){

            if (prendi.charAt(i)>= '0' && prendi.charAt(i)<='9'){
                
                num = (int) (prendi.charAt(i)- '0');
                som = som + num;

                System.out.println(i + ")  " + num + " --- SOMMA PARZIALE : " + som);

            }

        }

        


    }
}