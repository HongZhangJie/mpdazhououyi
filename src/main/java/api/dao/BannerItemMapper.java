package api.dao;

import api.entity.BannerItem;
import api.entity.BannerItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    long countByExample(BannerItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByExample(BannerItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insert(BannerItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insertSelective(BannerItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    List<BannerItem> selectByExample(BannerItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    BannerItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") BannerItem record, @Param("example") BannerItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExample(@Param("record") BannerItem record, @Param("example") BannerItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKeySelective(BannerItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_item
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKey(BannerItem record);
}