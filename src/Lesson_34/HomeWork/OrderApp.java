package Lesson_34.HomeWork;

import java.util.List;

public class OrderApp {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.addOrder(new Order(1, "Fill", 15));
        service.addOrder(new Order(2, "Svetlana", 100));
        service.addOrder(new Order(3, "liana", 200));


        System.out.println("Все подученные заказы:");
        service.displayOrders();
        System.out.println();


        System.out.println("Заказы клиента Liana:");
        List<Order> lianaianaOrders = service.findOrdersByCustomerName("Liana");
        for (Order order : lianaianaOrders) {
            System.out.println(order);
        }
        System.out.println();


        System.out.println("Заказы с сортировкой по сумме:");
        service.sortOrdersByAmount();
        service.displayOrders();
        System.out.println();


        System.out.println("Заказы с сортировкой  по имени клиента:");
        service.sortOrdersByCustomerName();
        service.displayOrders();
        System.out.println();


        System.out.println("Заказы с сортировкой по сумме и имени клиента:");
        service.sortOrdersByAmountAndCustomerName();
        service.displayOrders();
    }

}

