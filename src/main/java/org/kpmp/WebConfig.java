package org.kpmp;

import org.kpmp.repositoryDataset.RepositoryDatasetDisplay;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;


@Configuration
@EnableAutoConfiguration
@RegisterReflectionForBinding({RepositoryDatasetDisplay.class})
public class WebConfig implements WebMvcConfigurer {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}