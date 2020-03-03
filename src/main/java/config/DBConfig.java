package config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据库的配置
 * 	1.告诉配置信息的位置  @PropertySource
 * 	2.利用IOC功能注入配置信息 @value
 * @author s
 *
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DBConfig {
	//配置信息
	@Value("${jdbc.driverClass}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${pool.maxActive}")
	private int maxActive;
	
	//数据源的bean
	@Bean(name="dateSource")
	public DataSource createDateSource() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaxActive(maxActive);
		return ds;
	}
	
	//jdbctemplate
	@Bean(name="jdbcTemplate")
	public JdbcTemplate createJdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
}
