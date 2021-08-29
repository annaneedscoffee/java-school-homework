package nener_use_switch_with_spring;

import lombok.SneakyThrows;
import my_spring.ProxyConfigurator;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import real_spring.Quoter;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */

@Component
public class MessageDistributor {

    @Autowired
    private List<MessageCreator> messageCreators;

    @SneakyThrows
    public void distribute(Message message){

        for (MessageCreator i : messageCreators){
            if(i.getChannelName().equals(message.getChannelName())){
            i.printMessage(message);
        };}
    }


}
