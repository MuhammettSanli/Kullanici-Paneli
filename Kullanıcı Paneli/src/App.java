import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner girdi=new Scanner(System.in);

        String isim,parola,isim1,parola1;

        System.out.println("İsminizi ve parolanızı belirleyin.");
        isim=girdi.nextLine();

        parola=girdi.nextLine();

        System.out.println("Bilgisayarın size ait olduğunu kanıtlamak için isim ve parolanızı giriniz.");

        isim1=girdi.nextLine();

        parola1=girdi.nextLine();

        if((isim1.equals(isim)) && (parola1.equals(parola)))
        {
            System.out.println("Hoşgeldin "+isim);
        }

        else
        {
            System.out.println("Yanlış bilgi girişi");
        }



    }


    }