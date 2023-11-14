public class Main {
    public static void main(String[] args) {
        try {
            if (PersonAuthentication.checkAuthenticationData("abdsssbs1%", "ccdcdccd1", "ccdcdccd1")) {
                System.out.println("Регистрация прошла успешно");
            }
        } catch (WrongLoginException e) {
            System.out.println("Логин не верен, регистрация не возможна");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль не верен, регистрация не возможна");
        } catch (WrongPasswordExceptionConfirm e) {
            System.out.println("Пароль не подтверждён, регистрация не возможна");
        }
    }
}