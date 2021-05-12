package Oleh.Shevchenko;

public class fruits {
    private Type type;
    private Colour colour;
    private int weightInGrams;
    private double pricePerKg;

    public void setType(Type type) {
        this.type = type;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public Type getType() {
        return type;
    }

    public Colour getColour() {
        return colour;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public String toString() {
        return "fruits{" +
                "type=" + type +
                ", colour=" + colour +
                ", weightInGrams=" + weightInGrams +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
