package no2;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Masukkan nilai n untuk perkalian (1-10): ");
        int n = input.nextInt();
        
        n = (n > 10) ? 10 : n;
        
        System.out.print("\t");
        int header = 1;
        do{
            System.out.print(header+ "\t");
            header++;
        }while(header <= n);
        System.out.println();
        
        int i = 1;
        do{
            System.out.print(i);
            int j = 1;
            do{
                System.out.print("\t" + (i * j));
                j++;
            }while(j <= n);
            System.out.println();
            i++;
        }while(i <= n);

    }
}
