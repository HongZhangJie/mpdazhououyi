package api.dao;

import api.entity.ProductProperty;
import api.entity.ProductPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    long countByExample(ProductPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByExample(ProductPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insert(ProductProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insertSelective(ProductProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    List<ProductProperty> selectByExample(ProductPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    ProductProperty selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductProperty record, @Param("example") ProductPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExample(@Param("record") ProductProperty record, @Param("example") ProductPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKeySelective(ProductProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_property
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKey(ProductProperty record);
}