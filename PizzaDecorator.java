public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;  // Referencia a la pizza que será decorada

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;  // Inicializa con una pizza base
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();  // Delegar descripción a la pizza decorada
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();  // Delegar costo a la pizza decorada
    }
}
