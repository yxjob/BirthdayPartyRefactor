package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {
        BalloonOrder balloonOrder1 = new BalloonOrder("red", "mylar", "4");
        BalloonOrder balloonOrder2 = new BalloonOrder("blue", "latex", "7");
        BalloonOrder balloonOrder3 = new BalloonOrder("yellow", "mylar", "4");

        CakeOrder cakeOrder1 = new CakeOrder("chocolate", "chocolate", "circle", "large", "brown");
        CakeOrder cakeOrder2 = new CakeOrder("Vanilla", "chocelate", "square", "med", "brown");
        CakeOrder cakeOrder3 = new CakeOrder("vanilla", "vanilla", "square", "small", "yellow");

        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.processOrder(balloonOrder1);
        orderProcessor.processOrder(balloonOrder2);
        orderProcessor.processOrder(balloonOrder3);
        orderProcessor.processOrder(cakeOrder1);
        orderProcessor.processOrder(cakeOrder2);
        orderProcessor.processOrder(cakeOrder3);
    }
}
