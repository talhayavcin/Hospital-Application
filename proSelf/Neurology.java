package proSelf;

public class Neurology extends Doctor {
	public Neurology( String nameSurname, int[] availableDay,int exp) {
		super(nameSurname, nameSurname, availableDay, exp);
		// TODO Auto-generated constructor stub
		depart="Neurology";
		this.nameSurname=nameSurname;
		this.availableDay=availableDay;
		this.exp=exp;
	}
	

}
