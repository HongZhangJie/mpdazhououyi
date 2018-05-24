package api.entity;

public class UserAddress {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.id
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.name
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.mobile
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.province
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.city
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.country
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.detail
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.delete_time
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private Integer deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.user_id
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.update_time
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    private Integer updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.id
     *
     * @return the value of user_address.id
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.id
     *
     * @param id the value for user_address.id
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.name
     *
     * @return the value of user_address.name
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.name
     *
     * @param name the value for user_address.name
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.mobile
     *
     * @return the value of user_address.mobile
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.mobile
     *
     * @param mobile the value for user_address.mobile
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.province
     *
     * @return the value of user_address.province
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.province
     *
     * @param province the value for user_address.province
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.city
     *
     * @return the value of user_address.city
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.city
     *
     * @param city the value for user_address.city
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.country
     *
     * @return the value of user_address.country
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.country
     *
     * @param country the value for user_address.country
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.detail
     *
     * @return the value of user_address.detail
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.detail
     *
     * @param detail the value for user_address.detail
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.delete_time
     *
     * @return the value of user_address.delete_time
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public Integer getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.delete_time
     *
     * @param deleteTime the value for user_address.delete_time
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.user_id
     *
     * @return the value of user_address.user_id
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.user_id
     *
     * @param userId the value for user_address.user_id
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.update_time
     *
     * @return the value of user_address.update_time
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.update_time
     *
     * @param updateTime the value for user_address.update_time
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}