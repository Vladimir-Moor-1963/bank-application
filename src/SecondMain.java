public class SecondMain {
    public static void main(String[] args) {
        Bank bank = new Bank(1, "new bank");
        Person daniil = new Person(2, "Дниил", 23);
        Person person = new Person(3, "Глеб", 14);
        Person ivan = new Person(4, "Ваня", 5);
        Person lppolit = new Person(5, "Ипполит", 70);

        BankOperation bankOperation1 = bank.createOperetion(daniil, OperationType.CREDIT, 5000);
        System.out.println(bankOperation1);
        BankOperation bankOperation2 = bank.createOperetion(person, OperationType.DEBIT, 5000);
        System.out.println(bankOperation2);
        BankOperation bankOperation3 = bank.createOperetion(ivan, OperationType.DEBIT, 5000);
        System.out.println(bankOperation3);
        BankOperation bankOperation4 = bank.createOperetion(lppolit, OperationType.MORTGAGE, 5000);
        System.out.println(bankOperation4);
    }
}

