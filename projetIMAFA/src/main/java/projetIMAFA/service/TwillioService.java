package projetIMAFA.service;
import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class TwillioService implements TwilioService {

	private String ACCOUNT_SID="ACc34b1bd8decb0fcbb43d2d61fcac8135";
	private String AUTH_TOKEN="8ee91e05215dcde4b8d42d3752a135a5";
	
	@Override
	public void sendSms(String to,String from,String body) {
		
		try {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        Message message = Message.creator( new PhoneNumber(to), new PhoneNumber(from),body) // to:to which no  you want to send sms                               // body : text message
	            .create();

	        System.out.println(message);
	        System.out.println(message.getSid());

		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	

	@Override
	public void makeCall(String from, String to) {
		
		try {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        Call call = Call.creator(
	                new PhoneNumber(to),
	                new PhoneNumber(from),
	                URI.create("http://demo.twilio.com/docs/voice.xml"))
	            .setStatusCallback(URI.create("http://postb.in/1234abcd"))
	            .create();
	        System.out.println(call);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
