package me.aoa4eva.demo;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	
	@Autowired 
	private RoomRepository roomRepository; 
	
	@RequestMapping("/")
	public String showIntro()
	{
		return "welcomeForm";
	}
	
	@GetMapping("/addRoom")
	public String addARoom(@ModelAttribute("thisRoom") Room room)
	{
		return "addRoomForm";
	}
	
	@PostMapping("/addRoom")
	public String saveRoom(@Valid @ModelAttribute("thisRoom") Room r, BindingResult result)
	{
		System.out.println(result.toString());
		if(result.hasErrors())
		{
			return "addRoomForm";
		}
		System.out.println(r.getRented());
		if(r.getRented()==null) // The HTML form passes a value of "Y" for checked. This code makes sure there is also a value for "N"
			r.setRented("N");
		roomRepository.save(r);
		return "welcomeForm";
	}
	
	@GetMapping("/listRooms")
	public String showRooms(Model m)
	{
		Iterable <Room> rooms = roomRepository.findAll();
		m.addAttribute("roomList",rooms);
		return "roomListForm";
	}

}
