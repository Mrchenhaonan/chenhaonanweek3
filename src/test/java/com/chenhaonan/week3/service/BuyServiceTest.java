package com.chenhaonan.week3.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenhaonan.common1.utils.random.RandNumUtil;
import com.chenhaonan.common1.utils.string.ZHStringUtil;
import com.chenhaonan.week3.entity.Buy;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classPath:sping-beans.xml")
public class BuyServiceTest extends TestCase {
	
	@Autowired
	private BuyService service;
	@Test
	public void add(){
		List<Buy> list=new ArrayList<Buy>();
		Buy buy = new Buy();
		for (int i = 0; i < 100; i++) {
			Date date=randomDate("2020-05-01", "2020-04-27");//规定时间
			buy.setBuydate(new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(date));
			buy.setName(ZHStringUtil.getZHName());
			buy.setPhone("RandNumUtil.random(100000000, 999999999)");
			buy.setRid(RandNumUtil.random(1, 3));
			buy.setBeizhu(ZHStringUtil.getZHString(10));
		}
		list.add(buy);
		service.addall(list);
	}
private static Date randomDate(String beginDate,String endDate){//生成随机时间
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date start = format.parse(beginDate);
			Date end = format.parse(endDate);
			if(start.getTime()>=end.getTime()){
				return null;
			}
			long date=random(start.getTime(),end.getTime());
			return new Date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	private static long random(long end, long begin) {
		// TODO Auto-generated method stub
		long rtn=begin+(long)(Math.random()*(end-begin));
		if(rtn==begin || rtn==end){
			return random(begin, end);
		}
		return rtn;
	}
}
