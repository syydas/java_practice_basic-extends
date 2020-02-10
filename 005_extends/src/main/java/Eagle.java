public class Eagle extends Birds{

    private String predator;

    public Eagle() {
    }

    public Eagle(int age, int weight, int flySpeed, String predator) {
        super(age, weight, flySpeed);
        this.predator = predator;
    }

    public String getPredator() {
        return predator;
    }

    public void setPredator(String predator) {
        this.predator = predator;
    }

    public void predatorWay() {
        System.out.println("捕食了一只" + this.predator);
    }
}
