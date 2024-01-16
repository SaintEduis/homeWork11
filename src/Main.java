import java.util.Scanner;

public class Main {
    public static void task1(int year){
        if (((year % 100) != 0 && (year % 4) == 0) || (year % 400) == 0){
            System.out.println(year + " год - высокосный год");
        }
        else{
            System.out.println(year + " год - невысокосный год");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Нет такой системы");
        }
    }

    public static void task3(int distance) {
        int daysForDelivery = 1;

        if (distance <= 20) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (distance <= 60) {
            daysForDelivery += 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (distance <= 100) {
            daysForDelivery += 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Exercise 1
        System.out.print("Введите год: ");
        int yearForCheck = in.nextInt();
        task1(yearForCheck);

        //Exercise 2
        System.out.print("Введите тип вашей операционной системы: ");
        int clientOS = in.nextInt();
        System.out.print("Введите год выпуска вашего устройства: ");
        int clientDeviceYear = in.nextInt();
        task2(clientOS, clientDeviceYear);

        //Exercise 3
        System.out.print("Введите растояние от банка до вашего дома: ");
        int distance = in.nextInt();
        task3(distance);
    }
}