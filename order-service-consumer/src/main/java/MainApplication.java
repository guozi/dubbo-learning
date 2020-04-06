import me.guozi.gmail.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by chenyun on 2020/4/2
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        final OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");

        System.in.read();
    }
}
