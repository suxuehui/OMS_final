package cn.com.connext.oms.web.Controller;

<<<<<<< HEAD
import afu.org.checkerframework.checker.igj.qual.I;
import cn.com.connext.oms.commons.dto.BaseResult;
import cn.com.connext.oms.commons.utils.ListToArray;
=======
import cn.com.connext.oms.commons.dto.BaseResult;
import cn.com.connext.oms.commons.dto.InputDTO;
import cn.com.connext.oms.commons.utils.ListToArray;
import cn.com.connext.oms.commons.utils.StringUtils;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import cn.com.connext.oms.entity.TbInput;
import cn.com.connext.oms.entity.TbOrder;
import cn.com.connext.oms.entity.TbReturn;
import cn.com.connext.oms.service.TbExchangeService;
import cn.com.connext.oms.service.TbOrderService;
import cn.com.connext.oms.service.TbReturnService;
<<<<<<< HEAD
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
=======
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @created with IDEA
 * @author: Aaron
 * @version: 1.0.0
 * @date: 2019/1/7
 * @time: 15:42
 **/

@RestController
@RequestMapping("/return")
public class TbReturnController {
    @Autowired
    private TbReturnService tbReturnService;
    @Autowired
    private TbOrderService tbOrderService;
    @Autowired
    private TbExchangeService tbExchangeService;

<<<<<<< HEAD
    /**
     * 根据订单id查询订单详情
     * @author: Aaron
     * @param orderId
     * @return BaseResult
     */
    @GetMapping("/getOrderByOrderId")
    @ApiOperation(value = "订单数据接口")
    public BaseResult getOrderByOrderId (int orderId) {
=======
    String RETURN_TYPE = "退货";
    String EXCHANGE_TYPE = "换货";
    String COMPLETED = "已完成";

    /**
     * 入库单页面
     *
     * @return
     */
    @GetMapping("/toInput")
    public BaseResult allInputOrders(Integer currentPage, Integer pageSize) {

        PageInfo<InputDTO> tbInputList = tbReturnService.getAllInputOrders(currentPage, pageSize);
        if (null != tbInputList) {
            return BaseResult.success("查询成功", tbInputList);
        }
        return BaseResult.fail(500, "后台数据获取失败");
    }


    /**
     * 根据订单id查询订单详情
     *
     * @param orderId
     * @return BaseResult
     * @author: Aaron
     */
    @GetMapping("/getOrderByOrderId")
    @ApiOperation(value = "订单数据接口")
    public BaseResult getOrderByOrderId(int orderId) {
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        try {
            List<TbOrder> tbOrderList = tbOrderService.getOrderByOrderId(orderId);
            if (null != tbOrderList.get(0)) {
                return BaseResult.success("查询成功", tbOrderList.get(0));
            }
            return BaseResult.fail(500, "请检查订单状态！");
        } catch (Exception e) {
            return BaseResult.fail("查询失败");
        }

    }

    /**
     * 将前台的数据整合生成退货单
<<<<<<< HEAD
     * @param orderId
     * @author: Aaron
     * @param goodsIdsList
     * @param numberList
     * @return BaseResult
     */
    @GetMapping("/addReturnOrder")
    @ApiOperation(value = "生成退货单数据接口")
    public BaseResult addReturnOrder(@RequestParam("orderId") int orderId, @RequestParam("goodsId") List<Integer> goodsIdsList, @RequestParam("number")List<Integer> numberList){
        boolean flag = false;
        boolean flag1 = false;

        try{

                flag = tbReturnService.addReturnOrderGoods(orderId, goodsIdsList, numberList);
                TbReturn tbReturn = tbReturnService.createReturnOrder(orderId, goodsIdsList, numberList);
                flag1 = tbReturnService.addReturnOrder(tbReturn);

                if (flag && flag1) {
                    return BaseResult.success("添加成功");
                }

                return BaseResult.fail(500, "添加退货信息失败");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return BaseResult.fail("添加失败");
        }
=======
     *
     * @param orderId
     * @param goodsIdsList
     * @param numberList
     * @return BaseResult
     * @author: Aaron
     */
    @GetMapping("/addReturnOrder")
    @ApiOperation(value = "生成退货单数据接口")
    public BaseResult addReturnOrder(@RequestParam("orderId") int orderId, @RequestParam("goodsId") List<Integer> goodsIdsList, @RequestParam("number") List<Integer> numberList) {
        boolean flag = false;
        boolean flag1 = false;
        List<TbOrder> orderList = tbOrderService.getOrderByOrderId(orderId);
        if (null != orderList) {

            try {
                if (COMPLETED.equals(orderList.get(0).getOrderState())) {

                    flag = tbReturnService.addReturnOrderGoods(orderId, goodsIdsList, numberList);
                    TbReturn tbReturn = tbReturnService.createReturnOrder(orderId, goodsIdsList, numberList);
                    flag1 = tbReturnService.addReturnOrder(tbReturn);

                    if (flag && flag1) {
                        return BaseResult.success("添加成功");
                    }
                }

                return BaseResult.fail(500, "添加退货信息失败");
            } catch (Exception e) {
                return BaseResult.fail("添加失败");
            }
        }
        return BaseResult.fail(500, "内部数据操作失败");
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
    }


    /**
     * 退货单的取消
<<<<<<< HEAD
     * @author: Aaron
     * @param returnId
     * @return BaseResult
     */
    @GetMapping("/returnOrderCancel")
    @ApiOperation(value = "退货取消数据接口")
    public BaseResult returnOrderCancel (@RequestParam("returnId") int returnId){
        Date updated = new Date();
        String oms = "oms";
        try{
            boolean flag  = tbReturnService.returnOrderCancel(returnId,oms,updated);
            if (flag){
                return BaseResult.success("取消成功");
            }
            return BaseResult.fail(500,"取消失败");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return BaseResult.fail("内部数据出现错误，请稍后重试");
        }
    }



    /**
     * @author: Aaron
     * create by: yonyong
     * description: 退货/换货审核分流接口
     * create time: 2019/1/9 17:43
     *  * @Param: returnIds
     * @return cn.com.connext.oms.commons.dto.BaseResult
     */

    @GetMapping("/checkReturnOrExchange")
    @ApiOperation(value = "退货/换货审核分流接口")
    public BaseResult checkReturnOrExchange(@RequestParam("returnId") List<Integer> returnIds){

        Boolean rsReturn=false;
        int rsExchange=0;
        List<Integer> tbReturnList = new ArrayList<>();
        List<Integer> tbExchangeList = new ArrayList<>();
        Date date=new Date();


        for (int i = 0;i<returnIds.size();i++){
            TbReturn tbReturn = tbReturnService.getTbReturnById(returnIds.get(i));
            //log
            if ("退货".equals(tbReturn.getReturnType())){
                //将退货单生成单独的list交给退货部分处理
                tbReturnList.add(tbReturn.getReturnId());

            }else if ("换货".equals(tbReturn.getReturnType())){
                //将换货单生成单独的list交给换货处理
                tbExchangeList.add(tbReturn.getReturnId());

            }
        }

        try {
            //获取通过审核的订单，进行处理
             List<Integer> returnOrdersList = tbReturnService.returnOrdersAudit(tbReturnList);
            if (null != returnOrdersList) {
                 tbReturnService.createInputOrder(returnOrdersList);
                 BaseResult.success("生成入库单成功并成功发送");

            }
            BaseResult.fail("生成入库单失败");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return BaseResult.fail("内部数据操作出现异常");
        }


        //updated by yonyong
        int [] tids= ListToArray.listToArray(tbExchangeList);
        try{
=======
     *
     * @param returnIdsList
     * @return BaseResult
     * @author: Aaron
     */
    @GetMapping("/returnOrderCancel")
    @ApiOperation(value = "退货取消数据接口")
    public BaseResult returnOrderCancel (@RequestParam("returnId") List<Integer> returnIdsList){        Date updated = new Date();
        String oms = "oms";
        List<Integer> returnList = new ArrayList<>();
        List<Integer> exchangeList = new ArrayList<>();

        for (int i = 0; i < returnIdsList.size(); i++) {
            TbReturn tbReturn = tbReturnService.getTbReturnById(returnIdsList.get(i));
            if (null != tbReturn) {
                if (StringUtils.equals(RETURN_TYPE, tbReturn.getReturnType())) {
                    returnList.add(returnIdsList.get(i));

                }




                if (EXCHANGE_TYPE.equals(tbReturn.getReturnType())) {
                    exchangeList.add(returnIdsList.get(i));

                }

            }

            //换货部分的取消 Update BY yonyong
            int[] ids = ListToArray.listToArray(exchangeList);
            int t = tbExchangeService.updateTbReturn(ids, "换货取消", "yonyong", new Date());
            if (-1 == t) {
                return BaseResult.fail("系统错误！");
            } else if (-2 == t) {
                BaseResult.fail(500, "换货单只有在待审核状态才能取消！");
            } else {
                BaseResult.success("您已成功取消换货！");
            }


 //退货部分的取消
            try {
                boolean flag = tbReturnService.returnOrderCancel(returnList, oms, updated);
                if (flag) {
                    return BaseResult.success("退货取消");
                }

            } catch (Exception e) {

                return BaseResult.fail("内部数据出现错误，请稍后重试");            }
        }
        return BaseResult.fail(500,"取消失败");
    }

        /**
         * @author: Aaron and yonyong
         * description: 退货/换货审核分流接口
         * create time: 2019/1/9 17:43
         *  * @Param: returnIds
         * @return cn.com.connext.oms.commons.dto.BaseResult
         */

        @GetMapping("/checkReturnOrExchange")
        @ApiOperation(value = "退货/换货审核分流接口")
        public BaseResult checkReturnOrExchange (@RequestParam("returnId") List<Integer> returnIds) {

            Boolean rsReturn = false;
            int rsExchange = 0;
            List<Integer> tbReturnList = new ArrayList<>();
            List<Integer> tbExchangeList = new ArrayList<>();
            Date date = new Date();


            for (int i = 0; i < returnIds.size(); i++) {
                TbReturn tbReturn = tbReturnService.getTbReturnById(returnIds.get(i));
                if (null != tbReturn) {
                    //log
                    if (RETURN_TYPE.equals(tbReturn.getReturnType())) {
                        //将退货单生成单独的list交给退货部分处理
                        tbReturnList.add(tbReturn.getReturnId());

                    } else if (EXCHANGE_TYPE.equals(tbReturn.getReturnType())) {
                        //将换货单生成单独的list交给换货处理
                        tbExchangeList.add(tbReturn.getReturnId());

                    }
                }
            }

            try {
                //获取通过审核的订单，进行处理
                List<Integer> returnOrdersList = tbReturnService.returnOrdersAudit(tbReturnList);
//                if (0 != returnOrdersList.size()) {
                if (!CollectionUtils.isEmpty(returnOrdersList)) {
                    tbReturnService.createInputOrder(returnOrdersList);
                    BaseResult.success("生成入库单成功并成功发送");
                } else {
                 BaseResult.fail(500,"请检查退货单的状态");
                }
            } catch (Exception e) {
                return BaseResult.fail("内部数据操作出现异常");
            }


            //updated by yonyong
            //TODO
            int[] tids = ListToArray.listToArray(tbExchangeList);
            try {
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793

                int rs = tbExchangeService.AuditTbReturn(tids, "oms", date);
                if (1 != rs) {
                    return BaseResult.fail("操作失败！");
                }
                int rt = tbExchangeService.generateInput(tids);
                return BaseResult.success("入库单生成成功");

<<<<<<< HEAD
        }catch (Exception e){
            //TODO
            return BaseResult.fail("服务器内部错误！");
=======
            } catch (Exception e) {
                //TODO
                return BaseResult.fail("服务器内部错误！");
            }

>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
        }

    }

<<<<<<< HEAD
}

=======
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793


