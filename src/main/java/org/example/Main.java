package org.example;

import org.w3c.dom.ls.LSOutput;

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


/*
        git flow - це набір Git-розширень, які надають вам більше зручний та вищий рівень абстракції над використанням гілок у Git.
        Це є методологія ведення гілок у Git, яка спрощує процес розробки та випуску програмного забезпечення.

        git flow додає нові команди до Git, які полегшують створення та управління цими гілками.
        Використання git flow може бути особливо корисним для команд, які ведуть регулярний випуск програмного забезпечення та хочуть забезпечити стабільність та організованість у розробці.
 */

//        LATER CREATED NEW BRANCH (---> git checkout -b "feature_branch" --->)
        System.out.println("New feature development...");
    }

    public static int sum(int first, int second) {
        return first + second;
    }
}