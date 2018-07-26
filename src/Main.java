
public class Main {

	public static final String AUSTIN_POWERS = "Austin Powers";
	public static final String WEAPONS = "weapons";
	public static final String BANNED_SUBSTANCE = "banned substance";
	
	public static void main(String[] args) {
		//System.out.println(11);// TODO Auto-generated method stub

		int k=1;
		
		/*if(k==1)
		throw new IllegalPackageException();*/
		
		
		
		
		//Sendable a=new Package("sssssss", 15);
		
		Package p = new Package("stonessdfsf sdfkljj", 28);
		
		MailPackage mp = new MailPackage("a", "b", p);
		
		Inspector in=new Inspector();
		
		//in.processMail(mp);
		
		Thief vor = new Thief(21);
		
		System.out.println(mp.getContent().getPrice());
		MailPackage a = (MailPackage)vor.processMail(mp);
		//System.out.println(();
		System.out.println(a.getContent().getPrice());
		System.out.println(mp.getContent().getContent());
		
		//System.out.println(12);
	}

}
