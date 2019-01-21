package cn.com.connext.oms.web.Controller;

import cn.com.connext.oms.commons.dto.BaseResult;
<<<<<<< HEAD
import cn.com.connext.oms.commons.dto.GoodsStockDto;
import cn.com.connext.oms.entity.TbGoods;
import cn.com.connext.oms.service.TbGoodsListService;
=======
import cn.com.connext.oms.commons.dto.GoodsGoodsOrderDto;
import cn.com.connext.oms.commons.dto.GoodsStockDto;
import cn.com.connext.oms.entity.TbGoods;
import cn.com.connext.oms.service.TbGoodsListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Title: TbGetGoodOrderById</p>
 * <p>Description: </p>
 *
 * @author zhaojun
 * @version 1.0.0
 * @Date 2019/1/7
 */
@RestController
public class TbGetGoodsListController {
    @Autowired
    private TbGoodsListService tbGoodsListService;
    /**
<<<<<<< HEAD
        * @Author: zhaojun
=======
        * @Author: ZhaoJun
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        * @Description: 根据订单编号查询该订单的商品编号
        * @Param: []
        * @Return: cn.com.connext.oms.commons.dto.BaseResult
        * @Create: 2019/1/7 11:51
        */
    @GetMapping("getGoodsList")
    @ApiOperation(value = "订单商品列表接口")
    public BaseResult GetGoodsList(int orderId){
        try {
            List<TbGoods> allGoods = tbGoodsListService.getGoodsImformation(orderId);
            return BaseResult.success("成功",allGoods);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.fail("失败");
        }
    }
    /**
<<<<<<< HEAD
        * @Author: zhaojun
=======
        * @Author: ZhaoJun
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        * @Description: 查询所有商品的信息和库存
        * @Param: []
        * @Create: 2019/1/7 17:36
        */
    @GetMapping("getAllGoods")
    @ApiOperation(value = "查询所有商品的信息和库存")
<<<<<<< HEAD
    public BaseResult getAllGoods(){
        try {
            List<GoodsStockDto> getAllGoods = tbGoodsListService.getAllGoods();
            return BaseResult.success("成功",getAllGoods);
=======
    public BaseResult getAllGoods(int pageNum,int pageSize){
        try {
            PageHelper.startPage(pageNum,pageSize);
            List<GoodsStockDto> getAllGoods =this.tbGoodsListService.getAllGoods();
            PageInfo<GoodsStockDto> goodsListInfo = new PageInfo<>(getAllGoods);
            return BaseResult.success("成功",goodsListInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.fail("服务器内部错误");
        }
    }
    /**
        * @Author: ZhaoJun
        * @Description: 根据订单号查询订单对应的商品信息
        * @Param: []
        * @Return:
        * @Create: 2019/1/8 17:36
        */
   @GetMapping("goodsListFromOrder")
    public BaseResult goodsListFromOrder(int orderId){
        try {
            List<GoodsGoodsOrderDto> goodsListFromOrder= tbGoodsListService.goodsListFromOrder(orderId);
            return BaseResult.success("成功",goodsListFromOrder);
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.fail("服务器内部错误");
        }
    }

}
