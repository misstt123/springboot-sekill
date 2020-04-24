package com.goddong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:用于做页面映射跳转的控制层
 * @Author lyh-god
 * @Date 2020/4/24
 **/
@Controller
public class BaseController {

    /**
     * 跳转到秒杀商品页
     *
     * @return
     */
    @RequestMapping("/seckill")
    public String seckillGoods() {
        return "redirect:/seckill/list";
    }

}

