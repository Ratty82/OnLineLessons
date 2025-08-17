package OnLineLessons.OnLineLesson1;
public class BankAccount{
    private String accountName;
    private int accountNum;
    private int transcationNum;
    private double transanount;

    
    public BankAccount(String accountName, int accountNum, int transcationNum, double transanount) {
        this.accountName = accountName;
        this.accountNum = accountNum;
        this.transcationNum = transcationNum;
        this.transanount = transanount;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }


    public void setTranscationNum(int transcationNum) {
        this.transcationNum = transcationNum;
    }


    public void setTransanount(double transanount) {
        this.transanount = transanount;
    }


    public String getAccountName() {
        return accountName;
    }


    public int getAccountNum() {
        return accountNum;
    }


    public int getTranscationNum() {
        return transcationNum;
    }


    public double getTransanount() {
        return transanount;
    }


    @Override
    public String toString() {
        return "BankAccount [accountName=" + accountName + ", accountNum=" + accountNum + ", transcationNum="
                + transcationNum + ", transanount=" + transanount + "]";
    }





}