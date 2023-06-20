import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {

        int yil;

        Scanner imp = new Scanner(System.in);

        System.out.print("Yıl girin : ");
        yil = imp.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 == 0){
                if (yil % 400 == 0){
                    System.out.println(yil +" Artık yıldır");
                }
            }else{
                System.out.println(yil + " Artık yıldır");
            }
        }else{
            System.out.println(yil + " Artık yıl değildir");
        }
    }
}
