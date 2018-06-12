package site.headfirst.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="site.headfirst")
public class SecurityProperties {

    private BrowserProperties web = new BrowserProperties();

    public BrowserProperties getWeb() {
        return web;
    }

    public void setWeb(BrowserProperties web) {
        this.web = web;
    }
}
