package org.wkipedia.en.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${host}.properties"})
public interface CredentialsConfig extends Config {
    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("os_version")
    String os_version();

    @Key("project")
    String project();

    @Key("build")
    String build();

    @Key("name")
    String name();

    @Key("platformName")
    String platformName();

    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("hostURL")
    String hostURL();

    @Key("appURL")
    String appURL();

    @Key("appPath")
    String appPath();
}