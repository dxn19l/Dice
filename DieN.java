public class DieN
{

    private int value;
    private int sides;

    public DieN(int sides) {
        this.sides = sides;
        this.roll();
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int)(Math.random() * this.sides) + 1;
    }

    public int rollAndGetValue() {
        this.roll();
        return getValue();
    }

}