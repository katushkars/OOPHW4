public class Data {
    private static final String VALID_CHARACTERS="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    private static void checkData(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин неверный");
        }
        if (!validate(login)) {
            throw new WrongPasswordException("Пароль неверный");
        }
        if (password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
        private static boolean validate (String s){
        if (s.length()>20){
            return false;
        }
            for (int i = 0; i < s.length(); i++) {
                if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                    return false;
                }
                }
                return true;
            }
        }


