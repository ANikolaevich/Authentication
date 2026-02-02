public class Authentication {
    /**
     * The method verifies the authenticity of the login.
     * If the login exists, it calls the password verification method.
     * @param userName login.
     * @param userPass password.
     * @return true - if the data is correct. false - if the data is inconcrete.
     */
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

    /**
     * The method verifies that the password entered is correct.
     * @param user user.
     * @param userName user name.
     * @param userPass password.
     * @return true - if the data is correct. false - if the data is inconcrete.
     */
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

    /**
     * A message to the user in case of incorrect data entered.
     */
    public static void messageToUser() {
        System.out.println("Access denied");
        System.out.println("Check the correctness of the login or password");
    }
}
