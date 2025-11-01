package Easy.src;

public class WaterBottles1518 {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while(empty >= numExchange) {
            int newFull = empty / numExchange;
            total += newFull;
            empty = empty % numExchange + newFull;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(5, 5));
    }
}
