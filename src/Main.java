public class Main {
    public static void main(String[] args) {

        //Задача 1
        int operationSystem = 1;  // Android = 1, IOS = 0
        switch (operationSystem) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            case 0:
                System.out.println("Установите версию приложения для IOS по ссылке.");
                break;
        }

        //Задача 2
        int deviceYear = 2015;
        int clientDeviceYear = 2015;
        if (operationSystem == 1 && clientDeviceYear >= deviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (operationSystem == 1 && clientDeviceYear < deviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (operationSystem == 0 && clientDeviceYear >= deviceYear) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (operationSystem == 0 && clientDeviceYear < deviceYear) {
            System.out.println("Установите облегченную версию для IOS по сети.");
        }

        //Задача 3
        int year = 2021;
        if (year > 1584 && (year % 100) == 0 && (year % 4) == 0) {
            System.out.println(year + " год является високостным.");
        } else {
            System.out.println(year + " год не является високостным.");
        }

        //Задача 4
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = deliveryDistance + 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
        } else {
            System.out.println("Свыше 100 км доставка не осуществляется.");
        }
        if (deliveryTime != 0) {
            System.out.println("Постребуется дней: " + deliveryTime);
        }

        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Месяц относится к сезону Зима.");
                break;
            case 3, 4, 5:
                System.out.println("Месяц относится к сезону Весна.");
                break;
            case 6, 7, 8:
                System.out.println("Месяц относится к сезону Лето.");
                break;
            case 9, 10, 11:
                System.out.println("Месяц относится к сезону Осень.");
                break;
        }

    }
}