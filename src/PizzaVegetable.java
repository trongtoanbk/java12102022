public class PizzaVegetable extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" Prepare Pizza Vegetable");
    }

    @Override
    public void sauce() {
        System.out.println(" Sauce Pizza Vegetable");

    }

    @Override
    public void bake() {
        System.out.println(" Bake Pizza Vegetable");

    }

    @Override
    public void cut() {
        System.out.println(" Cut Pizza Vegetable");
    }

    @Override
    public void box() {
        System.out.println(" Box Pizza Vegetable");

    }
}
