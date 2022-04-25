package proSelf;
import java.util.*;
public class HospitalAbove {
	public static boolean appointment(String appDay,String dep,Doctor a,Doctor b,Doctor c,Doctor d,Neurology e,Neurology f,Dermatology g,Dermatology h) {
		String temp=appDay;
		appDay=appDay.toLowerCase();
		dep=dep.toLowerCase();
		int day=-1;;
		switch (appDay) {
		case "monday":
		day=0;
		break;
		case "tuesday":
		day=1;
		break;
		case "wednesday":
		day=2;
		break;
		case "thursday":
		day=3;
		break;
		case "friday":
		day=4;
		break;
		}
		int cnt=0;
		if(day<0) {
			System.out.println("Not a valid entry or day. Please try again.");
			return true;
		}
		if(a.depart.equalsIgnoreCase(dep)&&a.availableDay[day]==1) {
			System.out.println("\nAppointment is done.\nYour doctor is "+a.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
			cnt++;
		}
        if(b.depart.equalsIgnoreCase(dep)&&b.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is "+b.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(c.depart.equalsIgnoreCase(dep)&&c.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is :"+c.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(d.depart.equalsIgnoreCase(dep)&&d.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is "+d.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(e.depart.equalsIgnoreCase(dep)&&e.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is "+e.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(f.depart.equalsIgnoreCase(dep)&&f.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is "+f.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(g.depart.equalsIgnoreCase(dep)&&g.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is "+g.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(h.depart.equalsIgnoreCase(dep)&&h.availableDay[day]==1) {
        	System.out.println("\nAppointment is done.\nYour doctor is "+h.nameSurname+".\nYour appointment day is "+temp.toLowerCase()+".");
        	cnt++;
		}
        if(cnt==0) {
        	System.out.println("Not a valid entry. Please try again.");
        	return true;
        }else return false;
	}
	
public static Scanner scan=new Scanner (System.in);
	public static void main(String[] args) {
		

int [] days1= {1,0,1,0,1};
int [] days2= {0,1,0,1,0};
int [] days3= {1,1,0,1,0};
int [] days4= {0,0,1,0,1};
int [] days5= {1,1,1,0,0};
int [] days6= {0,0,0,1,1};
int [] days7= {1,0,1,1,0};
int [] days8= {0,1,0,0,1};

// polymorphysim concept
Doctor int1=new Cardiology("Mehmet Temmuz Boyraz",days1,10);
Doctor int2=new Cardiology("Þerife Küçükköþker",days2,8);
Doctor pla1=new Plastic("Mehmet Karaca",days3,21);
Doctor pla2=new Plastic("Uygar Gündüz",days4,17);
Neurology sur1=new Neurology("Talha Yavçýn",days5,8);
Neurology sur2=new Neurology("Tahir Temizkan",days6,45);
Dermatology der1=new Dermatology("Selahattin Ege Karagözlü",days7,31);
Dermatology der2=new Dermatology("Büþra Uzunkürek",days8,15);

boolean control = true;
System.out.println("Welcome to Hospital Above.");
while(control) {
System.out.println("To get to know our beloved doctors and see their availability throughout the week please enter the word \"yes or no\".");
String dec;
dec=scan.nextLine();
dec=dec.toLowerCase();
if(dec.equals("yes")) {
	int1.showInfo();
	int1.docSchedule();
	int2.showInfo();
	int2.docSchedule();
	pla1.showInfo();
	pla1.docSchedule();
	pla2.showInfo();
	pla2.docSchedule();
	sur1.showInfo();
	sur1.docSchedule();
	sur2.showInfo();
	sur2.docSchedule();
	der1.showInfo();
	der1.docSchedule();
	der2.showInfo();
	der2.docSchedule();
	control = false;
}
else if(dec.equals("no")) {	
	control = false;
}
else System.out.println("Not a valid entry. Please try again.");
}
boolean control1 = true;

String patappday="";
String patdepart = 	"";
while (control1) {
System.out.println("Please enter the department that you would like to take an appointment.(Cardiology,Plastic Surgery,Neurology,Dermatology)");
patdepart=scan.nextLine();
patdepart = patdepart.toLowerCase();
if(!(patdepart.equals("neurology") || patdepart.equals("cardiology") || patdepart.equals("plastic surgery") || patdepart.equals("dermatology"))) {
	System.out.println("Not a valid entry or department. Please try again.");
}
else control1=false;
}
boolean control2 = true;
while(control2) {
System.out.println("Please enter the day that you would like to take an appointment.(Only week days)");
patappday=scan.nextLine();
control2=appointment(patappday,patdepart,int1,int2,pla1,pla2,sur1,sur2,der1,der2);
}
int patientAge;
String patientMail;
long patienTel;
String patientName;

System.out.println("Please enter your name : ");
patientName=scan.nextLine();
System.out.println("Please enter your mail adress : ");
patientMail=scan.nextLine();
System.out.println("Please enter your age : ");
patientAge=scan.nextInt();
System.out.println("Please enter your telephone number : ");
patienTel=scan.nextLong();

Patient patient1=new Patient(patientName,patientAge,patientMail,patienTel);
boolean control3=true;
while(control3) {
System.out.println("Would you like to see your needed minimal calorie amount per day and your BMI?(if so please enter the key letter \"y or n\")");
char keyLet=scan.next().toLowerCase().charAt(0);
if(keyLet=='y') {
	System.out.println("\nMinimum Calorie Amount: "+patient1.MinCal());
	System.out.println("BMI: "+patient1.bmiCalculate());
	control3=false;
}
else if(keyLet=='n') {
	control3=false;
}
else control3=true;
}
System.out.println("\n           Patient Infos");
System.out.println("*******************************************");
System.out.println("Patient Name: "+patient1.getName());
System.out.println("Patient Mail Adress: "+patient1.getMail());
System.out.println("Patient Age: "+patient1.age);
System.out.println("Patient Telephone Number: "+patient1.getTelNum());
System.out.println("\n         Appointment Infos");
System.out.println("*******************************************");
System.out.println("Selected Department: "+patdepart);
System.out.println("Selected Day of appointment: "+patappday.toLowerCase());
boolean control4=true;
while(control4) {
System.out.println("Do you have a health insurance?(type \"y or n\" if you have one)");
char holder=scan.next().toLowerCase().charAt(0);
if(holder=='y'){
	patient1.calculateCost(holder);
	control4=false;
	}
else if(holder=='n') {
	patient1.calculateCost();
	control4=false;
}
else control4=true;
}
}
}
