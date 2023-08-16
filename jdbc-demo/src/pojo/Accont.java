package pojo;

/**
 * @className: Accont
 * 当前项目名称  JDBC2023
 * @description: TODO 类描述
 * @author: Mr.Baldrick Liu
 * @date: 2023/07/05 10:54
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class Accont {
    private String last_name;
    private Double salary;

    @Override
    public String toString() {
        return "Accont{" + "last_name='" + last_name + '\'' + ", salary=" + salary + '}';
    }

    public Accont() {
    }

    public Accont(String last_name,Double salary ) {
        this.salary = salary;
        this.last_name = last_name;
    }

    /**
     * 获取
     * @return salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * 设置
     * @param last_name
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


}
