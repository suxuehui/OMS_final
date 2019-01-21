package cn.com.connext.oms.web.Controller;

import cn.com.connext.oms.commons.dto.BaseResult;
<<<<<<< HEAD
import cn.com.connext.oms.commons.dto.OrderGoodsReceiverDto;
=======
import cn.com.connext.oms.entity.TbOrder;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import cn.com.connext.oms.service.TbOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: TbGetAllByIdController</p>
 * <p>Description: </p>
 *
 * @author zhaojun
 * @version 1.0.0
 * @Date 2019/1/7
 */
@RestController
public class TbGetAllByIdController {
    @Autowired
    private TbOrderService tbOrderService;
    /**
        * @Author: zhaojun
<<<<<<< HEAD
        * @Description:
        * @Param: []
=======
        * @Description: 根据订单号查询订单的详细信息（收货信息和order信息）
        * @Param: []
        * @Return:
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        * @Create: 2019/1/7 19:27
        */
    @GetMapping("getAllById")
    @ApiOperation(value = "订单详情接口")
  public BaseResult getAllById(int orderId){
        try {
<<<<<<< HEAD
            OrderGoodsReceiverDto orderGoodsReceiverDto=this.tbOrderService.getAllById(orderId);
            return BaseResult.success("成功",orderGoodsReceiverDto);
=======
            TbOrder tbOrder = tbOrderService.getAllById(orderId);
           /* this.tbOrderService.getAllById(orderId);*/
            return BaseResult.success("成功",tbOrder);
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.fail("服务器内部错误");
        }
    }
}