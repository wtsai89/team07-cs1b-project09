package cellularData;

import java.util.Arrays;
import java.util.Iterator;

// Once it compiles Submit what I have.
public class Country<LinkedList> {



    String name;
    Country next;
    cellularData.SubscriptionYear[] subscriptions;
    private int minYear;
    private int maxYear;
    int i = 0;

    /**
     * The constructor that is supposed to pass in the name of the country
     * @param name
     */
    public Country(String name) {
        this.minYear = 9999;
        this.maxYear = 0;
        this.name = name;
        subscriptions = new cellularData.SubscriptionYear[300];
        Arrays.fill(subscriptions,new cellularData.SubscriptionYear(0,0.0));
    }

    public Country() {

    }

    /**
     * The getter method for the instance variable name.
     * @return
     */
    public String getName() {
        return name;
    }





    public Country(Country parameterCountry, Country next) {
        this.next = parameterCountry.next;
        this.name = parameterCountry.name;
    }



   /* public String toString() {
        for(name : next){
            subscriptions =
        }
        return this.toString();*/

    //}

    /**
     * A method used to add subscriptions to the link
     * @param year
     * @param subscription
     */
    public void addSubscriptionYear(int year, double subscription) {
        cellularData.SubscriptionYear s = new cellularData.SubscriptionYear(year, subscription);

        subscriptions[this.i++] = s;
    }

    public double getNumSubscriptionsForPeriod(int startYear, int endYear) {
        double sum = 0.0;
        if (startYear > endYear) {
            throw new IllegalArgumentException("Start year cannot be greater than end year.");
        } else if (startYear < 1 | endYear < 1) {
            throw new IllegalArgumentException("Year must be positive.");
        } else {
            Iterator s = new Iterator<cellularData.SubscriptionYear>() {


                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public cellularData.SubscriptionYear next() {
                    return null;
                }
            };
            while(s.hasNext()){

                s.next();
            }

        }
        return sum;
    }

    /**
     * The toString method for this class.
     * @return
     */
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", next=" + next +
                ", subscriptions=" + Arrays.toString(subscriptions) +
                ", minYear=" + minYear +
                ", maxYear=" + maxYear +
                ", i=" + i +
                '}';
    }



}

