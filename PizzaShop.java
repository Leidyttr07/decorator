public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();  // Crea una pizza base
        System.out.println(pizza.getDescription() + " $" + pizza.cost());  // Muestra la pizza base

        pizza = new CheeseDecorator(pizza);  // Añade queso
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new PepperoniDecorator(pizza);  // Añade pepperoni
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new MushroomDecorator(pizza);  // Añade champiñones
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new OliveDecorator(pizza);  // Añade aceitunas
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}