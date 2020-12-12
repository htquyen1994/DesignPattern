package com.example.desingpattern.Creational.Builder;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private final String address;
    private final String email;
    private final String mobile;


    public BankAccount(String name, String accountNumber, String address, String email, String mobile) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
    }


    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String address;
        private String email;
        private String mobile;

        public BankAccountBuilder(String name, String accountNumber) {
            this.accountNumber = accountNumber;
            this.name = name;
        }

        public BankAccountBuilder WithAddress(String address) {
            this.address = address;
            return this;
        }

        public BankAccountBuilder WithEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder WithMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public BankAccount builder() {
            return new BankAccount(this.name, this.accountNumber, this.address, this.email, this.mobile);
        }
    }
}
