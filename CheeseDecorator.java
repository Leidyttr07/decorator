// CheeseDecorator.java
public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);  // Inicializa con una pizza base
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", cheese";  // Añade queso a la descripción
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.5;  // Añade el costo del queso
    }
}
