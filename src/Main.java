public class Main {
     public static void main(String[] args) {
         task1();
         task2();
         task3();
     }
     public static void countLeapYear (int year) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
     }

    public static void task1() {
        System.out.println("Задача 1");
        int someYear = 2024;
        countLeapYear(someYear);
    }
    public static void recomendationVersion(int clientOS, int year) {
         if (year < 2015 && clientOS == 0) {
             System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         } else if (year < 2015 && clientOS == 1) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке");
         } else if (year > 2015 && clientOS == 0) {
             System.out.println("Установите версию приложения для iOS по ссылке");
         } else {
             System.out.println("Установите версию приложения для Android по ссылке");
         }
     }
    public static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int clientsDeviceYear = 2024;
        recomendationVersion(os, clientsDeviceYear);
     }
    public static int countingDays(int distance) {
        int day = 0;
        if (distance <= 20) {
            day++;
        } else if (distance <= 60) {
            day = day + 2;
        } else if (distance <= 100) {
            day = day + 3;
        }
        return day;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistanse = 30;
        if (countingDays(deliveryDistanse) != 0) {
            System.out.println("Потребуется дней для доставки: " + countingDays(deliveryDistanse));
        } else {
            System.out.println("Доставки нет");
        }

        }
         }

