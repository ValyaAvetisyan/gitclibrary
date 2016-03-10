package am.gitc.service.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db-config.properties")
@EntityScan("am.gitc.service.model")
@EnableJpaRepositories("am.gitc.service")
@EnableTransactionManagement
public class DataConfig {

}
