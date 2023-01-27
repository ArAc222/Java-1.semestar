package ponavljanje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int m, pog = 29, br = 0;
        
        Scanner broj = new Scanner(System.in);
        
        System.out.println("Pokusajte pogoditi broj:");
        do{
            if(br >= 1){
            System.out.printf("\nPogadajte opet: \n");
            }
            m = broj.nextInt();
            br++;
            
            if(m > 29){
                System.out.printf("Broj je manji!");
            }
            
            if(m < 29){
                System.out.printf("Broj je veci!");
            }
            
        }while(m != pog);
        
        if(m == pog){
            System.out.printf("Bravo! Pogodili ste broj iz %d. pokušaja", +br);
        }
    }
}
