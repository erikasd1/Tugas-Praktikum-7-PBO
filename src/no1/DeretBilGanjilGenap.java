package no1;

public class DeretBilGanjilGenap {
    public static void main(String[] args){
        System.out.println("Menghitung Deret bilangan ganjil dan genap dari 0-20 dengan Hasilnya.");
        for(int i = 0; i <= 20; i++){
            System.out.println(i+ " merupakan bilangan" +(i% 2 == 0 ? " genap." : " ganjil."));
        }
        
    }
}
