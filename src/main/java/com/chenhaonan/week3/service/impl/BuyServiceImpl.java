package com.chenhaonan.week3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenhaonan.week3.dao.BuyDao;
import com.chenhaonan.week3.entity.Buy;
import com.chenhaonan.week3.entity.Buyvo;
import com.chenhaonan.week3.service.BuyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BuyServiceImpl implements BuyService{
	@Autowired
	private BuyDao dao;

	@Override
	public Object addall(List<Buy> list) {//批量添加
		// TODO Auto-generated method stub
		return dao.addall(list);
	}

	@Override
	public PageInfo<Buy> selects(Buyvo vo, Integer page, Integer pageSize) {//分页
		// TODO Auto-generated method stub
		PageHelper.startPage(page,pageSize);
		List<Buy> list=dao.selects(vo);
		return new PageInfo<Buy>(list);
	}

	@Override//单条添加
	public int add(Buy buy) {
		// TODO Auto-generated method stub
		return dao.add(buy);
	}
	
}
