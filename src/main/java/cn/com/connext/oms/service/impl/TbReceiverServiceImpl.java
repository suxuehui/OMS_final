package cn.com.connext.oms.service.impl;

import cn.com.connext.oms.entity.TbReceiver;
import cn.com.connext.oms.mapper.TbReceiverMapper;
import cn.com.connext.oms.service.TbReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @program: OMS4Intern
 * @description: 有关收货人信息的操作
 * @author: Lili.Chen
 * @create: 2019-01-09 10:25
 **/
@Service
public class TbReceiverServiceImpl implements TbReceiverService {

    @Autowired
    private TbReceiverMapper tbReceiverMapper;


    /**
    * @Description: 更改收货人信息
    * @Param: [tbReceiver]
    * @return: boolean
    * @Author: Lili Chen
    * @Date: 2019/1/14
    */
    @Override
    public boolean updateReceiver(TbReceiver tbReceiver) {
        Date date=new Date();//更改时间
        if(tbReceiver!=null){
            TbReceiver receiver=tbReceiverMapper.getReceiverById(tbReceiver.getReceiverId());
            if(receiver!=null){//确保数据库中有这条数据
                int result=0;//更改数据条数
                tbReceiver.setUpdated(date);
                tbReceiver.setReceiverZip(receiver.getReceiverZip());
                tbReceiver.setReceiverPhone(receiver.getReceiverPhone());
                result=tbReceiverMapper.updateReceiver(tbReceiver);
                if(result==1){//表示已经更改成功
                    return true;
                }
            }
        }
        return false;
    }

   /* @Override
    public TbReceiver getReceiverByOrderId(Integer orderId) {
        return this.getReceiverById(orderId);
    }*/


    /**
    * @Description: 根据id查看收货人信息
    * @Param: [receiverId]
    * @return: cn.com.connext.oms.entity.TbReceiver
    * @Author: Lili Chen
    * @Date: 2019/1/14
    */
    @Override
    public TbReceiver getReceiverById(Integer receiverId) {
        return tbReceiverMapper.getReceiverById(receiverId);
    }
}
