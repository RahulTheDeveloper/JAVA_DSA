package oOPS;
class Account{
    public String name;
    protected String email;
    private String password;
    public void setpassword(String password){
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna college";
        account1.email = "apna college@gmail.com";
        account1.setpassword ("abcd");
    }
}
