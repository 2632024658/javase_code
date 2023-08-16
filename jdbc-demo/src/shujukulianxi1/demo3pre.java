package shujukulianxi1;

import pojo.Accont;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: demo1
 * 当前项目名称  JDBC2023
 * @description: TODO 类描述
 * @author: Mr.Baldrick Liu
 * @date: 2023/07/04 17:20
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class demo3pre {
    public static void main(String[] args) throws Exception {
////        1.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");

//        2获取链接
        String url = "jdbc:mysql:///atguigudb?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8";
//        数据库用户密码
        String usrername = "root";
        String password = "abc123";
//        查询的信息
Double d1=2600.0;
Double d2=3300.0;




        Connection connection1 = DriverManager.getConnection(url, usrername, password);
//        3定义sql
        String sql = "SELECT last_name, salary\n" + "FROM employees\n" + "WHERE salary BETWEEN ? AND ?";
//        4获取执行sql的对象
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setDouble(1,d1);
        preparedStatement.setDouble(2,d2);


//        5执行sql
        ResultSet rs = preparedStatement.executeQuery();
//6处理结果
        int i=0;
        List<Accont> list=new ArrayList<>();

        while (rs.next()) {
            String key = rs.getString("last_name");
            double value = rs.getDouble("salary");
            list.add(new Accont(key, value));
        }
//        System.out.println("查询记录数为"+i);
        System.out.println(list);
        rs.close();
        preparedStatement.close();
        connection1.close();
    }
}
