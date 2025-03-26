package zooecosystem;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Username must be at least 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters and cannot contain username.");
        }
    }

    public void userInformation() {
        System.out.println("Email: " + email + "\nUsername: " + userName + "\nPassword: " + password);
    }
}
