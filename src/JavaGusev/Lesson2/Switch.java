package JavaGusev.Lesson2;

public class Switch {
    public static void main(String[] args) {
        checkOrderStatus("ACCEPTED");
        checkOrderStatus("IN_DELIVERY");
        String month = "JAN";
        switch (month) {
            case "DEC":
            case "JAN":
            case "FEB": {
                System.out.println("Winter");
                break;
            }
        }
    }

    public static void checkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("Доставлен");
        } else {
            System.out.println("Неизвестный статус заказа");
        }
    }

    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED": {
                System.out.println("Принят");
                break;
            }
            case "DELIVERED": {
                System.out.println("Доставлен");
                break;
            }
            case "SHIPPED":// из ACCEPTED попадает сюда. Здесь можно перечислить разные статусы доставки
            case "IN_DELIVERY": {
                System.out.println("В доставке");
                break;
            }
            default: {
                System.out.println("Неизвестный статус заказа");
            }
        }
    }
}
