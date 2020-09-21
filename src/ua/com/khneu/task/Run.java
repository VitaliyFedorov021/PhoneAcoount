package ua.com.khneu.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    private List<User> users = new ArrayList<>();
    private String input (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String str = sc.nextLine();
        return str;
    }

    public void action() {
        while(true) {
            int a = Integer.parseInt(input("Choose an action(1 - add user, 2 - see info, 0 - exit)"));
            switch (a) {
                case 1: {
                    addUser();
                    continue;
                }
                case 2: {
                    usersInfo();
                    continue;
                }
                case 0: {
                    System.exit(1);
                }
                default: {
                    System.out.println("Incorrect input, try again");
                    continue;
                }
            }
        }

    }

    private void addUser() {
        User user = new User();
        String name;
        name = input("Enter the surname of user");
        user.setSurname(name);
        PhoneAccount account = new PhoneAccount();
        double priceLocal = Double.parseDouble(input("Enter the price of local calls")),
                priceUnlocal = Double.parseDouble(input("Enter the price of unlocal calls")),
                priceWorldWide = Double.parseDouble(input("Enter the price of world wide calls"));
        account.setPriceForLocal(priceLocal);
        account.setPriceForUnlocal(priceUnlocal);
        account.setPriceForWorldWide(priceWorldWide);
        double summaryPrice = (priceLocal + priceUnlocal + priceWorldWide) * 1.2;
        account.setSummaryPrice(summaryPrice);
        user.setPhoneAccount(account);
        users.add(user);
    }

    private void usersInfo() {
        double sumLocal = 0, sumUnlocal = 0, sumWorldWide = 0;
        for (User currentUser:
             users) {
            System.out.println(currentUser.getSurname() + ", " +
                    "Local calls fee: " + currentUser.getPhoneAccount().getPriceForLocal() +
                    " Unlocal calls fee: " + currentUser.getPhoneAccount().getPriceForUnlocal() +
                    " Worldwide calls fee: " + currentUser.getPhoneAccount().getPriceForWorldWide() +
                    " Summary fee: " + currentUser.getPhoneAccount().getSummaryPrice());
            sumLocal += currentUser.getPhoneAccount().getPriceForLocal();
            sumUnlocal += currentUser.getPhoneAccount().getPriceForUnlocal();
            sumWorldWide += currentUser.getPhoneAccount().getPriceForWorldWide();
        }
        System.out.println("Together: " + " Local: " + sumLocal + " Unlocal: " + sumUnlocal + " WorldWide: " + sumWorldWide);
    }
}
