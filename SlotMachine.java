import java.util.Random;

public class SlotMachine implements Iterator {
    private int coins;
    private int plays;
    private Random random;

    public SlotMachine(int startingCoins) {
        this.coins = startingCoins;
        this.plays = 0;
        this.random = new Random();
    }

    public void play() {
        if (coins > 0) {
            plays++;
            if (random.nextDouble() < 0.2) {
                coins += 2;
                System.out.println("WIN!!!!, Coins: " + coins);
            } else {
                coins--;
                System.out.println("LOST:(, Coins: " + coins);
            }
        }
    }

    public boolean hasNext() {
        return coins > 0;
    }

    public Integer next() {
        if (hasNext()) {
            play();
            return coins;
        } else {
            return null; 
        }
    }

    public void remove() {
    }

    public int getPlays() {
        return plays;
    }

    public int getCoins() {
        return coins;
    }

    
}