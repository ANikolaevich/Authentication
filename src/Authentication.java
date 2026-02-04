public class Authentication {
    public static boolean loginVerification(String userName, String userPass) {
        boolean statusAuthentication;
        if (User.getUserList().containsKey(userName)) {
            statusAuthentication = authentication(User.getUserList().get(userName), userName, userPass);
        }else {
            messageToUser();
            statusAuthentication = false;
        }
        return statusAuthentication;
    }

    private static boolean authentication(User user, String userName, String userPass) {
        if (userName.equals(user.getUserName())
                && userPass.equals(user.getPassword())) {
            System.out.println("Successful authentication");
            return true;
        } else {
            messageToUser();
            return false;
        }
    }

    private static void messageToUser() {
        System.out.println("Access denied");
        System.out.println("Check the correctness of the login or password");
    }
}
