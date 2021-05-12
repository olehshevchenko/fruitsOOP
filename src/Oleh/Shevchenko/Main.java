package Oleh.Shevchenko;

public class Main {

    public static void main(String[] args) {
        fruits greenApple = new fruits();
        greenApple.setType(Type.Apple);
        greenApple.setColour(Colour.green);
        greenApple.setWeightInGrams(346);
        greenApple.setPricePerKg(21.95);
        double greenApplePrice = greenApple.getPricePerKg() * greenApple.getWeightInGrams() / 1000;
        System.out.println(greenApple);

        fruits redApple = new fruits();
        redApple.setType(Type.Apple);
        redApple.setColour(Colour.red);
        redApple.setWeightInGrams(230);
        redApple.setPricePerKg(19.95);
        double redApplePrice = redApple.getPricePerKg() * redApple.getWeightInGrams() / 1000;
        System.out.println(redApple);

        fruits banana = new fruits();
        banana.setType(Type.Banana);
        banana.setColour(Colour.yellow);
        banana.setWeightInGrams(220);
        banana.setPricePerKg(32.85);
        double bananaPrice = banana.getPricePerKg() * banana.getWeightInGrams() / 1000;
        System.out.println(banana);

        fruits lemon = new fruits();
        lemon.setType(Type.Lemon);
        lemon.setColour(Colour.yellow);
        lemon.setWeightInGrams(88);
        lemon.setPricePerKg(34.95);
        double lemonPrice = lemon.getPricePerKg() * lemon.getWeightInGrams() / 1000;
        System.out.println(lemon);

        double totalPrice = greenApplePrice + redApplePrice + bananaPrice + lemonPrice;
        System.out.println("Total price to pay is: " + String.format("%.2f",totalPrice) + " UAH");
    }

}
