public class BankAccount {
    private String AccountNumber;
    private double Balance;
    private String  OwnerName;

    public BankAccount(String AccountNumber,double Balance,String OwnerName){
        setAccountNumber(AccountNumber);
        setBalance(Balance);
        setOwnerName(OwnerName);
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Номер счета не задан или пустой");
        }
        this.AccountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.Balance = 0;
        }
        this.Balance = balance;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isEmpty()){
            System.out.println("Владелец счета не может быть пустой");
        }
        this.OwnerName = ownerName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public String getOwnerName() {
        return OwnerName;
    }


    //метод deposit - внесение денег
    public double deposit(double amount) throws InvalidAmountException{
        
        if (amount <= 0) {
            throw new InvalidAmountException("Сумма операции отрицательная или равна нулю:", amount);
        }
        setBalance(getBalance() + amount);
        
        return getBalance();
    }
    
    //метод withdraw - выдача денег
    public double withdraw(double amount,double funds) throws InvalidAmountException,InsufficientFundsException{
        if (amount <= 0) {
            throw new InvalidAmountException("Сумма операции отрицательная или равна нулю:", amount);
        }
        if (amount > funds) {
            throw new InsufficientFundsException("На балансе недостаточно средств:", amount , funds);
        }
        setBalance(funds - amount);

        return getBalance();
    }

    //информация о счете
    public String getInfo(){
        return String.format("Номер: %s , Владелец: %s , Баланс: %s",  getAccountNumber(),getOwnerName(),getBalance());
     }
    
}


