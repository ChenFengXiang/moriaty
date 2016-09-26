package com.cfx.test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;

public class Test extends HttpServlet{

	public void money(){
		Map< String, String> map = new HashMap<String, String>();
		map.put("1", "未结算");
		map.put("2", "结算中");
		map.put("3", "结算中");
	}
	public static void main(String[] args) {
		System.out.println("github!");
	}
}
