package appointmentapp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//3-Doktor:
//            -id, isim, branş, takvim
//            -takvim: sistemin kullanıldığı günden 1 gün sonra başlamak üzere
//                     7 günlük uygun randevu tarihleri
public class Doctor {
    private int id;
    private String name;
    private String department;
    private List<String> dates=new ArrayList<>();

//4-doctor nesnesi oluştrulduğunda randevu tarihleri de olsun

    public Doctor(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        LocalDate day=LocalDate.now();//sisteme girilen gün:01.02
        for (int i=0; i<3;i++){//test edebilmek için 3 yaptık 7 olmalı
            day=day.plusDays(1);//02.02,03.02,04.02...
            this.dates.add(day.toString());
        }
    }
//5-getter-setter metodlarını oluştur

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}