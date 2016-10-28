package edu.aws.exrt.repository;

import edu.aws.exrt.entity.ExchangeRate;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ilya Y. Ivanov
 */
public interface ExchangeRateRepository extends CrudRepository<ExchangeRate, Long> {
}
