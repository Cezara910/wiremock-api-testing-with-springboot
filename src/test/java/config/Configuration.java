package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:configuration.properties"})
public interface Configuration extends org.aeonbits.owner.Config {
    @Key("credit_request_service.host")
    String host();
    @Key("credit_request_service.scheme")
    String urlScheme();
    @Key("credit_request_service.port")
    Integer port();
    @Key("credit_request_service.resourceUri")
    String resourceUri();
}
