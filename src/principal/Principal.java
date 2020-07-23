package principal;

import clases.*;

// CLASE PRINCIPAL.

public class Principal {
    public static void main(String[] args) {
        Cocina cocina = new Cocina(); // Director

        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();
 
        cocina.setPizzaBuilder(hawaiPizzaBuilder);

        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();
    }
}
