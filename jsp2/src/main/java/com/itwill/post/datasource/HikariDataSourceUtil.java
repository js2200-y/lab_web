package com.itwill.post.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariDataSourceUtil {
    // singleton 디자인패턴:
    private static HikariDataSourceUtil instance = null;
    
    
    private HikariDataSource ds;
    
    
    private HikariDataSourceUtil() {
        // HikariCP를 사용하기 위한 환경 설정 객체;
        HikariConfig config = new HikariConfig();
        
        // CP(Data Source)을 생성하기 위한 설정들:
        config.setDriverClassName("oracle.jdbc.OracleDriver");  // JDBC 드라이버(라이브러리) 이름
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe"); // DB접속 URL
        config.setUsername("scott"); // DB접속 계정
        config.setPassword("tiger"); // DB접속 비밀번호
        
        // CP(Data Source) 객체 생성:
        ds = new HikariDataSource(config);
        
    }
    
    public static HikariDataSourceUtil getInstance() {
        if (instance == null) {
            instance = new HikariDataSourceUtil();
        }
        
        return instance;
    }
    
    public HikariDataSource getDataSource() {
        return ds;
    }
     
    
}
