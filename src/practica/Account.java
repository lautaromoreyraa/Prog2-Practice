package practica;

public class Account {
    private int id;
    private String name;
    private int balance;

    Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Account (int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    int credit(int amount) {
        balance += amount;
        return balance;
    }

    int debit(int amount) {
        if (amount <= balance) {
            balance += amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            balance -= amount;
            anotherAccount.credit(amount);
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
