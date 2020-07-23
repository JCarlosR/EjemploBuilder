package clases;

// CLASE DIRECTOR.

public class Cocina {
    private PizzaBuilder builder;
 
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        builder = pizzaBuilder;
    }
    
    public Pizza getPizza() { 
        return builder.getPizza();
    }
 
    public void construirPizza() {
       builder.crearNuevaPizza();
       builder.buildMasa();
       builder.buildSalsa();
       builder.buildRelleno();
    }
}
