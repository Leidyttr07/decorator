// OliveDecorator.java
public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);  // Inicializa con una pizza base
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olives";  // Añade aceitunas a la descripción
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.75;  // Añade el costo de las aceitunas
    }
}