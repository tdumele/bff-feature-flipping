package fr.tdumele.feature_flipping;

import fr.tdumele.feature_flipping.config.security.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecurityProperties.class)
public class FeatureFlippingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureFlippingApplication.class, args);
	}

}
