import java.util.Scanner;

public class AbstractClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String userLogin, userPassword;
        while (running) {
            System.out.println("Log in: \n\t1 - Facebook\n\t2 - Twitter\n\t3 - quit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Log in Facebook");
                    scanner.nextLine();
                    System.out.println("Enter login: ");
                    userLogin = scanner.nextLine();
                    System.out.println("Enter password: ");
                    userPassword = scanner.nextLine();
                    Network facebookUser = new Facebook(userLogin, userPassword);
                    facebookUser.post("Hi");
                    break;
                case 2:
                    System.out.println("Logowanie Twitter");
                    scanner.nextLine();
                    System.out.println("Enter login: ");
                    userLogin = scanner.nextLine();
                    System.out.println("Enter password: ");
                    userPassword = scanner.nextLine();
                    Network twitterUser = new Twitter(userLogin, userPassword);
                    twitterUser.post("Hi");
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Incorrect data provided!!!");
            }
        }
    }
}
