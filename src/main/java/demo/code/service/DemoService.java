package demo.code.service;

import demo.code.entity.Trade;
import demo.code.repository.TradeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private TradeRepository tradeRepository;
    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public Iterable<Trade> findAll() {
        logger.info("findAll() invoked");
        return tradeRepository.findAll();
    }
}
