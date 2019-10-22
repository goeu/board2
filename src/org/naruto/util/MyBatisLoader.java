package org.naruto.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public enum MyBatisLoader {
	
	INSTANCE;
	SqlSessionFactory factory;
	public SqlSessionFactory getFactory() {
		return this.factory;
	}
	
	MyBatisLoader() {
		String resource = "mybatis-config.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
