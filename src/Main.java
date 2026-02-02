
Scanner scanner = new Scanner(System.in);

void main() {
    createNewUser();
    loginAndPasswordRequest();

}

private void loginAndPasswordRequest() {
    while(true) {
        System.out.println("Enter user name");
        String enteredUserName = scanner.nextLine().toLowerCase();
        System.out.println("Enter password");
        String userPass = scanner.nextLine();
        if(Authentication.loginVerification(enteredUserName, userPass)){
            break;
        };
    }
}


private static void createNewUser() {
    User user1 = new User();
    user1.setUserList("pavlenko1996", user1);
    user1.setUserEMail("oleksandr.pavlenko@mail.com");
    user1.setUserName("pavlenko1996");
    user1.setPassword("1q2W3e$r");
}
