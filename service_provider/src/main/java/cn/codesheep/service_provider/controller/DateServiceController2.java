package cn.codesheep.service_provider.controller;

import cn.codesheep.service.DateService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class DateServiceController2 implements DateService {

    @Override
    public String consumer( @RequestParam String param) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("今天是"+"yyyy年MM月dd日 E kk点mm分" );
        String nowTime = simpleDateFormat.format( now );
        return "hello again " + param + ", " + nowTime;
    }
}
