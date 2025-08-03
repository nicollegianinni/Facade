package org.example;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world Ecommerce!");
        EcommerceFacade cliente1 = new EcommerceFacade();
        cliente1.processarPedido("123", "usuario1");
    }
}