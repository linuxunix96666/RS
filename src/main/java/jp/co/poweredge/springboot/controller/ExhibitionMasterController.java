package jp.co.poweredge.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.poweredge.springboot.service.ExhibitionMasterService;

@Controller
public class ExhibitionMasterController {

	@Autowired
	private ExhibitionMasterService exhibitionMasterService;

	@RequestMapping("/allExhMas")
	public String getAllExhibitionMaster(Model model) {
		return "index";
	}
}
