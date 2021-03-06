package api.dao;

import api.entity.OrderProduct;
import api.entity.OrderProductExample;
import api.entity.OrderProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    long countByExample(OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByExample(OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int deleteByPrimaryKey(OrderProductKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insert(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int insertSelective(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    List<OrderProduct> selectByExample(OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    OrderProduct selectByPrimaryKey(OrderProductKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKeySelective(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_product
     *
     * @mbg.generated Thu May 24 19:33:32 CST 2018
     */
    int updateByPrimaryKey(OrderProduct record);
}