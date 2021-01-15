package ru.job4j.collection.stream.builder;

public class Account {
    private String login;
    private String password;
    private String mail;
    private String name;
    private String surname;
    private String birthday;
    private int id;
    private boolean activated;

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", id=" + id +
                ", activated=" + activated +
                '}';
    }

    static class Builder {
        private String login;
        private String password;
        private String mail;
        private String name;
        private String surname;
        private String birthday;
        private int id;
        private boolean activated;

        Builder buildLogin(String login) {
            this.login = login;
            return this;
        }

        Builder buildPassword(String password) {
            this.password = password;
            return this;
        }

        Builder buildMail(String mail) {
            this.mail = mail;
            return this;
        }

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        Builder buildId(int id) {
            this.id = id;
            return this;
        }

        Builder buildActivated(Boolean activated) {
            this.activated = activated;
            return this;
        }

        Account build() {
            Account account = new Account();
            account.login = login;
            account.password = password;
            account.mail = mail;
            account.name = name;
            account.surname = name;
            account.birthday = birthday;
            account.id = id;
            account.activated = activated;
            return account;
        }
    }

    public static void main(String[] args) {
        Account account = new Builder()
                .buildLogin("Login")
                .buildPassword("Password")
                .buildMail("mail@post.ru")
                .buildName("Name")
                .buildSurname("Surname")
                .buildBirthday("01.01.1990")
                .buildId(1)
                .buildActivated(true)
                .build();
        System.out.println(account);
    }
}