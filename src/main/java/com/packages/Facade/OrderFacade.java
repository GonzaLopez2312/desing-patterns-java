package com.packages.Facade;

public class OrderFacade {

    private InventoryService inventoryService = new InventoryService();
    private InvoiceService invoiceService = new InvoiceService();
    private PaymentService paymentService = new PaymentService();

    public OrderFacade() {}

    public void placeOrder(String productName, int amount, String userId){
        if (inventoryService.isAvailable(productName)){
            paymentService.processPayment(amount);
            invoiceService.generateInvoice(userId);
            System.out.println("Order placed correctly");
        }else {
            System.out.println("Product " + productName + " is not available");
        }
    }
}
