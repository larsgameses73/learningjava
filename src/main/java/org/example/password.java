package org.example;
import java.util.Random;

class Password {

    public Random random;

    public Password() {
        random = new Random();
    }

    public String generatePassword(int length) {
        String password = "";
        for (int j = 0; j < length; j++) {
            char u = (char) (random.nextInt(62) + '0');

            password = password + u;
        }

        System.out.print(password);
        System.out.println("   your password is " + length + " characters long");

        return password;
    }


}