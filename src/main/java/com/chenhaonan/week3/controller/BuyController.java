package com.chenhaonan.week3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chenhaonan.week3.entity.Buy;
import com.chenhaonan.week3.entity.Buyvo;
import com.chenhaonan.week3.service.BuyService;
import com.github.pagehelper.PageInfo;

@Controller
public class BuyController {
	@Autowired
	private BuyService service;
	@RequestMapping("list")
	public String list(Model m,Buyvo vo,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "5") Integer pageSize ){//分页模糊
		PageInfo<Buy> info=service.selects(vo,page,pageSize);
		m.addAttribute("info", info);
		m.addAttribute("m", m);
		return "list";
		
	}
	@RequestMapping("add")//添加
	public String add(){
		Buy buy = new Buy();
		buy.setBeizhu("kbbuv");
		buy.setBuydate("2020-05-06");
		buy.setName("王6五");
		buy.setPhone("666131316");
		buy.setRid(3);
		int i=service.add(buy);
		return "add";
		
	}
}
