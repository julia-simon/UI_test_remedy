package com.client.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/credentials.properties"
})

public interface CredentialsConfig extends Config{
    @Key("loginAccount")
    String getLoginAccount();

    @Key("passwordAccount")
    String getPasswordAccount();
}
