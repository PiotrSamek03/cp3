public class ex8 {

    private double balance;
    private String [] transactions;
    private int count;

    public void deposit(double ammount){
        balance = balance + ammount;
    }

    public void ShowBalance(){
        System.out.println(balance);
    }

    public void withdraw(double ammount){
        if(balance>=ammount && ammount<=500){
            balance = balance - ammount;
        }
        else if(ammount>500){
            System.out.println("Ammount cannot be over 500");
        }
        else{
            System.out.println("Withdraw is impossible");
        } 
    }

    public void addtransaction(){

    }
}