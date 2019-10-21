package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController("/" )
public class TestController {

    @RequestMapping(value="data.json",method={RequestMethod.GET})
    public Map<String,String> bookById(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","啦啦啦啦啦啊啦啦啦啦111");
        resultMap.put("mynumber","11111");
        return resultMap;
    }
    @RequestMapping(value="data1.json",method={RequestMethod.GET})
    public Map<String,String> bookById1(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","刘笑锋1");
        resultMap.put("mynumber","2012020045");
        return resultMap;
    }
}