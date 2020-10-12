package com.biz.dripbag.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.dripbag.crawling.CrwalingGooGle;
import com.biz.dripbag.model.GoogleVO;

@RequestMapping(value = "/gtrand")
@Controller
public class MKW_GoogleTrandController {

	@Autowired
	CrwalingGooGle gServ;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws IOException {

		List<GoogleVO> googleList = gServ.googleTrend();

		String title = "";
		title = googleList.get(1).getTitle().toString();
		System.out.println(title);

		model.addAttribute("TITLE", googleList);
		model.addAttribute("BODY", "GOOGLE_HOME");
		return "home";
	}

}
