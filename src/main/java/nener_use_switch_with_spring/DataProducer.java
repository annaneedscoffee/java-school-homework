package nener_use_switch_with_spring;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
public class DataProducer {


    private static List<String> channels = List.of("sms", "tel");
    private static Faker faker = new Faker();

    public static Message generateMessage() {
        return Message.builder()
                .channelName(RandomUtil.getRandomElement(channels))
                .content(faker.chuckNorris().fact())
                .build();
    }
}
