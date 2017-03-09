package com.uma.IplApp.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uma.IplApp.Model.Team;
import com.uma.IplApp.Model.User;
import com.uma.IplApp.Service.TeamService;
import com.uma.IplApp.Service.UserService;
@Controller
public class SignInController {
	//Logger logger=Logger.getLogger("DATAFETCHING");
	@Autowired
	private UserService userService;
	@Autowired
	TeamService teamService;
/*	Logger logger=Logger.getLogger("DATAFETCHING");*/
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String init() {
		return "signin";
	}


	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletRequest request, Model model) {
		//logger.info("Method : signin "+email);
		User user = userService.authUser(email, password);

		if (user == null) {
			return new ModelAndView("failure");
		} else {
			HttpSession sesion = request.getSession();
			sesion.invalidate(); // invalidate existing session
			//logger.debug(sesion);
			// creating new session
			sesion = request.getSession();
			sesion.setAttribute("user", user);
			// Maximum active time
			sesion.setMaxInactiveInterval(10000);
			String userName = user.getName();
		
			model.addAttribute("userName", userName);
			List<Team> teamInfo = teamService.displayAllTeam();
	
			return new ModelAndView("teamlist", "teamInfo", teamInfo);
		}

	}

	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public String signout(HttpServletRequest request) {
		HttpSession sesion = request.getSession();
		sesion.invalidate();
		sesion = request.getSession();
		return "signin";

	}

}