package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Properties;

@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {

        System.setProperty("hello_key", "hello_value!!!");
        String helloVal = System.getProperty("hello_key");
        log.info("hello = {}", helloVal);

        Properties properties = System.getProperties();
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            log.info("prop {} = {}", entry.getKey(), String.valueOf(entry.getValue()));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info(url);
        log.info(username);
        log.info(password);
    }
}
