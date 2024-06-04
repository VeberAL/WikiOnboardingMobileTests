package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:host/${deviceHost}.properties"
})
public interface HostConfig extends Config {

    @Key("host.url")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String hostUrl();

    @Key("device.name")
    @DefaultValue("Samsung Galaxy S21")
    String deviceName();

    @Key("platform.version")
    @DefaultValue("11.0")
    String platformVersion();

    @Key("app.url")
    @DefaultValue("bs://c5f5869e3e0345848437d2115b28f880e7cc4ed3")
    String appUrl();
}
