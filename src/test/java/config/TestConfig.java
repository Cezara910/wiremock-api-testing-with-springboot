package config;

import org.aeonbits.owner.ConfigFactory;

public class TestConfig {

    private static final Configuration configuration = ConfigFactory.create(Configuration.class);

    public static Configuration getConfiguration() {
        return configuration;
    }
}
