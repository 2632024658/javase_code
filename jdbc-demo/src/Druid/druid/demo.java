package Druid.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @className: demo
 * 当前项目名称  JDBC2023
 * @description: TODO 类描述
 * @author: Mr.Baldrick Liu
 * @date: 2023/07/05 15:28
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class demo {
    public static void main(String[] args) throws Exception {
//        1导入jar包

//        2定义配置

//        3加载陪配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:/Java2022/JDBC2023/jdbc-demo/src/druid.properties"));
//        4获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        5获取数据库连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
