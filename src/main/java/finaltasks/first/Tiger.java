package finaltasks.first;

public class Tiger extends Animal implements Walk {


    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public Tiger(String nameOfAnimal) {
        super(nameOfAnimal);

    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevelOfRoar() {
        return soundLevel;
    }

    public void setLevelOfRoar(int levelOfRoar) {
        this.soundLevel = levelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed " + speed + " mph.");
    }
}
