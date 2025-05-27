package finaltasks.first;

public class Penguin extends Animal implements Eat,Walk,Swim{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguins: I am eating delicious fish");

    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }


    @Override
    public void swimming() {
        System.out.println("The penguin is swimming.");

    }

    @Override
    public void walking() {
        System.out.println("The penguin is walking.");

    }
}
