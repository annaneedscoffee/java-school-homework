package nener_use_switch_with_spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TelMessageCreator implements MessageCreator{
    @Getter
    @Value("tel")
    String channelName;

    @Override
    public void printMessage(Message message) {
        System.out.println("call was made with text: "+message.getContent());
    }
}
