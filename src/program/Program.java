package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Account> lista = new ArrayList<Account>();
        lista.add( new SavingsAccount(1001,"Welton",2036.65,0.65));
        lista.add( new BusinessAccount(10089,"maria",4038.88,5.69));
        lista.add( new SavingsAccount(8877,"Claudio",1750.65,500.65));
        lista.add( new BusinessAccount(4511,"Carrazzy",5222.88,456.88));

        double sum = 0.0;
        for(Account ac : lista){
            sum += ac.getBalance();
        }

        System.out.printf("Total de Soma das Contas: %.2f",sum);
        for(Account ac : lista){
            ac.deposit(10.0);
        }
        for(Account ac : lista){
            System.out.println("\nSaldo conta: " + ac.getHolder() + " " + ac.getNumber() + " " + ac.getBalance() + " R$");
        }

    }
}
