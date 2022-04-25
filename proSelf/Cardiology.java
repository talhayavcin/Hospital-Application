package proSelf;

public class Cardiology extends Doctor {

	public Cardiology( String nameSurname, int[] availableDay,int exp) {
		super(nameSurname, nameSurname, availableDay, exp);
		// TODO Auto-generated constructor stub
		depart="Cardiology";
		this.nameSurname=nameSurname;
		this.availableDay=availableDay;
		this.exp=exp;
	}
	

}
