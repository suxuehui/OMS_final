package cn.com.connext.oms.service;

import cn.com.connext.oms.commons.dto.OrderGoodsReceiverDto;
import cn.com.connext.oms.entity.TbOrder;
<<<<<<< HEAD
import com.github.pagehelper.PageInfo;

=======
import cn.com.connext.oms.entity.TbOrderDetails;
import com.github.pagehelper.PageInfo;import cn.com.connext.oms.entity.TbOutput;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import java.util.List;

/**
 * <p>Title: TbOrderService</p>
 * <p>Description: </p>
 *
 * @author caps
 * @version 1.0.0
 * @Date 2019/1/6 10:15
 */
public interface TbOrderService {
    /**
     * @Author: caps
     * @Description:
     * @Param: []
     * @Return: java.util.List<cn.com.connext.oms.entity.TbOrder>
     * @Create: 2019/1/6 10:14
     */
<<<<<<< HEAD
    List<TbOrder> getAllOrder(String orderState);
=======
    List<TbOrder> getAllOrder();
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793

    /**
     * create by: yonyong
     * description: 根据订单id查询订单所有信息
     * create time: 2019/1/7 13:52
     *
     *  * @Param: id
     * @return cn.com.connext.oms.entity.TbOrder
     */
    List<TbOrder> getOrderDetailsByOrderId(int id);

<<<<<<< HEAD
    /**
     * @Author: zhaojun
     * @Description: 根据订单编号查询订单的详情
     * @Param: []
     * @Create: 2019/1/7 10:59
     */
    public TbOrder getOrderById(int orderId);
    /**
     * @Author: zhaojun
     * @Description: 根据订单ID查询订单所有信息
     * @Param: []
     * @Return:
     * @Create: 2019/1/7 19:19
     */
    public OrderGoodsReceiverDto getAllById(int orderId);
=======


>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793


    /**
     * create by: Aaron
     * description: 根据订单id查询订单详情
     * create time: 2019/1/7 15:31
     *
     *
     * @return  * @Param: null
     */

    List<TbOrder> getOrderByOrderId(int orderId);
<<<<<<< HEAD
=======

   /** 
   * @Description: 主动批量取消订单 
   * @Param: [orderList] 
   * @return: boolean 
   * @Author: Lili Chen 
   * @Date: 2019/1/8 
   */
    boolean cancelOrder(Integer[] orderIdList);
    
    
    /** 
    * @Description: WMS取消订单 
    * @Param: [outputList] 
    * @return: boolean 
    * @Author: Lili Chen 
    * @Date: 2019/1/8 
    */
    boolean cancelOrderOfWms(String outputs);
    /**
     * @Author: zhaojun
     * @Description: 根据订单ID查询订单所有信息
     * @Param: []
     * @Return:
     * @Create: 2019/1/7 19:19
     */
    public OrderGoodsReceiverDto getAllById(int orderId);


>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
}
