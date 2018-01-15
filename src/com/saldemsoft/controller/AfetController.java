package com.saldemsoft.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.saldemsoft.entity.Afet;
import com.saldemsoft.model.AfetModel;
import com.saldemsoft.repo.AfetRepository;

@Controller
public class AfetController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7366783022729699614L;
	@Autowired
	private transient AfetRepository afetRepository;

	@RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
	public ModelAndView list() {
		List<Afet> afets = afetRepository.findAll();
		ModelAndView model = new ModelAndView("index");
		model.addObject("lists", afets);
		model.addObject("afetModel", new AfetModel());
		return model;
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String save(@ModelAttribute("afetModel") AfetModel afetModel) {
		Afet afet =new Afet();
		afet.setNeden(afetModel.getNeden());
		afet.setSeriNo(afetModel.getSeriNo());
		afetRepository.save(afet);
		return "index";
	}

}
