public class Birds extends Animal {
    private int flySpeed;

    public Birds() {
    }

    public Birds(int age, int weight, int flySpeed) {
        super(age, weight);
        this.flySpeed = flySpeed;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.println("翱翔天空");
    }
}
