package demo.code.controller;

import demo.code.entity.Bond;
import demo.code.entity.Trade;
import demo.code.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/findAll")
    public Iterable<Trade> findAll() {
        return demoService.findAll();
    }
}
