
Scanner scanner = new Scanner(System.in);

void main() {

    createNewUser();
    String enteredUserName;
    while (true) {
        System.out.println("Enter user name");
        enteredUserName = scanner.nextLine().toLowerCase();
        if(authentication(enteredUserName)) break;
    }
}

private boolean authentication(String enteredUserName) {
    String userPass;
    System.out.println("Enter password");
    userPass = scanner.nextLine();
    if (Authentication.loginVerification(enteredUserName, userPass)) {
        return true;
    }
    return false;
}


private static void createNewUser() {
    User user1 = new User();
    user1.setUserList("pavlenko1996", user1);
    user1.setUserEMail("oleksandr.Pavlenko@mail.com");
    user1.setUserName("pavlenko1996");
    user1.setPassword("1q2W3e$r");
}
