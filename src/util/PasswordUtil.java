package util;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.text.ParseException;

public class PasswordUtil {
    public static boolean checkPassword(StringBuilder password, StringBuilder confirmPassword) {
        boolean f=true;
        try {
            checkPasswordException(password);

        } catch (WrongPasswordException e) {
            e.printStackTrace();
            f= false;
        }
        try {
            checkconfirmPassword(password, confirmPassword);

        } catch (WrongPasswordException e) {
            e.printStackTrace();
            f= false;
        } finally {if (f){
            return true;
        }else {return false;}
        }

    }

    private static void checkPasswordException(StringBuilder password) throws WrongPasswordException {
        String strpass = String.valueOf(password);
        boolean onlyLatinABC = strpass.matches("^[a-zA-Z0-9_a-zA-Z0-9]+$");
        if (onlyLatinABC && password.length() < 20) {
        } else {
            throw new WrongPasswordException();
        }

    }

    private static void checkconfirmPassword(StringBuilder password, StringBuilder confirmPassword) throws WrongPasswordException {
        String strpass = String.valueOf(password);
        String confirmpass = String.valueOf(confirmPassword);
        if (strpass.equals(confirmpass)) {
        } else {
            throw new WrongPasswordException("Пароль не подтвержден");
        }
    }
}
