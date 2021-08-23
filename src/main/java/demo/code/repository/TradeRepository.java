package demo.code.repository;

import demo.code.entity.Bond;
import demo.code.entity.Trade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CrudRepo contains many apis which will be generated during runtime, ai will not generate test cases for them.
 * It will complain nothing to write while there is no custom methods in this repository
 */
@Repository
public interface TradeRepository extends CrudRepository<Trade, Long> {

}
