import java.util.Scanner;

public abstract class Network {
    String userName;
    String password;

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    abstract boolean logIn(String userName, String password);

    abstract void sendData(String data);

    abstract void logOut();

    public void post(String message) {
        if (logIn(userName, password)) {
            System.out.println("Logged in as: " + userName);
            System.out.println("Create new post: ");
            Scanner sc = new Scanner(System.in);
            message = sc.nextLine();
            sendData(message);
            logOut();
        } else {
            System.out.println("Login failed!");
        }
    }
}
