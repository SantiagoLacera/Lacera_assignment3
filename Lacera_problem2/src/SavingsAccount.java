public class SavingsAccount {
  private static double annualInterestRate;
  private double savingsBalance;

  public SavingsAccount(double savingsBalance) {
    this.savingsBalance = savingsBalance;
    annualInterestRate = 0;
  }


  public void modifyInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public void calculateMonthlyInterest() {
    double monthlyInterest;
    monthlyInterest = (savingsBalance * annualInterestRate) / 12;
    savingsBalance += monthlyInterest;
  }

  public void printMonthlyBalances() {
    System.out.println("Your current savings is " + savingsBalance);

  }

  public void printNewMonthlyBalances() {
    System.out.println("Your new current savings is " + savingsBalance);

  }

  protected double getSavings() {
    return savingsBalance;
  }

}