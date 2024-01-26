import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //c
        Kolo kolo = new Kolo();
        System.out.println(kolo);
        Kolo kolo1 = new Kolo(10);
        System.out.println(kolo1);
        //d
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        Kolo[] kola = new Kolo[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            kola[i] = new Kolo(random.nextInt(10, 20));
        }
        //e
        double poleMin  = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println(kola[i].pole());
            if (kola[i].pole() < poleMin) {
                poleMin = kola[i].pole();
            }
        }
        System.out.println(poleMin);
        //f
        double  roznica = skan.nextDouble();
        for(int i =0; i< n; i++){
            for(int j= i+1; j<n;j++){
                if(Math.abs(kola[i].obwod()- kola[j].obwod())< roznica){
                    System.out.println(kola[i].getPromien() + ", " + kola[j].getPromien());
                }
            }
        }
    }
}