package com.company;

public interface MoneyTransferInterface {
    void withdraw(double amount);

    void deposit(double amount);

    void transfer(MoneyTransferController from, MoneyTransferController to, double amount);

}
