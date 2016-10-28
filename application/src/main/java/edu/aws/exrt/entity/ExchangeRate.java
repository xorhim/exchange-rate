package edu.aws.exrt.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Ilya Y. Ivanov
 */
@Entity
@Table(name = "exchange_rate")
public class ExchangeRate {

    @Id
    @Column(name = "exchange_rate_id")
    private Long exchangeRateId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_currency_code")
    private Currency source;

    @ManyToOne(fetch  = FetchType.LAZY)
    @JoinColumn(name = "target_currency_code")
    private Currency target;

    @Column(name = "rate")
    private Double rate;

    @Column(name = "valid_since")
    private LocalDateTime validSince;

    public Long getExchangeRateId() {
        return exchangeRateId;
    }

    public Currency getSource() {
        return source;
    }

    public Currency getTarget() {
        return target;
    }

    public Double getRate() {
        return rate;
    }

    public LocalDateTime getValidSince() {
        return validSince;
    }
}
