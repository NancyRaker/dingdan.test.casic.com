package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * 应用配置（spring配置）
 * 相当于xml的替代者
 * @author s
 *
 */
@Configuration
@ComponentScan({"dao","service","util"})
@Import(DBConfig.class)
@EnableAspectJAutoProxy
public class AppConfig {
	
	
	
}
