package com.chenhaonan.week3.dao;

import java.util.List;

import com.chenhaonan.week3.entity.Buy;
import com.chenhaonan.week3.entity.Buyvo;

public interface BuyDao {

	Object addall(List<Buy> list);//批量添加

	List<Buy> selects(Buyvo vo);//分页查询

	int add(Buy buy);//单条添加

}
