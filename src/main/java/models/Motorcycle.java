package models;


public class Motorcycle extends Vehicle implements Cook, Drive {
    public String color;


    public Motorcycle (int year, String model, int miles, int price, String color) {
        super(year, model, miles, price);
        this.color = color;

    }

    //DRIVE
    @Override
    public void accelerate() {
        speed += 20;
    }

    @Override
    public void slowDown() {
        speed -= 10;
    }

    @Override
    public void stop() {
        speed = 0;
    }



    //COOK
    @Override
    public String whatFoodCanWeMake() {
        return "Pad Thai";
    }

    @Override
    public Boolean isFoodForSale() {
        return true;
    }
}
