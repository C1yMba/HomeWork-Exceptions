public class PersonAuthentication {
    public static boolean checkAuthenticationData(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException, WrongPasswordExceptionConfirm {
        boolean loginLength = login.length() <= 20 && login.length() >= 5;
        boolean loginMatch = login.matches("[a-zA-Z0-9_]+");
        boolean passwordLength = password.length() <= 20 && password.length() >= 5;
        boolean passwordMatch = password.matches("[a-zA-Z0-9_]+");
        boolean passwordConfirmed = password.equals(confirmPassword);

        if (!loginLength && login.length() < 5) {
            throw new WrongLoginException("Не допустимая длина логина. Длина логина, не менее 5 символов");
        } else if (!loginLength) {
            throw new WrongLoginException("Не допустимая длина логина. Длина логина, не более 20 символов");
        }

        if (!loginMatch) {
            throw new WrongPasswordException("Логин может содержать в символы: латинские буквы, цифры и знак подчеркивания");
        }

        if (!passwordLength && password.length() < 5) {
            throw new WrongPasswordException("Не допустимая длина пароля. Длина пароля, не менее 5 символов");
        } else if (!passwordLength) {
            throw new WrongPasswordException("Не допустимая длина пароля. Длина пароля, не более 20 символов");
        }

        if (!passwordMatch) {
            throw new WrongPasswordException("Пароль может содержать в символы: латинские буквы, цифры и знак подчеркивания");
        }

        if (!passwordConfirmed) {
            throw new WrongPasswordExceptionConfirm("Поля пароль и подтверждение пароля, не совпадают!");
        }
        return true;
    }
}
