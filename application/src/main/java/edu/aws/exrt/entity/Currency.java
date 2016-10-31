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

    @Column(name = "code")
    @Id
    private String code;

    @Column(name = "name")
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
