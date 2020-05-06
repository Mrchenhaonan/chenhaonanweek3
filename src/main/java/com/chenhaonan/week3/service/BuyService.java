package com.chenhaonan.week3.service;

import java.util.List;

import com.chenhaonan.week3.entity.Buy;
import com.chenhaonan.week3.entity.Buyvo;
import com.github.pagehelper.PageInfo;

public interface BuyService {

	Object addall(List<Buy> list);

	PageInfo<Buy> selects(Buyvo vo, Integer page, Integer pageSize);

	int add(Buy buy);

	

}
