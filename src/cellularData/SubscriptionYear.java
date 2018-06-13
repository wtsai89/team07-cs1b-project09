package cellularData;

/**
 * This is the class for the lists of the subscriptions during the time period of the years.
 */
public class SubscriptionYear {
    private int year;
    private double subscriptions;

    /**
     * Supposed to get the subscriptions per year
     * @param year The number of years passed in
     * @param numberOfSubscriptions How many subscriptions there are
     */
    public SubscriptionYear(int year, double numberOfSubscriptions)    // constructor method
    {
        setYear(year);
        setSubscriptions(numberOfSubscriptions);

    }

    public double getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(double subscriptions) {
        this.subscriptions = subscriptions;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return this.getSubscriptions() + "";
    }


}