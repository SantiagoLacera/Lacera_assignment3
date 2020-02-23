
class SavingsAccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        saver1.printMonthlyBalances();
        saver1.modifyInterestRate(.04);       
        saver1.calculateMonthlyInterest();
        saver1.printNewMonthlyBalances();
        saver2.printMonthlyBalances();
        saver2.modifyInterestRate(.04);       
        saver2.calculateMonthlyInterest();
        saver2.printNewMonthlyBalances();

        saver1.printMonthlyBalances();
        saver1.modifyInterestRate(.05);       
        saver1.calculateMonthlyInterest();
        saver1.printNewMonthlyBalances();
        saver2.printMonthlyBalances();
        saver2.modifyInterestRate(.05);       
        saver2.calculateMonthlyInterest();
        saver2.printNewMonthlyBalances();

    }

}