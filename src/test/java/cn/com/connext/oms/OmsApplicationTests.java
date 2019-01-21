package cn.com.connext.oms;

import cn.com.connext.oms.mapper.TbExchangeMapper;
<<<<<<< HEAD
import cn.com.connext.oms.mapper.TbReturnMapper;
import cn.com.connext.oms.service.TbExchangeService;
import cn.com.connext.oms.service.TbReturnService;
=======
import cn.com.connext.oms.service.TbExchangeService;
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OmsApplicationTests {

    @Autowired
    TbExchangeMapper tbExchangeMapper;

    @Autowired
    TbExchangeService tbExchangeService;

<<<<<<< HEAD
    @Autowired private TbReturnMapper tbReturnMapper;

=======
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
    @Test
    public void contextLoads() {
        int a=1901060001;
        int b[]={16011353,16011522};
        int c[]={1,2};
        tbExchangeService.toGenerateExchangeOrderGoods(a,b,c);
<<<<<<< HEAD
    }

    @Test
    public void test1(){
        System.out.println(tbReturnMapper.createInputOrder("11",1901060001,"bb",null,null,"cc"));
=======
>>>>>>> 1f96f46d40065b190a40a7ef53e0a422f4de2793
    }

    @Test
    public void test(){
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String string=format.format(date);
        System.out.println(string);
    }
}

