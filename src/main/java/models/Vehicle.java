package models;

/**
 * Created by Guest on 7/31/17.
 */
public class Vehicle {
    public int year;
    public String model;
    public int miles;
    public int price;
    public boolean forSale;
    public int speed;

    public Vehicle(int year, String model, int miles, int price) {
        this.year = year;
        this.model = model;
        this.miles = miles;
        this.price = price;
        this.forSale = true;

    }

    public boolean worthBuying(int maxPrice){
        return (price < maxPrice);
    }

    //Getters
    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getMiles() {
        return miles;
    }

    public int getPrice() {
        return price;
    }



}
