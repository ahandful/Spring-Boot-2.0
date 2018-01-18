package com.bee.sample.ch14.cfg;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;
/**
 * 配置缓存
 * @author xiandafu
 *
 */
//@Configuration
public class RedisCacheManagerCustomizer {
	@Bean
	public CacheManagerCustomizer<RedisCacheManager> cacheManagerCustomizer() {
	    return new CacheManagerCustomizer<RedisCacheManager>() {
	        @Override
	        public void customize(RedisCacheManager cacheManager) {
		        	cacheManager.getCacheConfigurations().get("menu").entryTtl(Duration.ofMinutes(10));
	        }
	    };
	}
	
//	@Bean
//	public RedisCacheManager getRedisCacheManager(RedisConnectionFactory connectionFactory){
//		RedisCacheWriter cacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
//		ClassLoader loader = this.getClass().getClassLoader();
//		
//		JdkSerializationRedisSerializer jdkSerializer = new JdkSerializationRedisSerializer(loader);
//		SerializationPair<Object> pair = SerializationPair.fromSerializer(jdkSerializer);
//		RedisCacheConfiguration cacheConfig = RedisCacheConfiguration.defaultCacheConfig().serializeValuesWith(pair);
//		RedisCacheManager cacheManager = new RedisCacheManager(cacheWriter, cacheConfig);
//		
//		return cacheManager;
//	}
	
}
