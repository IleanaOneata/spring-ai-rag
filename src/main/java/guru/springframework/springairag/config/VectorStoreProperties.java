package guru.springframework.springairag.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author ileanaoneata on 28.06.2024
 */

@Configuration
@ConfigurationProperties(prefix = "sfg.aiapp")
public class VectorStoreProperties {

    private String vectorStorePath;

    public String getVectorStorePath() {
        return vectorStorePath;
    }

    public void setVectorStorePath(String vectorStorePath) {
        this.vectorStorePath = vectorStorePath;
    }
}
