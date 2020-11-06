package com.biz.dripbag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.dripbag.model.GCommentVO;
import com.biz.dripbag.service.GCommentService;

@Controller
@RequestMapping("/gclist")
public class GCommentListController {

	@Autowired
	@Qualifier("gcServiceV1")
	GCommentService gcService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String gComentList(Model model) {

		List<GCommentVO> gcList = gcService.selectAll();
		List<GCommentVO> gctList = gcService.selectTop();

		model.addAttribute("BODY", "GC_LIST");
		model.addAttribute("GC_LIST", gcList);
		model.addAttribute("GCT_LIST", gctList);

		return "home";
	}

	@RequestMapping(value = "/thumbsup", method = RequestMethod.GET)
	public String thumbsUp(@RequestParam("id") Long seq) {

		long sequence = Long.valueOf(seq);
		System.out.println("\n\n\n" + sequence + "\n\n\n");

		GCommentVO vo = gcService.findById(sequence);

		gcService.hit(vo);

		return "redirect:/gclist/";
	}

}
