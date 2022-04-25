package proSelf;

public class Dermatology extends Doctor{
	
	public Dermatology( String nameSurname, int[] availableDay,int exp) {
		super(nameSurname, nameSurname, availableDay, exp);
		// TODO Auto-generated constructor stub
		depart="Dermatology";
		this.nameSurname=nameSurname;
		this.availableDay=availableDay;
		this.exp=exp;
	}
	
}
