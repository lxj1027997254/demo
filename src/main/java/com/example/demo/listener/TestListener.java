package com.example.demo.listener;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by LXJ on 2021-03-12.
 */
@Configuration
public class TestListener implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        Iterable<ConfigurationPropertySource> propertySources = ConfigurationPropertySources.get(environment);
        Binder binder = new Binder(propertySources);
        Map map = binder.bind("lxj", Map.class).get();
        String names = (String) map.get("names");
        for (String prefix : names.split(",")) {
            Map<String, String> map1 = (Map<String, String>) map.get(prefix);
            Iterator<Map.Entry<String, String>> iterator = map1.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> next = iterator.next();
                System.out.println(next.getKey() + ":" + next.getValue());
            }
        }
    }
}
