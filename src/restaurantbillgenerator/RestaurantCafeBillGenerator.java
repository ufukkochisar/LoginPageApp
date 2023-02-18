package restaurantbillgenerator;

import java.util.Scanner;
/*
ÖDEV: Şirket büyüdü, cafe kısmı açıldı.
      Aynı uygulama cafe kısmında da kullanılsın.
      Cafede farklı menü var.
        Dish dish1=new Dish(401,"Tiramisu",35.0);
        Dish dish2=new Dish(402,"Dondurma",25.0);
        Dish dish3=new Dish(402,"Profiterol",25.0);
        Dish dish4=new Dish(403,"Kahve",17.5);
        Dish dish5=new Dish(404,"Çay",7.5);
        Dish dish6=new Dish(405,"Portakal Suyu",25.5);
      Uygulama başladığında restaurant/cafe seçeneği olsun.

*/
public class RestaurantCafeBillGenerator {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner inp=new Scanner(System.in);
        OrderService orderService=new OrderService();
        System.out.println("Merhaba");
        System.out.println("1-Restaurant");
        System.out.println("2-Kafeterya");
        int option=inp.nextInt();
        if(option==1){
            DishService dishService=new DishService();
            dishService.fillDishList();//dish service-rest
            getSelectionMenu(dishService,orderService);
        }else{
            DishService dishService=new CafeDishService();
            dishService.fillDishList();//cafedish service
            getSelectionMenu(dishService,orderService);
        }
    }
    public static void getSelectionMenu(DishService dishService,OrderService orderService){
        int select=-1;
        while (select!=0){
            Scanner inp=new Scanner(System.in);
            System.out.println("----------------------------------------------------");
            System.out.println("*** Lezzet Restaurant/Cafe Sipariş Uygulaması ***");
            System.out.println("1-Menü");
            System.out.println("2-Sipariş girme");
            System.out.println("3-Sipariş iptal etme");
            System.out.println("4-Hesap oluştur");
            System.out.println("0-ÇIKIŞ");
            System.out.println("Seçiminiz: ");
            select= inp.nextInt();
            System.out.println("----------------------------------------------------");
            switch (select){
                case 1:
                    dishService.showDishMenu();//1:dish service                 2:dish service
                    break;
                case 2:
                    orderService.createOrder(dishService);
                    break;
                case 3:
                    orderService.deleteOrder();
                    break;
                case 4:
                    orderService.printBill();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş");
                    break;
            }
        }
        System.out.println("İyi günler...");
    }


}
