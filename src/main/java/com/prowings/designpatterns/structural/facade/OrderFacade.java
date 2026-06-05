package com.prowings.designpatterns.structural.facade;
//Facade pattern provides a simplified interface to a complex subsystem. It hides the complexities of the subsystem and provides a simple interface to the client. The facade pattern is used when we want to provide a simple interface to a complex system, or when we want to decouple a client from a complex subsystem.
public class OrderFacade {

    InventoryService inventoryService = new InventoryService();
    PaymentService paymentService = new PaymentService();
    ShippingService shippingService = new ShippingService();
    NotificationService notificationService = new NotificationService();

    public void placeOrder()
    {
        inventoryService.checkInventory();

        paymentService.doPayment();

        notificationService.sendNotification();

        shippingService.shipOrder();


    }

}
