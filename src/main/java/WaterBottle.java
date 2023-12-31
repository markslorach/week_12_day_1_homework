public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int drink() {
        if (this.volume >= 10) {
            this.volume -= 10;
        } else {
            this.volume = 0;
        }
        return this.volume;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }
}
