package api.entity;

public class Image {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.id
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.url
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.from
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    private Byte from;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.delete_time
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    private Integer deleteTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image.update_time
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    private Integer updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.id
     *
     * @return the value of image.id
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.id
     *
     * @param id the value for image.id
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.url
     *
     * @return the value of image.url
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.url
     *
     * @param url the value for image.url
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.from
     *
     * @return the value of image.from
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public Byte getFrom() {
        return from;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.from
     *
     * @param from the value for image.from
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public void setFrom(Byte from) {
        this.from = from;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.delete_time
     *
     * @return the value of image.delete_time
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public Integer getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.delete_time
     *
     * @param deleteTime the value for image.delete_time
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image.update_time
     *
     * @return the value of image.update_time
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image.update_time
     *
     * @param updateTime the value for image.update_time
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}