package course.sf.sfg_externalized_properties.config;

import course.sf.sfg_externalized_properties.example_beans.FakeJmsBroker;
import course.sf.sfg_externalized_properties.example_beans.FakeUserProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:jms.properties"),
        @PropertySource("classpath:user.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${pratikdk.username}")
    private String username;

    @Value("${pratikdk.password}")
    private String password;

    @Value("${pratikdk.dburl}")
    private String dbUrl;

    @Value("${pratikdk.jms.username}")
    private String jmsUsername;

    @Value("${pratik.jms.password}")
    private String jmsPassword;

    @Value("${pratik.jms.dbUrl}")
    private String jmsDbUrl;


    @Bean
    public FakeUserProp fakeUserProp() {
        return new FakeUserProp(username, env.getProperty("forge"), dbUrl);
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        return new FakeJmsBroker(jmsUsername, jmsPassword, jmsDbUrl);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
