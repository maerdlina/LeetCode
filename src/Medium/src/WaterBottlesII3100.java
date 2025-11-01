package Medium.src;

public class WaterBottlesII3100 {

    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = 0, empty = numBottles, drunk = numBottles;

        while(full+empty >= numExchange){
            if(empty < numExchange){
                drunk += full;
                empty += full;
                full = 0;
            }
            empty-=numExchange;
            full++;
            numExchange++;
        }
        drunk+=full;

        return drunk;
    }

    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(13, 6));
    }
}
