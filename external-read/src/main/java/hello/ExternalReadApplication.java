package hello;

import hello.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
// @Import(MyDataSourceValueConfig.class)
// @Import(MyDataSourceConfigV2.class)
@Import(MyDataSourceConfigV3.class)
@ConfigurationPropertiesScan("hello.datasource")
@SpringBootApplication(scanBasePackages = {"hello.datasource"})
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
