package com.zcsoft.rc.common.autoconfigure.persistence.datasource;

import com.sharingif.cube.persistence.database.DataSourcePoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration("commonPersistenceComponentsAutoconfigure")
public class PersistenceComponentsAutoconfigure {
	
	@Bean(name="dataSource")
	public JndiObjectFactoryBean jndiDataSource(DataSourcePoolConfig dataSourcePoolConfig) throws IllegalArgumentException, NamingException {
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setProxyInterface(DataSource.class);
		jndiObjectFactoryBean.setJndiName(dataSourcePoolConfig.getJndiName());
		jndiObjectFactoryBean.setResourceRef(true);
		return jndiObjectFactoryBean;
	}
	
	@Bean(name="dataSourceTransactionManager")
	public DataSourceTransactionManager createDataSourceTransactionManager(DataSource opayDataSource) {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(opayDataSource);
		
		return dataSourceTransactionManager;
	}
	
}