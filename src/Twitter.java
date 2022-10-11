public class Twitter extends Network {

    public Twitter(String userLogin, String userPassword) {
        super(userLogin, userPassword);
    }

    @Override
    boolean logIn(String userName, String password) {
        if (userName.length() != 0 && password.length() != 0) {
            return true;
        } else return false;
    }

    @Override
    void sendData(String data) {
        if (data.length() != 0) {
            System.out.println("New post on Twitter:\n" + data);
        }
    }

    @Override
    void logOut() {
        System.out.println("Logged out from Twitter" + userName);
    }
}
