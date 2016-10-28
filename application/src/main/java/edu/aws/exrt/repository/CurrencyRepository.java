package edu.aws.exrt.repository;

import edu.aws.exrt.entity.Currency;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ilya Y. Ivanov
 */
public interface CurrencyRepository extends CrudRepository<Currency, String> {
}
