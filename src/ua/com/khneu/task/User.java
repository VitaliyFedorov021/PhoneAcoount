package ua.com.khneu.task;

public class User {
    private String surname;
    private PhoneAccount phoneAccount = new PhoneAccount();

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PhoneAccount getPhoneAccount() {
        return phoneAccount;
    }

    public void setPhoneAccount(PhoneAccount phoneAccount) {
        this.phoneAccount = phoneAccount;
    }
}
