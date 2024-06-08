import java.util.concurrent.Callable;

public class Mayn {
    public static void main(String[] args) {
        BankOperation bankOperationCredit = new BankOperation(1,10_000,374,0,OperationType.CREDIT);
        BankOperation bankOperationDebit = new BankOperation(2,10_000,374,0,OperationType.DEBIT);
        BankOperation bankOperationMortgage = new BankOperation(3,10_000,374,0,OperationType.MORTGAGE);

       CreditCalcuiator calcuiator = new CreditCalcuiator();

       double credit = calcuiator.calculator(bankOperationCredit,1);
       double debit = calcuiator.calculator(bankOperationDebit,1);
       double mortgage = calcuiator.calculator(bankOperationMortgage,1);

        System.out.println(credit);
        System.out.println(debit);
        System.out.println(mortgage);




            }
        }



