package cn.com.connext.oms.service;

<<<<<<< HEAD
=======
import cn.com.connext.oms.commons.dto.GoodsGoodsOrderDto;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import cn.com.connext.oms.commons.dto.GoodsStockDto;
import cn.com.connext.oms.entity.TbGoods;

import java.util.List;

/**
 * <p>Title: TbGoodsListService</p>
 * <p>Description: </p>
 *
 * @author zhaojun
 * @version 1.0.0
 * @Date 2019/1/7
 */
public interface TbGoodsListService {
    /**
<<<<<<< HEAD
        * @Author: zhaojun
        * @Description: 根据查询订单的所有商品信息
        * @Param: []
        * @Create: 2019/1/7 13:59
        */
    List<TbGoods> getGoodsImformation(Integer orderId);
    /**
        * @Author: zhaojun
        * @Description: 查询库存所有商品
        * @Param: []
        * @Create: 2019/1/7 16:54
        */
    List<GoodsStockDto> getAllGoods();
    /**
        * @Author: zhaojun
        * @Description: 根据goods_code查询Good_ID
        * @Param: []
        * @Create: 2019/1/7 17:54
        */
    public int findIdByCode(String goodsCode);
=======
     * @Author: zhaojun
     * @Description: 根据查询订单的所有商品信息
     * @Param: []
     * @Create: 2019/1/7 13:59
     */
    List<TbGoods> getGoodsImformation(Integer orderId);
    /**
     * @Author: zhaojun
     * @Description: 查询库存所有商品
     * @Param: []
     * @Create: 2019/1/7 16:54
     */
    List<GoodsStockDto> getAllGoods();
    /**
     * @Author: zhaojun
     * @Description: 根据goods_code查询Good_ID
     * @Param: []
     * @Create: 2019/1/9 14:34
     */
    public Integer findIdByCode(String goodsCode);
    /**
     * @Author: zhaojun
     * @Description:
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/9 16:34
     */
    public List<GoodsGoodsOrderDto> goodsListFromOrder(int orderId);
    /**
     * @Author: zhaojun
     * @Description: 根据商品的Code修改商品的名称和价格
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/9 16:34
     */
    public void updateGoods(String goodsCode,String goodsName,Double goodsPrice);
    /**
     * @Author: zhaojun
     * @Description:
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/10 11:49
     */
    public List<TbGoods> fuzzySearch(String mark);

>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793

}
