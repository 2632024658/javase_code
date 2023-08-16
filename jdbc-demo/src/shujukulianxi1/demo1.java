package shujukulianxi1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @className: demo1
 * 当前项目名称  JDBC2023
 * @description: TODO 类描述
 * @author: Mr.Baldrick Liu
 * @date: 2023/07/04 17:20
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class demo1 {
    public static void main(String[] args) throws Exception {
////        1.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");

//        2获取链接
        String url = "jdbc:mysql://11.94.204.129 :3306/hainiudb1?useUnicode=true&characterEncoding=UTF-8&userSSL=false&serverTimezone=GMT%2B8";
        String usrername = "root";
        String password = "hainiu";
        Connection connection1 = DriverManager.getConnection(url, usrername, password);
//        3定义sql
//        String sql="UPDATE employees SET department_id = 70 WHERE employee_id = 114";
        String sql="UPDATE employees SET department_id = 70 WHERE employee_id = 114";
//        4获取执行sql的对象
        Statement stmt = connection1.createStatement();
//        5执行sql
        int rows = stmt.executeUpdate(sql);

//        6打印处理结果
        System.out.println(rows);
//        7释放资源
        stmt.close();
        connection1.close();
    }
}
