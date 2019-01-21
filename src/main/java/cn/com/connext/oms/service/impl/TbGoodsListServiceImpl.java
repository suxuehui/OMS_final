package cn.com.connext.oms.service.impl;

<<<<<<< HEAD
=======
import cn.com.connext.oms.commons.dto.GoodsGoodsOrderDto;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import cn.com.connext.oms.commons.dto.GoodsStockDto;
import cn.com.connext.oms.entity.TbGoods;
import cn.com.connext.oms.mapper.TbGoodsMapper;
import cn.com.connext.oms.mapper.TbGoodsOrderMapper;
import cn.com.connext.oms.service.TbGoodsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

=======
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import java.util.LinkedList;
import java.util.List;

/**
 * <p>Title: TbGoodsListServiceImp</p>
 * <p>Description: </p>
 *
 * @author zhaojun
 * @version 1.0.0
 * @Date 2019/1/7
 */
@Service
public class TbGoodsListServiceImpl implements TbGoodsListService {
    @Autowired
    private TbGoodsMapper tbGoodsMapper;
    @Autowired
    private TbGoodsOrderMapper tbGoodsOrderMapper;

    /**
     * @Author: zhaojun
     * @Description: 根据订单编号查询对应的商品编号，再根据商品编号查询该订单的商品列表
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 13:38
     */
    @Override
    public List<TbGoods> getGoodsImformation(Integer orderId) {
<<<<<<< HEAD
        List<Integer> list = tbGoodsOrderMapper.getGoodOrderById(orderId);
=======
        List<Integer> list = tbGoodsOrderMapper.getGoodsOrderById(orderId);
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        List tbGoods=new LinkedList<>();
        for (Integer integer:list){
            List<TbGoods> goods = tbGoodsMapper.getGoodsImformation(integer);
            tbGoods.add(goods);
        }
        return tbGoods;
    }
    /**
<<<<<<< HEAD
        * @Author: zhaojun
        * @Description: 查询库存所有商品
        * @Param: []
        * @Create: 2019/1/8 16:54
        */
=======
     * @Author: zhaojun
     * @Description: 查询库存所有商品
     * @Param: []
     * @Create: 2019/1/8 16:54
     */
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793

    @Override
    public List<GoodsStockDto> getAllGoods() {
        return this.tbGoodsMapper.getAllGoods();
    }

    /**
<<<<<<< HEAD
        * @Author: zhaojun
        * @Description: 根据商品的code查询商品的ID
        * @Param: []
        * @Create: 2019/1/7 17:54
        */
    @Override
    public int findIdByCode(String goodsCode) {
        return this.tbGoodsMapper.findIdByCode(goodsCode);
    }
=======
     * @Author: zhaojun
     * @Description: 根据商品的code查询商品的ID
     * @Param: []
     * @Create: 2019/1/7 17:54
     */
    @Override
    public Integer findIdByCode(String goodsCode) {
        return this.tbGoodsMapper.findIdByCode(goodsCode);
    }



    @Override
    public List<GoodsGoodsOrderDto> goodsListFromOrder(int orderId) {
        return this.tbGoodsOrderMapper.goodsListFromOrder(orderId);
    }
    /**
     * @Author: zhaojun
     * @Description: 模糊查询商品信息
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create:
     */
    @Override
    public List<TbGoods> fuzzySearch(String mark) {
        return this.tbGoodsMapper.fuzzySearch(mark);
    }

    /**
     * @Author: zhaojun
     * @Description:
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2018/1/10 16:03
     */
    @Override
    public void updateGoods(String goodsCode, String goodsName, Double goodsPrice) {
        this.tbGoodsMapper.updateGoods(goodsCode,goodsName,goodsPrice);
    }
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
}
