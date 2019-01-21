package cn.com.connext.oms.mapper;

import cn.com.connext.oms.commons.dto.OrderGoodsReceiverDto;
import cn.com.connext.oms.entity.TbOrder;
import cn.com.connext.oms.entity.TbOrderDetails;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.Date;
import java.util.List;

@Repository
public interface TbOrderMapper extends MyMapper<TbOrder> {



    /**
    * @Description: 根据id获取订单信息
    * @Param: [orderId]
    * @return: cn.com.connext.oms.entity.TbOrder
    * @Author: Lili Chen
    * @Date: 2019/1/7
    */
    TbOrder getOrderById(Integer orderId);


    /**
    * @Description: 更改订单状态
    * @Param: [tbOrder]
    * @return: int
    * @Author: Lili Chen
    * @Date: 2019/1/7
    */
    int updateOrderStatue(TbOrder tbOrder);


    /** 
    * @Description: 批量修改订单状态
    * @Param: [tbOrderList] 
    * @return: int 
    * @Author: Lili Chen 
    * @Date: 2019/1/7 
    */
    int updateOrderListStatue(List<TbOrder> tbOrderList);

    /**
    * @Description:  批量修改订单“取消备注”
    * @Param: [tbOrderList]
    * @return: int
    * @Author: Lili Chen
    * @Date: 2019/1/8
    */
    int updateOrderListBasicRemark(List<TbOrder> tbOrderList);



    /**
    * @Description: 根据订单编码查看订单
    * @Param: [orderCode]
    * @return: cn.com.connext.oms.entity.TbOrder
    * @Author: Lili Chen
    * @Date: 2019/1/13
    */
<<<<<<< HEAD
    List<TbOrder> getAllOrder(@Param("orderState") String orderState);
=======
    TbOrder getOrderByCode(String orderCode);

>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
    List<TbOrder> getAllOrder();

    /**
     * create by: yonyong
     * description: 根据订单id查询订单所有信息
     * create time: 2019/1/7 13:52
     *
     *  * @Param: id
     * @return cn.com.connext.oms.entity.TbOrder
     */
    List<TbOrder> getOrderByOrderId(@Param("id")int id);

<<<<<<< HEAD
    /**
     * @Author: zhaojun
     * @Description: 根据订单编号查询订单详情
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 10:54
     */
    public TbOrder getOrderById(int orderId);
    /**
     * @Author: zhaojun
     * @Description:
     * @Param: []
     * @Return:
     * @Create: 2019/1/7 19:16z
     */
    public OrderGoodsReceiverDto getAllById(int orderId);
=======

>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793

    /**
     * create by: Aaron
     * description: 根据id查询订单详情
     * create time: 2019/1/7 15:30
     *
     *
     * @return  * @Param: null
     */
    List<TbOrder> getOrderDetailsByOrderId( int orderId);

    /**
     * create by: Aaron
     * description: TODO
     * create time: 2019/1/8 11:09
     * @return  * @Param: null
     */
    Date selectCreatedById(int orderId);
<<<<<<< HEAD
=======
    /**
     * @Author: zhaojun
     * @Description:
     * @Param: []
     * @Return:
     * @Create: 2019/1/7 19:16z
     */
    public  OrderGoodsReceiverDto getAllById(int orderId);
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
}