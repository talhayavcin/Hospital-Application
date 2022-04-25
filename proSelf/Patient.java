package proSelf;
import java.util.*;

public class Patient extends MinimumCal implements BMI  {
public static Scanner scan=new Scanner(System.in);	
private String name;
private String mail;
private long tel;
public int age;
private int heightfil;
private int weightfil;
private double a;
private double b;
private double c;

@Override
public double MinCal() {
	// TODO Auto-generated method stub
	int a=age;
	int b=enterHeight();
	int c=enterWeight();
	heightfil=b;
	weightfil=c;
	return (b*6.25)+(c*9.99)-(a*4.92)-161;
}


@Override
public double bmiCalculate() {
	b=heightfil*heightfil;
	c=b/10000;
	a=weightfil/c;
	return a;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public long getTelNum() {
	return tel;
}
public void setTelNum(long tel) {
	this.tel = tel;
}
	
public Patient(String name, int age, String mail, long tel) {
	super();
	this.name = name;
	if(age>0) {
	this.age = age;
	}
	else {
		System.out.println("Your age cannot be smaller than 0. Your age will be counted as 0.");
		this.age=0;
	}
	this.mail = mail;
	this.tel = tel;
}

//overload consept
public void calculateCost() {
	System.out.println("Cost is 80$.");
}

public void calculateCost(char a) {
	System.out.println("Cost is 40$.");
}


}
