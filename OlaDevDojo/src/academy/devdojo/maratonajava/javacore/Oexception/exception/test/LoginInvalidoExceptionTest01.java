package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);

        String usernameDB = "lucas_the_st8ic";
        String passwordDB = "Lss@123";

        System.out.print("Usuário: ");
        String inputUsername = input.nextLine();

        System.out.print("Senha: ");
        String inputPassword = input.nextLine();

        if (!usernameDB.equals(inputUsername) ||
        !passwordDB.equals(inputPassword)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos.");
        }

        System.out.println("Login efetuado!");
    }
}
