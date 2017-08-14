package safeProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

/**
 * Created by sin5 on 2017/5/22.
 */
@Component
@ConfigurationProperties(prefix = "sin5")
public class PropertiesSettings {
    private String name;
    private Long age;
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private Charset charset = DEFAULT_CHARSET;
    private boolean force = true;

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
