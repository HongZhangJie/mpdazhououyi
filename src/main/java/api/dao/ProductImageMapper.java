package api.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import api.entity.ProductImage;
import api.entity.ProductImageExample;

public interface ProductImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    long countByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int deleteByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int insert(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int insertSelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    List<ProductImage> selectByExample(ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    ProductImage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductImage record, @Param("example") ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int updateByExample(@Param("record") ProductImage record, @Param("example") ProductImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int updateByPrimaryKeySelective(ProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_image
     *
     * @mbg.generated Thu May 24 15:51:51 CST 2018
     */
    int updateByPrimaryKey(ProductImage record);
}