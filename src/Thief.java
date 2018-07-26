
public class Thief implements MailService {

	int min;
	int count=0;
	public Thief(int min){
		this.min=min;
	}
	public int getStolenValue(){
		return count;
	}
	@Override
	public Sendable processMail(Sendable mail) {
		// TODO Auto-generated method stub
		if (mail instanceof MailPackage)
		{
			if (((MailPackage) mail).getContent().getPrice()>=min){
				count+=((MailPackage) mail).getContent().getPrice();
				Package nov = new Package("stones instead of "+((MailPackage)mail).getContent().getContent(), 0);
				MailPackage noviy = new MailPackage(mail.getFrom(), mail.getTo(), nov);
				return noviy;
			}
		}
		return mail;
	}
	

}
