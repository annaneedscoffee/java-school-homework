package nener_use_switch_with_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:channelnames.properties")
@ComponentScan(basePackages = "nener_use_switch_with_spring")
public class MessengerConfig {
}
