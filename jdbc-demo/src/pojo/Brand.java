package pojo;

/**
 * @className: Brand
 * 当前项目名称  JDBC2023
 * @description: TODO 类描述
 * @author: Mr.Baldrick Liu
 * @date: 2023/07/05 18:00
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class Brand {

    // id 主键
    private  Integer  id;
    // 品牌名称
    private  String     brandName;
    // 企业名称
    private   String company_name ;
    // 排序字段
    private   Integer   ordered ;
            // 描述信息
    private   String description ;
    // 状态：0：禁用  1：启用
    private   Integer  status    ;

    public Brand() {
    }

    public Brand(Integer id, String brandName, String company_name, Integer ordered, String description, Integer status) {
        this.id = id;
        this.brandName = brandName;
        this.company_name = company_name;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置
     * @param brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取
     * @return company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * 设置
     * @param company_name
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * 获取
     * @return ordered
     */
    public Integer getOrdered() {
        return ordered;
    }

    /**
     * 设置
     * @param ordered
     */
    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String toString() {
        return "Brand{id = " + id + ", brandName = " + brandName + ", company_name = " + company_name + ", ordered = " + ordered + ", description = " + description + ", status = " + status + "}";
    }
}
