public class BankAccountRunner {
    public static void main(String[] args) {
    
    //Проверяем метод deposit
    
    double[] DepositAmounts =  {-30.5,0.0,500};
    
    BankAccount b = new BankAccount("123", 520.50, "Ivanov Ivan");
    
    System.out.println("Счет :" + b.getInfo());

    for (int i = 0; i < DepositAmounts.length; i++){
        System.out.println("");
        System.out.println("Проверка метода внесения средств , вносим :" + DepositAmounts[i]);
        try {
            b.deposit(DepositAmounts[i]);
            System.out.println("Измененный счет:" + b.getInfo());
            } catch (InvalidAmountException e) {
              System.out.println("Ошибка : " + e.getMessage() + "неверное значение - " + e.InvalidAmount);
              }
    }
    
    //Проверяем метод withdraw
   
    double[] WithdrawAmounts =  {-30.5,0.0,400.0,1500.23};

        for (int j = 0; j < WithdrawAmounts.length; j++){
            System.out.println("");
            System.out.println("Проверка метода внесения средств , снимаем :" + WithdrawAmounts[j]);
        try {
            b.withdraw(WithdrawAmounts[j], b.getBalance());
            System.out.println("Измененный счет:" + b.getInfo());
            } catch (InvalidAmountException e) {
                System.out.println("Ошибка : " + e.getMessage() + "неверное значение - " + e.InvalidAmount);
              }
              catch (InsufficientFundsException w) {
                System.out.println("Ошибка : " + w.getMessage() + " запрошено - " + w.RequestedAmount + " Баланс - " + w.InsufficientFunds);

              }
    }

    }
    
}
