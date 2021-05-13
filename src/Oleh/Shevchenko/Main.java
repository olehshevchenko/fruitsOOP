package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
        Fruit greenApple = new Fruit();
        greenApple.setType(Type.APPLE);
        greenApple.setColour(Colour.GREEN);
        greenApple.setWeightInGrams(346);
        greenApple.setPricePerKg(21.95);
        double greenApplePrice = greenApple.getPricePerKg() * greenApple.getWeightInGrams() / 1000;
        System.out.println(greenApple);

        Fruit redApple = new Fruit();
        redApple.setType(Type.APPLE);
        redApple.setColour(Colour.RED);
        redApple.setWeightInGrams(230);
        redApple.setPricePerKg(19.95);
        double redApplePrice = redApple.getPricePerKg() * redApple.getWeightInGrams() / 1000;
        System.out.println(redApple);

        Fruit banana = new Fruit();
        banana.setType(Type.BANANA);
        banana.setColour(Colour.YELLOW);
        banana.setWeightInGrams(220);
        banana.setPricePerKg(32.85);
        double bananaPrice = banana.getPricePerKg() * banana.getWeightInGrams() / 1000;
        System.out.println(banana);

        Fruit lemon = new Fruit();
        lemon.setType(Type.LEMON);
        lemon.setColour(Colour.YELLOW);
        lemon.setWeightInGrams(88);
        lemon.setPricePerKg(34.95);
        double lemonPrice = lemon.getPricePerKg() * lemon.getWeightInGrams() / 1000;
        System.out.println(lemon);

        double totalPrice = greenApplePrice + redApplePrice + bananaPrice + lemonPrice;
        System.out.println("Total price to pay is: " + String.format("%.2f",totalPrice) + " UAH");
    }

}
