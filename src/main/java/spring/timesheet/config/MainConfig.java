// package spring.timesheet.config;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
// import org.springframework.core.env.Environment;

// import spring.timesheet.security.Crypto;

// import javax.sql.DataSource;

// @Configuration
// public class MainConfig {

// @Autowired
// private Environment environment;

// @Primary
// @Bean
// public DataSource getDataSource() {
// DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
// dataSourceBuilder.driverClassName(environment.getProperty("spring.datasource.driverClassName"));
// dataSourceBuilder.url(Crypto.performDecrypt(environment.getProperty("spring.datasource.url")));
// dataSourceBuilder.username(Crypto.performDecrypt(environment.getProperty("spring.datasource.username")));//
// environment.getProperty("spring.datasource.user")
// dataSourceBuilder.password(Crypto.performDecrypt(environment.getProperty("spring.datasource.password")));//
// environment.getProperty("spring.datasource.password")
// return dataSourceBuilder.build();
// }
// }
