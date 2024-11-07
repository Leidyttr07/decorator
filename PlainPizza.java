public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";  // Descripción de la pizza base
    }

    @Override
    public double cost() {
        return 8.0;  // Costo base de la pizza
    }
}