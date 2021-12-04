package projetIMAFA.service;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import projetIMAFA.entity.LeaveTest;
import projetIMAFA.entity.Leave_reason;
import projetIMAFA.entity.Type_Leave;
import projetIMAFA.entity.User;
import projetIMAFA.repo.LeaveTestRepository;
import projetIMAFA.repo.UserRepository;


@Service
public class LeaveTestServiceImpl implements ILeaveTestService{

			@Autowired
			LeaveTestRepository leaveTestRepository;
			@Autowired
			UserRepository userRepository;
			private static final Logger l = LogManager.getLogger(LeaveTestServiceImpl.class);

			public List<LeaveTest> retrieveAllLeaves() {
				List<LeaveTest> leaves = (List<LeaveTest>) leaveTestRepository.findAll();
				for(LeaveTest leave : leaves)
				{
					l.info("leave ++ :"+leave);
				}
				return leaves;
				
			}

			public LeaveTest addLeave(LeaveTest l) {
				LeaveTest leaveSaved = null;
				leaveSaved=leaveTestRepository.save(l);
				return leaveSaved;
				
			}

			public void deleteLeave(String id) {
				leaveTestRepository.deleteById(Integer.parseInt(id));
				
			}

			public LeaveTest updateLeave(LeaveTest l) {
				LeaveTest leaveAdded = leaveTestRepository.save(l);
				return leaveAdded;
			}

			public LeaveTest retrieveLeave(String id) {
			
				l.info("in retrieveLeave id= "+id);
				LeaveTest l = leaveTestRepository.findById(Integer.parseInt(id)).orElse(null);
				l.info("Leave returned : "+l);
				return l;
				
			}
			
			public List<LeaveTest> retrieveLeaveByType(Type_Leave type)
			{
				List<LeaveTest> leaves = (List<LeaveTest>) leaveTestRepository.retrieveLeaveByType(type);
				for(LeaveTest leave : leaves)
				{
					l.info("leave ++ :"+leave);
				}
				return leaves;	
			}
			public List<LeaveTest> retrieveLeaveByReason(Leave_reason reason)
			{
				List<LeaveTest> leaves = (List<LeaveTest>) leaveTestRepository.retrieveLeaveByReason(reason);
				for(LeaveTest leave : leaves)
				{
					l.info("leave ++ :"+leave);
				}
				return leaves;	
			}
			
			@Override
			public void affecterUserALeave(int idl, int id) {
			LeaveTest leave = leaveTestRepository.findById(idl).get();
			User user = userRepository.findById(id).get();
			if (!ObjectUtils.isEmpty(leave) && !ObjectUtils.isEmpty(user))
				leave.setUser(user);
			userRepository.save(user);

			}
			
			@Override
			public List<?> statyearr() {


			return leaveTestRepository.statyearr();
			}
			@Override
			public List<?> statmonthh() {


			return leaveTestRepository.statmonthh();
			}

			
			 public int duration()
			    {
			    	return leaveTestRepository.duration();
			    	
			    }

	}

