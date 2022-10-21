package ATM;
import java.util.Scanner;

//*Version 1.2, errors break program*//
public class bank {
    public static int check = 0;
    public static int save = 0;
    public static int tran = 0;
    public static int withdrawlchecking = 0;
    public static int withdrawlsaving = 0;
    public static int depositcheckings = 0;
    public static int depositsavings = 0;
    public static int cstransfer = 0;
    public static int sctransfer = 0;
    public static String name = "";
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Starter(scanner);
    }
    public static void Starter(Scanner scanner) {
            Flush();
            System.out.println("Welcome to the Bank");
            System.out.print("Please enter your user ID: ");
            logins.accountlogin = scanner.nextInt();
            logins loginsObject = new logins();
            Flush();
            loginsObject.main(null);
    }
    public static void MenuClass(Scanner scanner) {
        System.out.println("Welcome "+name+"!");
        System.out.println("Your Checkings Balance is "+check);
        System.out.println("Your Savings Balance is "+save);
        System.out.println("What would you like to do?");
        System.out.println("1) Withdrawl");
        System.out.println("2) Deposit");
        System.out.println("3) Transfer");
        System.out.println("4) Transactions Log");
        System.out.println("5) Quit");
        System.out.println("");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You have chose Withdrawl");
            Flush();
            WithdrawlClass(scanner);
        }
        if (choice == 2) {
            System.out.println("You have chose Deposit");
            Flush();
            DepositClass(scanner);
        }
        if (choice == 3) {
            System.out.println("You have chose Transfer");
            Flush();
            TransferClass(scanner);
        }
        if (choice == 4) {
            Flush();
            CheckBal(scanner);
        }
        if (choice == 5) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    public static void WithdrawlClass(Scanner scanner) {
            System.out.println("Which account would you like to withdrawl from?");
            System.out.println("1) Checkings");
            System.out.println("2) Savings");
            int withdrawlaccount = scanner.nextInt();


            if (withdrawlaccount == 1) {
                System.out.println("How much would you like to withdrawl from your Checkings account?");
                int withdrawlcheck = scanner.nextInt();
                if (withdrawlcheck < 1) {
                Flush();
                System.out.println("Sorry you can not withdrawl less than 1, please try again");
                WithdrawlClass(scanner);
                }
                if (withdrawlcheck < 4414) {
                check = check - withdrawlcheck;
                withdrawlchecking = withdrawlchecking + 1;
                Flush();
                System.out.println("You have successfully withdrawled $"+withdrawlcheck+", your new Checkings balance is: $"+check);
                MenuClass(scanner);
                }
                else if (withdrawlcheck > 4414) {
                Flush();
                System.out.println("Sorry, you do not have that much, please try again"); 
                WithdrawlClass(scanner);
                }
            }
            if (withdrawlaccount == 2) {
                System.out.println("How much would you like to withdrawl from your Savings account?");
                int withdrawlsave = scanner.nextInt();
                if (withdrawlsave < 0) {
                System.out.println("Sorry you can not withdrawl less than 1, please try again");
                WithdrawlClass(scanner);
                }
                if (withdrawlsave < 2712) {
                save = save - withdrawlsave;
                withdrawlsaving = withdrawlsaving + 1;
                Flush();
                System.out.println("You have successfully withdrawled $"+withdrawlsave+", your new Savings balance is: $"+save);
                MenuClass(scanner);
                }
                else if (withdrawlsave > 2712) {
                Flush();
                System.out.println("Sorry, you do not have that much, please try again"); 
                WithdrawlClass(scanner);
                }
            }
            else {
                Flush();
                System.out.println("Please pick a correct choice");
                WithdrawlClass(scanner);
            }
        }
    public static void DepositClass(Scanner scanner) {
            System.out.println("Which account would you like to deposit to?");
            System.out.println("1) Checkings");
            System.out.println("2) Savings");
            int depositaccount = scanner.nextInt();

            //Checkings
            if (depositaccount == 1) {
                System.out.println("How much would you like to deposit into your Checkings account?");
                int depositchecking = scanner.nextInt();
                if (depositchecking > 0) {
                check = check + depositchecking;
                depositcheckings = depositcheckings + 1;
                Flush();
                System.out.println("You have successfully deposited $"+depositchecking+", your new Checkings balance is: $"+check);
                MenuClass(scanner);
                }
                else{
                    System.out.println("Sorry, you can't deposit less than 1, please try again");
                    DepositClass(scanner);
                }
            }
            //Savings
            if (depositaccount == 2) {
                System.out.println("How much would you like to deposit into your Savings account?");
                int depositsaving = scanner.nextInt();
                if (depositsaving > 0) {
                save = save + depositsaving;
                depositsavings = depositsavings + 1;
                Flush();
                System.out.println("You have successfully deposited $"+depositsaving+", your new Savings balance is: $"+save);
                MenuClass(scanner);
                }
                else{
                    System.out.println("Sorry, you can't deposit less than 1, please try again");
                    DepositClass(scanner);
                }
            }
            else {
                Flush();
                System.out.println("Please pick a correct choice");
                DepositClass(scanner);
            }
        }
        public static void TransferClass(Scanner scanner) {
            System.out.println("Hello! How would you like to transfer?");
            System.out.println("1) Savings to Checkings");
            System.out.println("2) Checkings to Savings");
            int transfer = scanner.nextInt();

            if (transfer == 1) {
                System.out.println("How would would you like to transfer to your Checkings?");
                int transfersc = scanner.nextInt();

                if (transfersc > 2712) {
                    Flush();
                    System.out.println("Sorry you do not have that much, please try again");
                    TransferClass(scanner);
                }

                if (transfersc < 0) {
                    Flush();
                    System.out.println("Sorry you cannot transfer less than 1, please try again");
                    TransferClass(scanner);
                }

                else {
                    save = save - transfersc;
                    check = check + transfersc;
                    sctransfer = sctransfer + 1;
                    Flush();
                    System.out.println("You have successfully transfered $"+transfersc+", your new Checkings balance is: $"+check);
                    MenuClass(scanner);
                }
            }

            if (transfer == 2) {
                System.out.println("How would would you like to transfer to your Savings?");
                int transfercs = scanner.nextInt();

                if (transfercs > 2712) {
                    Flush();
                    System.out.println("Sorry you do not have that much, please try again");
                    TransferClass(scanner);
                }

                if (transfercs < 0) {
                    Flush();
                    System.out.println("Sorry you cannot transfer less than 1, please try again");
                    TransferClass(scanner);
                }

                else {
                    check = check - transfercs;
                    save = save + transfercs;
                    cstransfer = cstransfer + 1;
                    Flush();
                    System.out.println("You have successfully transfered $"+transfercs+", your new Savings balance is: $"+save);
                    MenuClass(scanner);
                }
            }
            else {
                Flush();
                System.out.println("Please pick a correct choice");
                TransferClass(scanner);
            }
        }
        public static void Flush() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        public static void CheckBal(Scanner scanner) {
            System.out.println("Account Summary");
            System.out.println("Checkings account: $"+check);
            System.out.println("Savings account: $"+save);
            System.out.println("You have had "+tran+" total transactions");
            System.out.println("");
            System.out.println("What would you like to do next?");
            System.out.println("1) Main Menu");
            System.out.println("2) Transactions Log");
            int mover = scanner.nextInt();

            if(mover == 1) {
                Flush();
                MenuClass(scanner);
            }
            if(mover ==2) {
                Flush();
                TransactionsLog(scanner);
            }
        }

        public static void TransactionsClass(Scanner scanner) {
            tran = withdrawlchecking + depositcheckings + withdrawlsaving + depositsavings + sctransfer + cstransfer;
            System.out.println("Transactions Menu");
            System.out.println("You have had "+tran+" total transactions");
            System.out.println("What would you like to do next?");
            System.out.println("1) Main Menu");
            System.out.println("2) Transactions log");
            int mover = scanner.nextInt();

            if(mover ==1) {
                Flush();
                MenuClass(scanner);
            }
            if(mover ==2) {
                Flush();
                TransactionsLog(scanner);
            }
            else {
                Flush();
                System.out.println("Please pick a correct choice");
                TransactionsClass(scanner);
            }
        }

        public static void TransactionsLog(Scanner scanner) {
            System.out.println("Transactions Log");
            System.out.println("Checkings withdrawl transactions: "+withdrawlchecking);
            System.out.println("Checkings deposit transactions: "+depositcheckings);
            System.out.println("Savings withdrawl transactions: "+withdrawlsaving);
            System.out.println("Savings deposit transactions: "+depositsavings);
            System.out.println("Savings to Checkings transactions: "+sctransfer);
            System.out.println("Checkings to Savings transactions: "+cstransfer);
            System.out.println("");
            System.out.println("Type 1 to go back");
            int mover = scanner.nextInt();

            if(mover == 1) {
                Flush();
                TransactionsClass(scanner);
            }
            else {
                Flush();
                System.out.println("Please pick a correct choice");
                TransactionsClass(scanner);
            }
        }
    }
