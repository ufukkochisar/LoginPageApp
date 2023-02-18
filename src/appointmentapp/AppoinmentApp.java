package appointmentapp;
import java.util.Scanner;

/*
Proje: Randevu oluşturma uygulaması geliştiriniz.

       1-Ana menüde kullanıcıya randevu alma veya görüntülemek için iki seçenek sunulur.
       2-Randevu alma/oluşturma
            -Kullanıcıya mevcut doktorlar ve uygun oldukları tarihler gösterilir.
            -Kullanıcıdan no ile doktor seçmesi istenir.
            -Seçilen doktorun takvimi gösterilir.
            -Randevu alınmak istenen tarihin seçilmesi istenir.
            -en yakın 7 günlük takvim dolmuşsa daha sonra denenmesi istenir.
            -Geçerli bir tarih seçilmişse randevu oluşturulur ve bu tarih doktorun takviminden silinir.
       3-Randevu görüntüleme:
            -Kullanıcıya randevu no sorulur,
             randevu listesinde girilen no ile eşleşen randevu bilgileri yazdırılır.
       4-Doktor:
            -id, isim, branş, takvim
            -takvim: sistemin kullanıldığı günden 1 gün sonra başlamak üzere
                     7 günlük uygun randevu tarihleri

       5-Randevu:
            -id : otomatik üretilsin
            -hasta adı,Doktor,randevu tarihi
       6-Sistemde doktorlar kayıtlı olsun.

 */
//randevu güncelleme ve randevu iptal işlemlerini ekleyerek uygulamayı geliştiriniz.
//
public class AppoinmentApp {
    public static void main(String[] args) {
        start();
    }

    //1-ana menü
//2-doctor, appointment classlarını oluştur
    public static void start() {
        Scanner inp=new Scanner(System.in);
        AppoinmentService appservice=new AppoinmentService();
        DoctorService drService=new DoctorService();
        System.out.println("Merhaba, randevu sistemine hoşgeldiniz...");
        int select;
        do {
            System.out.println("1-Randevu al");
            System.out.println("2-Randevu görüntüleme");
            System.out.println("0-Çıkış");
            System.out.println("Seçiminiz:");
            select=inp.nextInt();
            switch (select){
                case 1:
                    appservice.getAppoinment(drService);
                    break;
                case 2:
                    appservice.printAppoinment();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş!!!");
                    break;
            }
        }while(select!=0);
    }

}