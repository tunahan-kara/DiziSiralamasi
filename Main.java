import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in) ;
        // dizinin indis sayisini aliyoruz
        System.out.println("Dizi Kaç Elemanlı Olsun?");
        int indis = veri.nextInt();
        // dizi elemanlarini aliyoruz
        System.out.println("Lütfen Dizinin Elemanlarını Giriniz : ");
        int[] dizi = new int[indis] ;
        // for dongusu alinan her sayiyi
        //sirasiyla indislerle eslestiriyor
        for (int i = 0 ; i<indis; i++) {
            System.out.print(i+1 + ".Eleman: ");
            int sayi = veri.nextInt();
            dizi[i] = sayi;
        }
        // kullanicidan alinan duzensiz hal :
        System.out.print("Dizinin Düzenlenmemiş Hali: ");
        for (int i  = 0 ;i<dizi.length;i++ ) {
            System.out.print(dizi[i] + ",");
        }
        //indisler kiyaslanarak siraya sokuluyor
        System.out.println();
        for (int i = 0 ; i<indis-1 ; i++) {
            if (dizi[i]> dizi[i+1] ) {
                int temp= dizi[i];
                dizi[i] = dizi[i+1];
                dizi[i+1] = temp;
                i = -1;
            }
        }
        // dizinin duzenlenmis hali :
        System.out.print("Dizinin Düzenlenmiş Hali :");
        for (int i  = 0 ;i<dizi.length;i++ ) {
            System.out.print(dizi[i] + ",");
        }




        }

    }
