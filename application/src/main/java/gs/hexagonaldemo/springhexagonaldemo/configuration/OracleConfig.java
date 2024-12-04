package gs.hexagonaldemo.springhexagonaldemo.configuration;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(basePackages = "gs.hexagonaldemo.repositories") // Cambia por el paquete de tus repositorios
public class OracleConfig {


    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("oracle.jdbc.OracleDriver")
                .url("jdbc:oracle:thin:@//localhost:1521/free") // Cambia localhost, puerto y servicio
                .username("system") // Cambia por tu usuario
                .password("ORACLE01") // Cambia por tu contraseña
                .build();
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean factoryBean = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setPackagesToScan("gs.hexagonaldemo.entity");

        org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter vendorAdapter =
                new org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter();
        factoryBean.setJpaVendorAdapter(vendorAdapter);

        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
        properties.put("hibernate.show_sql", "true");
        factoryBean.setJpaPropertyMap(properties);

        return factoryBean;
    }


}