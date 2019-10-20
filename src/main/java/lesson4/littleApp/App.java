package lesson4.littleApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //scanner
        //authorization
        //while
        //считывание команды
        //switch
        UserServise userServise = new UserServise();
        while(true) {
            System.out.println("Your login is: ");
            String l = sc.next();
            System.out.println("Your password is: ");
            String p = sc.next();
            if (userServise.auth(l, p)) {
                System.out.println("Welcome to our swamp");
            } else {
                System.out.println("You're wrong tho");
            }
            while (userServise.auth(l, p)) {
                System.out.println("Choose the command:\n 1.Add User\n 2.Get by login\n 3.Delete by login\n 4.Get all users\n 5.Get by FullName\n 6.Edit user\n 7.End the program\n");
                int command = sc.nextInt();
                switch (command) {
                    case 1: {
                        System.out.println("Enter login: ");
                        String login = sc.next();
                        System.out.println("Enter password: ");
                        String password = sc.next();
                        System.out.println("Your full name: ");
                        String name = sc.next();
                        User user1 = new User(login, password, name);
                        if (userServise.addUser(user1)) {
                            System.out.println("Successfully added");
                        } else {
                            System.out.println("Error occurred");
                        }
                        break;
                    }
                    case 2: {
                        String login = sc.next();
                        userServise.getByLogin(login);
                        break;
                    }
                    case 3: {
                        String login = sc.next();
                        if (login.equals("admin")) {
                            System.out.println("What the @@@@ are you trying to do?");
                        } else {
                            userServise.deleteByLogin(login);
                            System.out.println("The user is deleted");
                        }
                        break;
                    }
                    case 4: {
                        userServise.getAllUsers();
                        break;
                    }
                    case 5: {
                        String name = sc.next();
                        userServise.getByFullname(name);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter login: ");
                        String login = sc.next();
                        if (!login.equals("admin")) {
                            System.out.println("Enter password: ");
                            String password = sc.next();
                            System.out.println("Enter full name: ");
                            String name = sc.next();
                            User A = new User(login, password, name);
                        } else {
                            System.out.println("Don't you dare to edit admin!");
                        }
                        break;
                    }
                    case 7:
                        l = " ";
                        p = " ";
                        System.exit(0);
                }
                userServise.saveData();
            }
        }
    }
}
