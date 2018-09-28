package cn.codesheep.service_provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class DateServiceController {

    @RequestMapping( value = "/test", method = RequestMethod.GET )
    public String test( @RequestParam String param ) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("今天是"+"yyyy年MM月dd日 E kk点mm分" );
        String nowTime = simpleDateFormat.format( now );
        return "hello " + param + ", " + nowTime;
    }
}
