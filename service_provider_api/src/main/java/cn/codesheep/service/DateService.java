package cn.codesheep.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface DateService {

    @GetMapping("/api/test")
    String consumer( @RequestParam("param") String param );
}
