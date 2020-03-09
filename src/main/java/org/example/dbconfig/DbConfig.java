package org.example.dbconfig;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DbConfig {

	@Bean
	public DataSource getDataSource() {

		DataSourceBuilder data = DataSourceBuilder.create();
		data.username("root");
		data.password("");
		data.url("jdbc:mysql://localhost:3306/springcloud");
		data.driverClassName("com.mysql.jdbc.Driver");
		return data.build();
	}
}
