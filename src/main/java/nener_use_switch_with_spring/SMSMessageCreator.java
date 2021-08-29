package nener_use_switch_with_spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SMSMessageCreator implements MessageCreator{
    @Getter
    @Value("sms")
    String channelName;
    @Override
    public void printMessage(Message message) {
        System.out.println("sms was sent with text: "+message.getContent());
    }
}
