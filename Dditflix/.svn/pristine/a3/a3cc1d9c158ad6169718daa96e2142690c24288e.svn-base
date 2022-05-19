package kr.or.ddit.util;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	public static void SendPw(String password, String email) {
		try {
			Properties prop = System.getProperties();
			
			// 이메일 발송을 위한 SMTP 서버 주소(네이버)
			prop.put("mail.smtp.host", "smtp.naver.com");
			
			// 메일 서버 포트번호 (네이버SMTP 587번 포트)
			prop.put("mail.smtp.port", 587);
			
			// 인증이 필요할때 true 
			prop.put("mail.smtp.auth", "true");
			
			Session session = Session.getInstance(prop, new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("dditflix", "eovmfflrtm1!");					
				}
			});
			
			Message message = new MimeMessage(session);
			
			// 발신자 이메일 주소 설정
			message.setFrom(new InternetAddress("dditflix@naver.com"));
			
			// 수신자 이메일 주소 설정
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			
			// 제목 설정
			message.setSubject("Ddiflix 비밀번호 안내입니다");
			
			// 메일 내용 저장
			message.setContent("회원님의 비밀번호는 [ " + password + " ] 입니다.", "text/plain;charset=utf-8");
			
			// 메일 전송
			Transport.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
