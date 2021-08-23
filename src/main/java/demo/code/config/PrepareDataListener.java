package demo.code.config;

import demo.code.entity.Bond;
import demo.code.entity.Trade;
import demo.code.repository.TradeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class PrepareDataListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent) {
            ApplicationContext context = ((ContextRefreshedEvent) event).getApplicationContext();
            TradeRepository repository = context.getBean(TradeRepository.class);
            repository.saveAll(IntStream.range(0, 5).mapToObj(i -> {
                Trade trade = new Trade();
                trade.setId(i * 100L);
                trade.setTrader("Trader " + i);
                trade.setBonds(generateBonds(i, 3));
                return trade;
            }).collect(Collectors.toList()));
        }
    }

    private List<Bond> generateBonds(int seg, int size) {
        return IntStream.range(0, size).mapToObj(i -> {
            Bond bond = new Bond();
            bond.setId(seg * 100L + i);
            bond.setCusip("cusip " + bond.getId());
            bond.setFaceValue(100L);
            return bond;
        }).collect(Collectors.toList());
    }
}
