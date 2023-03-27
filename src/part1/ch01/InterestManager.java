package part1.ch01;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager test = new InterestManager();

        double interestRate = getInterestRate(10);
    }
    public static double getInterestRate(int day) {
        double interestRate = 0;
        if (day >= 1 && day <= 90) {
            interestRate = 0.5;
        } else if (day >= 91 && day <= 180) {
            interestRate = 1;
        } else if (day >= 181 && day <= 364) {
            interestRate = 2;
        } else if (day >= 365) {
            interestRate = 5.6;
        }
        return interestRate;
    }
    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        return interestRate + amount;
    }
}
