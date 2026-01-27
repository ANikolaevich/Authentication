private static HashMap<String, User> userList = new HashMap<>();
Scanner scanner = new Scanner(System.in);

void main() {

    createNewUser();
    System.out.println("Enter user name or email");
    String enteredUserName = scanner.nextLine().toLowerCase();
    while (true) {
        if (userList.containsKey(enteredUserName) ||
                enteredUserName.equals(userList.get(enteredUserName).getUserEMail())) {
            authentication(userList.get(enteredUserName), enteredUserName);
        }
    }
}

private void authentication(User user, String enteredUserName) {
    String userPass;
    System.out.println("Enter password");
    userPass = scanner.nextLine();
    if (enteredUserName.equals(user.getUserName())
            && userPass.equals(user.getPassword())) {
        System.out.println("Successful authentication");
    } else {
        System.out.println("Access denied");
    }
}

private static void createNewUser() {
    User user1 = new User();
    userList.put("pavlenko1996", user1);
    user1.setUserEMail("oleksandr.Pavlenko@mail.com");
    user1.setUserName("pavlenko1996");
    user1.setPassword("1q2W3e$r");
}