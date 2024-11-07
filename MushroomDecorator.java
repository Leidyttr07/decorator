// MushroomDecorator.java
public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);  // Inicializa con una pizza base
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushrooms";  // Añade champiñones a la descripción
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0;  // Añade el costo de los champiñones
    }
}