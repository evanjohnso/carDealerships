package models;


public class Car extends Vehicle implements Drive, Cook{
    public String brand;
    public String type;


    public Car(int year, String model, int miles, int price, String brand, String type) {
        super(year, model, miles, price);
        this.brand = brand;
        this.type = type;
    }
    //FROM DRIVE
    @Override
    public void accelerate() {
        this.speed += 5;

    }

    @Override
    public void slowDown() {
        this.speed --;

    }

    @Override
    public void stop() {

        this.speed = 0;

    }


    //FROM COOK
    @Override
    public String whatFoodCanWeMake() {
        return "None";
    }

    @Override
    public Boolean isFoodForSale() {
        return false;
    }
}
