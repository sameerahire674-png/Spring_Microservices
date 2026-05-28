package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile2 {
	@Bean
	public DriverManagerDataSource mydatasource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		datasource.setUsername("root");
		datasource.setPassword("Sameer@7245");
		return datasource;
	}
	
	@Bean
	public JdbcTemplate myjdbcTemplate() {
		JdbcTemplate jdbctemp=new JdbcTemplate();
		jdbctemp.setDataSource(mydatasource());
		return jdbctemp;
	}
}
