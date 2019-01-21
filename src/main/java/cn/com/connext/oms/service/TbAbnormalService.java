package cn.com.connext.oms.service;

/**
 * <p>Title: TbAbnormalService</p>
 * <p>Description: </p>
 *
 * @author caps
 * @version 1.0.0
 * @Date 2019/1/7 10:58
 */
public interface TbAbnormalService {
    /**
<<<<<<< HEAD
     * 订单预检
     * @param id
     * @return
     */
    String checkGoods(int id);
=======
     * @Author: caps
     * @Description:订单预检
     * @Param: [orderId]
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 17:50
     */

    BaseResult checkGoods(int orderId);

    /**
     * @Author: caps
     * @Description:异常订单列表
     * @Param: [currentPage, pageSize, tbAbnormal]
     * @Return: com.github.pagehelper.PageInfo<cn.com.connext.oms.entity.TbAbnormal>
     * @Create: 2019/1/7 17:49
     */

    PageInfo<TbAbnormal> checkList(Integer currentPage, Integer pageSize, TbAbnormal tbAbnormal);

    /**
     * @Author: caps
     * @Description:异常订单详情
     * @Param: [abnormalId]
     * @Return: java.util.Map<java.lang.String,java.lang.Object>
     * @Create: 2019/1/8 11:55
     */

    Map<String,Object> abnormalDetail(int abnormalId);

    /**
     * @Author: caps
     * @Description: 异常处理
     * @Param: [abnormalId]
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/8 13:31
     */
    BaseResult abnormalHandle(int abnormalId);


>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
}
