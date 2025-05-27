package thirdmodul.thirdtask;

public class BMICalculator {

    double weightInPounds;
    double heightInInches;
    double weightInKilos;
    double heightInMeters;


    public BMICalculator() {
        this.weightInPounds = 0;
        this.heightInInches = 0;
        this.weightInKilos = 0;
        this.heightInMeters = 0;
    }

    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return (703 * weightInPounds) / (heightInInches * heightInInches);
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        return weightInKilos / (heightInMeters * heightInMeters);
    }

    public String getBMICategory(double bmi) {
        String message = "";

        if(bmi < 18.5){
            message = "Underweight";
        }else if(bmi < 25){
            message = "Normal weight";
        }else if(bmi < 30){
            message = "Overweight";
        }else{
            message = "Obese";
        }
        return message;
    }
}
