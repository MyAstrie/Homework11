import java.time.LocalDate;

public class Main {
    public static String task1(int year){
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))
                ? " год является високосным"
                : " год не является високосным";
    }

    public static void task2(int clientOS , int clientDeviceYear){
        if(clientOS >= 2 )
            throw new ArithmeticException("Заничение должно быть 1 или 0");

        int currentYear = LocalDate.now().getYear();

        if(clientDeviceYear >= currentYear) {
            if(clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else{
            if(clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int task3(int deliveryDistance){
        return (deliveryDistance - 20) % 40.0 == 0
                ? (int)Math.ceil(((deliveryDistance - 20) / 40.0) + 2)
                : (int)Math.ceil(((deliveryDistance - 20) / 40.0) + 1);
    }

    public static void main(String[] args) {
        int year = 2001;
        System.out.println(year + task1(year));

        int clientOS = 1;
        year = 2022;
        task2(clientOS, year);

        var deliveryDistance = 31;
        System.out.println("Потребуется дней: " + task3(deliveryDistance));
    }
}