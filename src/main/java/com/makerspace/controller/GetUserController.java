package com.makerspace.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.makerspace.bean.User;

import freemarker.template.Configuration;

/**
 * @author 李关钦
 * @version 2017年1月23日
 */
@Controller
public class GetUserController {

	@Autowired
	private Configuration configuration;

	private static final Logger logger = LoggerFactory.getLogger(GetUserController.class);

	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	public ModelAndView getUserList() {
		logger.info("-----------get user list------------start");
		ModelAndView mav = new ModelAndView();
		Map<String, Object> param = new HashMap<String, Object>();
		try {
			param.put("name", "stefan");
			param.put("password", "123456");
			param.put("login_time", new Date());

			mav.addObject("name", "stefan");
			mav.addObject("password", "123456");
			mav.addObject("login_time", new Date());
			mav.setViewName("userList");

			User user = new User("stefan", 23, "男");

			User user1 = new User("stefan1", 161, "男1");
			User user2 = new User("stefan2", 162, "男2");
			User user3 = new User("stefan3", 163, "男3");

			List<User> list = new ArrayList<User>();
			list.add(user1);
			list.add(user2);
			list.add(user3);

			mav.addObject("user", user);
			mav.addObject("users", list);

			// Template template = configuration.getTemplate("userList.ftl");
			// template.setDateFormat("yyyy-MM-dd HH:mm:ss");
			// template.process(param, new OutputStreamWriter(System.out));

		} catch (Exception e) {
			logger.error("get userList error : ", e);
		}
		logger.info("-----------get user list------------end");
		return mav;
	}
}

