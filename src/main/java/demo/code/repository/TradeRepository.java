package demo.code.repository;

import demo.code.entity.Bond;
import demo.code.entity.Trade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends CrudRepository<Trade, Long> {

}
