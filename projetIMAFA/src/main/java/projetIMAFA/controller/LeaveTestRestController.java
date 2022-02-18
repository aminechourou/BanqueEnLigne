package projetIMAFA.controller;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projetIMAFA.entity.LeaveTest;
import projetIMAFA.entity.Leave_reason;
import projetIMAFA.entity.Type_Leave;
import projetIMAFA.service.ILeaveTestService;
import projetIMAFA.service.ILeaveTestService;

@RestController
public class LeaveTestRestController {
	@Autowired
	ILeaveTestService leaveTestService;

	/*@Autowired
	TwillioService twillioService;

	@Autowired
	UserService userService;
	
	/*@Value("${app.twillio.fromPhoneNo}")
	private String from;

	@Value("${app.twillio.toPhoneNo}")
	private String to;


	@GetMapping("/leaves")
	@ResponseBody
	public List<LeaveTest> getLeaves() {
		List<LeaveTest> list = leaveTestService.retrieveAllLeaves();
		return list;
	}


	@GetMapping("/retrieveLeave/{LeaveId}")
	@ResponseBody
	public LeaveTest retrieveLeave(@PathVariable("LeaveId") String Id) {
		return leaveTestService.retrieveLeave(Id);
	}

	@GetMapping("/retrieveLeaveType/{type}")
	@ResponseBody
	public List<LeaveTest> retrieveLeaveByType(@PathVariable("type") Type_Leave type) {
		return leaveTestService.retrieveLeaveByType(type);
	}

	@GetMapping("/retrieveLeaveReason/{reason}")
	@ResponseBody
	public List<LeaveTest> retrieveLeaveByReason(@PathVariable("reason") Leave_reason reason) {
		return leaveTestService.retrieveLeaveByReason(reason);
	}


	@PostMapping("/addLeave")
	@ResponseBody
	public LeaveTest addLeave(@RequestBody LeaveTest l) {

		if(l.getEnd_date().compareTo(l.getStart_date())<0)
		{
			return addLeave(null);
		}
		else
		{
			//l.setUser(userService.getcode(auth.getName()));
			LeaveTest leave = leaveTestService.addLeave(l);
			leaveTestService.duration();
			String body = "The employee whose email = took a leave.";
			
			return leave;
		}
	}

	@DeleteMapping("/removeLeave/{leaveId}")
	@ResponseBody
	public void removeLeave(@PathVariable("leaveId") String leaveId) {
		leaveTestService.deleteLeave(leaveId);
	}

	@PutMapping("/updateLeave")
	@ResponseBody
	public LeaveTest updateLeave(@RequestBody LeaveTest l) {
		LeaveTest leave = leaveTestService.updateLeave(l);
		leaveTestService.duration();
		return leave;
	}

	@PutMapping("/affecterUserToLeave/{Leave_ID}/{User_ID}")
	@ResponseBody
	public void affecterUserToLeave(@PathVariable("Leave_ID") int idl,@PathVariable("User_ID") int id) {
		leaveTestService.affecterUserALeave(idl, id);
		String body = "\n" + "The employee whose id =" +id+ "took a leave.";
		//twillioService.sendSms(to, from, body);
	}
	
	@PostMapping("/duration")
	@ResponseBody
	public int duration(@RequestBody LeaveTest l) {
		return leaveTestService.duration(); 
	}
	
	//stat nombre des conges par an
	@GetMapping(value ="/retrieve-all-leaves-year")
	public List<?> statyear() {

		return leaveTestService.statyearr();
	}
	//stat nombre des conges par mois
	@GetMapping(value ="/retrieve-all-leaves-month")
	public List<?> statmonth() {

		return leaveTestService.statmonthh();

	}
}
*/