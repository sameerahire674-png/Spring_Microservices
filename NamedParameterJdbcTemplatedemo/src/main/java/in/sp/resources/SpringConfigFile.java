package in.sp.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		datasource.setUsername("root");
		datasource.setPassword("Sameer@7245");
		
		return datasource;
	}
	@Bean
	public NamedParameterJdbcTemplate npjdbctemplate() {
		
		return new NamedParameterJdbcTemplate(myDataSource());
		
	}

}
