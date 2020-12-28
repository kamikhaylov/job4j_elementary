package ru.job4j.collection.bank;

import java.util.Objects;

/**
 *  Класс описывает модель пользователя банка.
 *  @author KONSTANTIN MIKHAYLOV
 *  @version 1.0
 */
public class User {
    /**
     *  Эта модель содержит поля:
     *  @param passport номер паспорта
     *  @param username ФИО
     */
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}