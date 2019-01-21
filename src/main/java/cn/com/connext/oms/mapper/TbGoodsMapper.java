package cn.com.connext.oms.mapper;

import cn.com.connext.oms.commons.dto.GoodsStockDto;
import cn.com.connext.oms.entity.TbGoods;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

@Repository
public interface TbGoodsMapper extends MyMapper<TbGoods> {
    /**
     * @Author: zhaojun
     * @Description: 根据商品编号查询该商品详细信息
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 13:30
     */
    List<TbGoods> getGoodsImformation(int goodId);
    /**
     * @Author: zhaojun
     * @Description: 查询所有商品
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2019/1/7 16:30
     */
    List<GoodsStockDto>getAllGoods();
    /**
     * @Author: zhaojun
     * @Description: 根据商品id查询商品code
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
<<<<<<< HEAD
     * @Create: ${DATE}
     */
    public int findIdByCode(String goodsCode);
=======
     * @Create: 2018/1/19 13:03
     */
    public Integer findIdByCode(String goodsCode);
    /**
     * @Author: zhaojun
     * @Description: 根据商品id修改商品的信息
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2018/1/9 16:03
     */
    public void updateGoods(String goodsCode,String goodsName,Double goodsPrice);
    /**
     * @Author: zhaojun
     * @Description: 商品列表的模糊查询
     * @Param: []
     * @Return: cn.com.connext.oms.commons.dto.BaseResult
     * @Create: 2018/1/10 15:40
     */
    public List<TbGoods> fuzzySearch(String mark);

>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
}