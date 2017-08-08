package com.kodilla.airline;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Flight {
    private String from;
    private String to;

    public Flight(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {

        return from;
    }

    @Override
    public String toString() {
        return from+"--->"+to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!from.equals(flight.from)) return false;
        return to.equals(flight.to);
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }
}
