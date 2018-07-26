
public class UntrustworthyMailWorker implements MailService {


		
		public RealMailService realMailService=new RealMailService();
		private MailService [] mailService;
		
		public UntrustworthyMailWorker(MailService [] mailService){
		
			this.mailService=mailService;

		}
		public MailService getRealMailService(){
			return realMailService; 
		}
		@Override
		public Sendable processMail(Sendable mail) {
			
	         mail = realMailService.processMail(mail);
			 for (int i = 0; i < mailService.length; i++) {
	             mail = mailService[i].processMail(mail);
	         }

			 return mail;

	      
		}
}