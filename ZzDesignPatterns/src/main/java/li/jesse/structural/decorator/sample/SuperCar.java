package li.jesse.structural.decorator.sample;

public class SuperCar implements ICar
{
    private ICar car;

    public SuperCar(ICar car)
    {
        this.car = car;
    }

    public void move()
    {
        car.move();
    }
}
