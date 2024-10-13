package no1;

public class DeretBilPrima {
    public static void main(String[] args){
        System.out.println("Menghitung Deret bilangan prima dan bukan 0-20 dengan hasilnya.");
        int i = 0;
        do{
            System.out.println(i+ "" +(bilPrima(i)? " merupakan bilangan prima." : " bukan merupakan bilangan prima."));
            i++;
        } while(i <= 20);
    }
    
    public static boolean bilPrima(int bilangan){
        return (bilangan > 1) && cekBilPrima(bilangan, 2);
    }
    
    public static boolean cekBilPrima(int bilangan, int pembagi){
        return pembagi >= bilangan || (bilangan %  pembagi != 0 && cekBilPrima(bilangan, pembagi +1));
    }
}
