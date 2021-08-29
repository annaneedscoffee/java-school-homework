package nener_use_switch_with_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import real_spring.QuoterConfig;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessengerConfig.class);
        MessageDistributor distributor = context.getBean(MessageDistributor.class);


        while (true) {
            Message message = DataProducer.generateMessage();
            distributor.distribute(message);
            Thread.sleep(500);
        }
    }
}
