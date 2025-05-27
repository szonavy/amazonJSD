package thirdmodul.thirdtask;

public class Main {
    public static void main(String[] args) {

        double weight, height;
        double bmi = 0;
        String bmiSystem;
        String bmiCategory;

        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        bmiSystem = userInput.obtainBMISystem();

        switch (bmiSystem.toUpperCase()) {

            case "IMPERIAL":
                weight = userInput.obtainWeight(bmiSystem);
                //bmiCalculator.weightInPounds = weight;

                height = userInput.obtainHeight(bmiSystem);
                //bmiCalculator.heightInInches = height;

                bmi = bmiCalculator.calculateBmiImperial(weight,height);
                break;

            case "METRIC":

                weight = userInput.obtainWeight(bmiSystem);
                //bmiCalculator.weightInKilos = weight;

                height = userInput.obtainHeight(bmiSystem);
                //bmiCalculator.heightInMeters = height;

                bmi = bmiCalculator.calculateBmiMetric(weight,height);

                break;

            case "":

                System.out.println("Please Enter a valid BMI System as input");

                break;
        }

        System.out.println("Your BMI is: " + bmi);
        bmiCategory = bmiCalculator.getBMICategory(bmi);


        System.out.println("Your BMI category is: " + bmiCategory);
    }
}
