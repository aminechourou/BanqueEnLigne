package projetIMAFA.service;

public interface TwilioService {

	void sendSms(String to, String from, String body);
	void makeCall(String from, String to);
}
