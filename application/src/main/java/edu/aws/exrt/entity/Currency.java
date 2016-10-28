package edu.aws.exrt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ilya Y. Ivanov
 */
@Entity
@Table(name = "currency")
public class Currency {

    @Column(name = "currency_code")
    @Id
    private String currencyCode;

    @Column(name = "name")
    private String name;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getName() {
        return name;
    }
}
