package com.cloud.greeter.autoconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cloud.greeter")
@Getter
@Setter
public class GreeterProperties {
    private String userName;
    private String morningMessage;
    private String afternoonMessage;
    private String eveningMessage;
    private String nightMessage;
}
