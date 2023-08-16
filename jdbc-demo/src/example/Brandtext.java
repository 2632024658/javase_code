package example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @className: Brandtext
 * 当前项目名称  JDBC2023
 * @description: TODO 类描述
 * @author: Mr.Baldrick Liu
 * @date: 2023/07/05 18:11
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class Brandtext {


    @Test
    public void testselect() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:/Java2022/JDBC2023/jdbc-demo/src/druid.properties"));
//        4获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        5获取数据库连接
        Connection conn = dataSource.getConnection();
//定义sql
        String sql = "SELECT * FROM tb_brand";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Brand> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String brand_name = rs.getString("brand_name");
            String company_name = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            list.add(new Brand(id, brand_name, company_name, ordered, description, status));
        }
        System.out.println(list);
        rs.close();
        pstmt.close();
        conn.close();
    }

    @Test
    public void testADD() throws Exception {
//        接受页面提交的参数
        String brand_name = "香飘飘";
        String company_name = "奶茶";
        Integer ordered = 1000;
        String description = "周杰伦代言";
        Integer status = 1;
//        3加载配置文件（通过连接池）
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:/Java2022/JDBC2023/jdbc-demo/src/druid.properties"));
//        4获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        5获取数据库连接
        Connection conn = dataSource.getConnection();
//定义sql
        String sql = "insert into tb_brand (brand_name, company_name, ordered, description, status) values (?,?,?,?,?);";

        PreparedStatement pstmt = conn.prepareStatement(sql);
//设置参数
        pstmt.setString(1, brand_name);
        pstmt.setString(2, company_name);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);

        //        执行sql
        int i = pstmt.executeUpdate();
        System.out.println(i>0);
        pstmt.close();
        conn.close();
    }

    @Test
    public void testupdata() throws Exception {
        String brand_name = "香飘飘";
        String company_name = "奶茶";
        Integer ordered = 1000;
        String description = "波哥代言";
        Integer status = 1;
        Integer id=2;
//        3加载配置文件（通过连接池）
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:/Java2022/JDBC2023/jdbc-demo/src/druid.properties"));
//        4获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        5获取数据库连接
        Connection conn = dataSource.getConnection();
//定义sql
        String sql = "update tb_brand  set brand_name=?, company_name=?, ordered=?, description=?, status=? where id=?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
//设置参数
        pstmt.setString(1, brand_name);
        pstmt.setString(2, company_name);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);
        pstmt.setInt(6, id);

        //        执行sql
        int i = pstmt.executeUpdate();
        System.out.println(i>0);
        pstmt.close();
        conn.close();
    }

    @Test
    public void testdelete() throws Exception {

        Integer id=5;
//        3加载配置文件（通过连接池）
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:/Java2022/JDBC2023/jdbc-demo/src/druid.properties"));
//        4获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        5获取数据库连接
        Connection conn = dataSource.getConnection();
//定义sql
        String sql = "delete from tb_brand  where id=?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
//设置参数
        pstmt.setInt(1, id);
        //        执行sql
        int i = pstmt.executeUpdate();
        System.out.println(i>0);
        pstmt.close();
        conn.close();
    }
}
