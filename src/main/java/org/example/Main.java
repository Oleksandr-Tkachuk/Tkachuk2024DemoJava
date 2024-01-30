package org.example;

public class Main {

    /**
     * @Document (пояснення)
     * Java Doc (якась документація. Зазвичай пишеться над методами або над класами)
     */
    public static void main(String[] args) {
//        This is first string (line)
        System.out.println("FIRST STRING (line)");
//        This is second string (line)
        System.out.println("SECOND STRING (line)");

        System.out.println("Sum : " + sum(2222022, 78));
        /*
        System.out.println("SECOND STRING (line)");
        System.out.println("SECOND STRING (line)");
        System.out.println("SECOND STRING (line)");
         */
//        TODO: Fix this (Наприклад, щось, що обов'язково треба буде колись виправити)

//        ADD THIRD BRANCH
        System.out.println("Add some code");
    }

    public static int sum(int first, int second) {
        return first + second;
    }
}