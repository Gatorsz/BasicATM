package ATM;

import java.util.Scanner;

public class logins {
    public static int accountlogin = 0;
    public void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        //Accounts


        if(accountlogin == 512) {
            bank.name = bank.name + "John";
            bank.check = bank.check + 4914;
            bank.save = bank.save + 6815;
            bank.MenuClass(scanner);
        }
        else if(accountlogin == 515) {
            bank.name = bank.name + "Bill";
            bank.check = bank.check + 4616;
            bank.save = bank.save + 3175;
            bank.MenuClass(scanner);
        }
        else if(accountlogin == 61) {
            bank.name = bank.name + "Mike";
            bank.check = bank.check + 9158;
            bank.save = bank.save + 1595;
            bank.MenuClass(scanner);
        }
        else {
            System.out.println("You are not registred");
            bank.main(args);
        }
    }
}
