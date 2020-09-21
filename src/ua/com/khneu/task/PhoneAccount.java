package ua.com.khneu.task;

public class PhoneAccount {
    private double priceForLocal, priceForUnlocal, priceForWorldWide, summaryPrice;

    public double getPriceForLocal() {
        return priceForLocal;
    }

    public void setPriceForLocal(double priceForLocal) {
        this.priceForLocal = priceForLocal;
    }

    public double getPriceForUnlocal() {
        return priceForUnlocal;
    }

    public void setPriceForUnlocal(double priceForUnlocal) {
        this.priceForUnlocal = priceForUnlocal;
    }

    public double getPriceForWorldWide() {
        return priceForWorldWide;
    }

    public void setPriceForWorldWide(double priceForWorldWide) {
        this.priceForWorldWide = priceForWorldWide;
    }

    public double getSummaryPrice() {
        return summaryPrice;
    }

    public void setSummaryPrice(double summaryPrice) {
        this.summaryPrice = summaryPrice;
    }
}
