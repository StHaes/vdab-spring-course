package com.realdolmen.spring;

import com.realdolmen.spring.repository.FoodRepository;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;

@ComponentScan
@EnableTransactionManagement
public class ZooConfig {
//    @Bean
//    public FoodRepository foodRepository(){
//        Foodrepository f = new J
//    }
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    // TODO: Configure a DataSource for MySQL in the production profile (BasicDataSource)
    @Profile("production")
    @Bean
    public DataSource dataSource() throws SQLException {
        DataSource ds = new BasicDataSource();
        ds.getConnection("root","");
        return ds;
    }

    // TODO: configure an embedded DataSource for H2 in the test profile
    @Profile("test")
    @Bean
    public DataSource embeddedDataSource(){
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }



    // TODO: Configure an EntityManagerFactory bean for use with Hibernate
    @Profile("test")
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() throws SQLException {
        LocalContainerEntityManagerFactoryBean lf = new LocalContainerEntityManagerFactoryBean();
        lf.setPackagesToScan("com.realdolmen.spring");
        lf.setDataSource(embeddedDataSource());
        return lf;
    }

    // TODO: Make sure your EntityManagerFactoryBean is set up for using dialect H2 in test and dialect MySQL in production
}
