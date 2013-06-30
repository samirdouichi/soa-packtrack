package org.sjo.controller.ressource;

import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjo.model.ressource.Agence;
import com.sjo.services.AgenceService;

@Controller
public class AgenceController {

	@Autowired
	private AgenceService agenceService;

	@RequestMapping("/index")
	public String listAgences(Map<String, Object> map) {

		map.put("agence", new Agence());
		map.put("agenceList", agenceService.listAgence());

		return "agence";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addAgence(@ModelAttribute("agence")
	Agence agence, BindingResult result) {

		agenceService.addAgence(agence);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{agenceId}")
	public String deleteAgence(@PathVariable("agenceId")
	Integer agenceId) {

		agenceService.removeAgence(agenceId);

		return "redirect:/index";
	}
}
