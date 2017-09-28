package com.hillel.language.basis25.deadlockExample;

public class DeadlockMain {

    public static void main(String[] args) {
        Account a = new Account(1000);
        Account b = new Account(2000);

        for( int i = 0; i < 10; i ++) {
            new Thread(new AccountTransfer(a, b)).start();
            new Thread(new AccountTransfer(b, a)).start();
        }

        System.out.println("Finish");
    }
}
