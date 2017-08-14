package safeProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sin5 on 2017/5/22.
 */
@RestController
@SpringBootApplication
public class SafePropertiesApplication {

    @Autowired
    private PropertiesSettings propertiesSettings;

    @RequestMapping("/")
    public String index() {
        return propertiesSettings.getName() + propertiesSettings.getAge() + propertiesSettings.getCharset() + propertiesSettings.isForce();
    }

    public static void main(String[] args) {
        SpringApplication.run(SafePropertiesApplication.class, args);
    }
}
