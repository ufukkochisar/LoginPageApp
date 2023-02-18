package biletrezervasyoun;

public class Bilet {

    public int distance;

    public int typeNo;

    public double price;

    public int seatNo;

    public void printBilet(Bus bus){
        System.out.println("Toplam tutar:"+price);
        System.out.println("---biletrezervasyoun.Bilet Detay---");
        System.out.println("Otobüs plakası: "+bus.numberPlate);
        System.out.println("Mesafe:" +distance);
        System.out.println("Yolculuk tipi: "+(typeNo==1 ? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.println("Koltuk no:"+seatNo);
        System.out.println("Keyifli yolculuklar dileriz...");

    }

}
