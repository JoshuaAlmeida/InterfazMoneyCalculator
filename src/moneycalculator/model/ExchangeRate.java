package moneycalculator.model;

import java.util.Date;

public class ExchangeRate {

    private Currency source;
    private Currency target;
    private Double rate;
    private Date date;

    public ExchangeRate(Currency source, Currency target, Date date, Double rate) {
        this.source = source;
        this.target = target;
        this.rate = rate;
        this.date = date;
    }

    public Double getRate() {
        return rate;
    }

    public Currency getSource() {
        return source;
    }

    public Currency getTarget() {
        return target;
    }

    public Date getDate() {
        return date;
    }
}
