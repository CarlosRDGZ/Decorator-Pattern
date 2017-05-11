package decorator;

public class DecoratorPatternDemo
{
    public static void main(String[] args)
    {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();
        System.out.println();
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
        System.out.println();
    }
}
