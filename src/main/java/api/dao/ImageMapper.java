package api.dao;

import api.entity.Image;
import api.entity.ImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    long countByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insert(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insertSelective(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    List<Image> selectByExample(ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    Image selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") Image record, @Param("example") ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExample(@Param("record") Image record, @Param("example") ImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKeySelective(Image record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKey(Image record);
}