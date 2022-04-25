package proSelf;

public class Plastic extends Doctor {
	public Plastic( String nameSurname, int[] availableDay,int exp) {
		super(nameSurname, nameSurname, availableDay, exp);
		// TODO Auto-generated constructor stub
		depart="Plastic Surgery";
		this.nameSurname=nameSurname;
		this.availableDay=availableDay;
		this.exp=exp;
	}
}
