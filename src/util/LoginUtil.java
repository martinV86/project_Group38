package util;

import exception.WrongLoginException;

public class LoginUtil {
    public static boolean checkLogin(StringBuilder login){
        boolean f=true;
        try {
            checkLoginException(login);
        } catch (WrongLoginException e) {
            e.printStackTrace();
            f=false;
        }
        finally {if (f){return true;}
        else {return false;}

        }
    }
    private static void checkLoginException(StringBuilder login) throws WrongLoginException {
        String strlogin=String.valueOf(login);
        boolean onlyLatinABC=strlogin.matches("^[a-zA-Z0-9_a-zA-Z0-9]+$");
        if (onlyLatinABC){
        }else {
            throw new WrongLoginException();

        }
        if (login.length()>20){
            throw new WrongLoginException("WrongLoginException - количеств символоов превышено");
        }
    }

}
