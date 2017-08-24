package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

	@Bean
	public static ConfigureRedisAction configureRedisAction() {
	    return ConfigureRedisAction.NO_OP;
	}
	
	@Bean
	public LettuceConnectionFactory connectionFactory() {
//		RedisSentinelConfiguration sentinelConfiguration = new RedisSentinelConfiguration().master("h").sentinel("ec2-34-231-155-48.compute-1.amazonaws.com", 32839);
//		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(sentinelConfiguration);
//		lettuceConnectionFactory.setDatabase(1);
//		lettuceConnectionFactory.setPassword("p0c3d8918f9f7202efc237d62c0558e050a64d8d33aa03aed4d9b42d27489d3e8");
		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
		lettuceConnectionFactory.setHostName("ec2-34-231-155-48.compute-1.amazonaws.com");
		lettuceConnectionFactory.setPassword("p0c3d8918f9f7202efc237d62c0558e050a64d8d33aa03aed4d9b42d27489d3e8");
		lettuceConnectionFactory.setPort(32839);
		return lettuceConnectionFactory;
	}

}

