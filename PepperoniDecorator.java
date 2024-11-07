// PepperoniDecorator.java
public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);  // Inicializa con una pizza base
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", pepperoni";  // Añade pepperoni a la descripción
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2.0;  // Añade el costo del pepperoni
    }
}
