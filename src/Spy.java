import java.util.logging.*;

public class Spy implements MailService {

	public Logger logger;
	
	public Spy(Logger logger){
	this.logger=logger;	
	}
	@Override
	public Sendable processMail(Sendable mail) {
		if (mail instanceof MailMessage){
			if (mail.getFrom()=="Austin Powers"||mail.getTo()=="Austin Powers"){
				logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[]{mail.getFrom(),mail.getTo(),((MailMessage) mail).getMessage()});
			}
			else logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{mail.getFrom(),mail.getTo()});
			
		}// TODO Auto-generated method stub
		return null;
	}

}
