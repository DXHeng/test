package com.xio.controller;

import com.xio.pojo.SCust;
import com.xio.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cust")
public class CustController {

    @Autowired
    private CustService custService;

    /**
     * 根据用户ID查询客户
     */
    @RequestMapping("/getCustList")
    public String getCustList(SCust cust,Model model){
        List<SCust> custList = custService.getCustList(cust);
        model.addAttribute("custList",custList);
        return "center";
    }
}
