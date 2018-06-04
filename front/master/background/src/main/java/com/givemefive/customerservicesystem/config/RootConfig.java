package com.givemefive.customerservicesystem.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


@Configuration
@ComponentScan(basePackages = {"com.givemefive.customerservicesystem.repostory",
        "com.givemefive.customerservicesystem.service"})
@EnableTransactionManagement
public class RootConfig {

    @Bean
    public ComboPooledDataSource dateSource() throws PropertyVetoException {
        ComboPooledDataSource source=new ComboPooledDataSource();
        Properties properties=new Properties();
        InputStream is=getClass().getResourceAsStream("/hibernate.properties");
        try {
            properties.load(is);
            source.setDriverClass(properties.getProperty("driveClass"));
            source.setJdbcUrl(properties.getProperty("url"));
            source.setUser(properties.getProperty("user"));
            source.setPassword(properties.getProperty("password"));
        } catch (IOException e) {
            System.out.print("配置文件读取错误。");
            e.printStackTrace();
        }
        source.setMaxPoolSize(40);
        source.setMinPoolSize(5);
        source.setInitialPoolSize(10);
        source.setMaxIdleTime(3600);
        return source;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dateSource());
        sessionFactoryBean.setPackagesToScan("com.givemefive.customerservicesystem.model");
        Properties properties=new Properties();
        properties.setProperty("dialect","org.hibernate.dialect.MySQLDialect");
        sessionFactoryBean.setHibernateProperties(properties);
        return sessionFactoryBean;
    }

    @Bean(name="transactionManager")
    @Autowired
    @Required
    public HibernateTransactionManager transactionManager(SessionFactory s) {
        HibernateTransactionManager txManager=new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }
}
