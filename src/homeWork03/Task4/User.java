package homeWork03.Task4;


public class User {
    String name;
    int balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(int salary) {
        this.balance += salary;
        System.out.println(this.balance);
    }

    public double withdraw(int sum) {
        double withdraw;
        double comission;
        if (sum < 1000) {
            comission = sum * 0.05;
        }
        else {
            comission = sum * 0.1;
        }
        withdraw = sum + comission;
        double balance = (double)getBalance();
        balance=balance-withdraw;
        return balance;

    }

    public int companyName() {
        this.companyName.length();
        return companyName.length();
    }

    public void monthIncreaser(int addMonth) {
        this.monthsOfEmployment += addMonth;
        System.out.println(addMonth);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
