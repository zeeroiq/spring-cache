package com.shri.spring.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
public class CacheConfig {

//    @Bean
//    public CacheManager cacheManager() {
//        return new EhCacheCacheManager(cacheManagerFactory().getObject());
//    }
//
//    @Bean
//    public EhCacheManagerFactoryBean cacheManagerFactory() {
//        EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
//        bean.setConfigLocation(new ClassPathResource("ehCache.xml"));
//        bean.setShared(true);
//        return bean;
//    }
}
