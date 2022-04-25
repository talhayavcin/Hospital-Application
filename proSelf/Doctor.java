package proSelf;

public class Doctor {
protected String depart;
protected int  [] availableDay= new int [5];
protected int exp;
protected String nameSurname;


public Doctor(String depart,  String nameSurname,int[] availableDay,int exp) {
	super();
	this.depart = depart;
	this.availableDay = availableDay;
	this.nameSurname = nameSurname;
	this.exp=exp;
}
public void docSchedule() {
	System.out.println("Doctor "+nameSurname+" is available at : ");
	for(int i=0;i<5;i++) {
		if(availableDay[i]==1) {
			if(i==0) {
				System.out.println("Monday");
			}
			else if(i==1) {
				System.out.println("Tuesday");
			}
			else if(i==2) {
				System.out.println("Wednesday");
			}
			else if(i==3) {
				System.out.println("Thursday");
			}
			else if(i==4) {
				System.out.println("Friday");
			}
		}
	}
	
}

public void showInfo() {
	System.out.println("\n"+nameSurname+" || Department: "+ depart+" || Experience in this sector: "+exp+" years.");
}

}
