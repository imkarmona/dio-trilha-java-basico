package org.imkarmona;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int number;
        String agency;
        String customerName;
        double balance;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        agency = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        customerName = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
    }
}