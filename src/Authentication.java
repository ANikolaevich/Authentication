public class Authentication {

    /**
     * The method checks the correctness of the entered login. If true, it calls the authentication() method.
     * If false, it calls the messageToUser() method.
     * @param userName user name.
     * @param userPass password.
     * @return true or false.
     */
    public static boolean loginVerification(String userName, String userPass) {
        boolean statusAuthentication;
        if (User.getUserList().containsKey(userName)) {
            statusAuthentication = authentication(User.getUserList().get(userName), userPass);
        }else {
            messageToUser();
            statusAuthentication = false;
        }
        return statusAuthentication;
    }

    /**
     * The method checks the correctness of the entered password.
     * @param user instance of the user class.
     * @param userPass password.
     * @return true or false.
     */
    private static boolean authentication(User user, String userPass) {
        if (userPass.equals(user.getPassword())) {
            System.out.println("Successful authentication");
            return true;
        } else {
            messageToUser();
            return false;
        }
    }

    /**
     * Message to the user.
     */
    private static void messageToUser() {
        System.out.println("Access denied");
        System.out.println("Check the correctness of the login or password");
    }
}
