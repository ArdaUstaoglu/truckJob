package truckJob;

import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Main {

	public static void main(String[] args) {
		ArrayList<Driver> drivers = new ArrayList<>();
		drivers.add(new Driver("�smail", "O�uz", "05374789854"));
		drivers.add(new Driver("Burak", "Kural", "0532 548 78 65"));
		drivers.add(new Driver("Nur", "Saad", "0534 548 65 65"));

		ArrayList<Truck> trucks = new ArrayList<>();
		trucks.add(new Truck("14 BM 526", "Scania", "2011"));
		trucks.get(0).setDriver(drivers.get(2));
		
		trucks.add(new Truck("34 GS 22", "Dodge", "1960",drivers.get(1)));
		
		trucks.add(new Truck());
		trucks.get(2).setPlateNumber("35 FB 60");
		trucks.get(2).setBrand("Mercedes");
		trucks.get(2).setModel("2023");
		trucks.get(2).setDriver(drivers.get(0));
	
		ArrayList<Company> companies=new ArrayList<>();
		companies.add(new Company("Kayra", "05313154698", "T�rkiye/�stanbul"));
		companies.add(new Company("Talha A.�", "05976428564", "T�rkiye/Ankara"));
		companies.add(new Company("Kayra", "05313154698", "T�rkiye/�zmir"));
		
		ArrayList<Dispacher> dispachers=new ArrayList<>();
		dispachers.add(new Dispacher("Arda", "Ustao�lu", "0564 892 74 62", "egekargo@gmail.com"));
		dispachers.add(new Dispacher("Erdem", "Ba�c�", "0564 151 24 81", "bagci@gmail.com"));
		dispachers.add(new Dispacher("Azizcan", "Kabaday�", "0589 810 27 18", "bulut@gmail.com"));
				
		ArrayList<Job> jobs=new ArrayList<>();
		jobs.add(new Job("Ostim Organize Sanayi/Ankara", "�kitelli Organize Sanayi/�stanbul", 12845.35, 24348.93, 423, companies.get(1), trucks.get(2), dispachers.get(0)));           
		jobs.add(new Job("�zmir", "Samsun", 34578.03, 28123.47, 2147, companies.get(2), trucks.get(0), dispachers.get(1)));
		jobs.add(new Job("Bolu", "�anakkale", 25953, 36800, 587, companies.get(0), trucks.get(1), dispachers.get(2)));	
		
		for(Job job:jobs) {
			System.out.println("<---"+job.getJobfrom()+"-"+job.getJobDestination()+"--->");
			System.out.println("---�� Bilgileri---");
			System.out.println("Nereden :"+job.getJobfrom());
			System.out.println("Nereye :"+job.getJobDestination());
			System.out.println("Tutar :"+job.getCost());
			System.out.println("A��rl�k :"+job.getWeight()+" KG");
			System.out.println("Mesafe :"+job.getDestinationRange()+" KM");
			System.out.println("---M��teri Bilgileri---");
			System.out.println("�irket Ad� :"+job.getCompany().getName());
			System.out.println("�irket Telefon :"+job.getCompany().getPhone());
			System.out.println("�irket Adresi :"+job.getCompany().getAddress());
			System.out.println("---Ara� Bilgileri---");
			System.out.println("Plaka :"+job.getTruck().getPlateNumber());
			System.out.println("Marka :"+job.getTruck().getBrand());
			System.out.println("Model :"+job.getTruck().getModel());
			System.out.println("---S�r�c� Bilgileri---");
			System.out.println("�sim :"+job.getTruck().getDriver().getName()+" "+job.getTruck().getDriver().getSurname());
			System.out.println("Telefon :"+job.getTruck().getDriver().getPhone());
			System.out.println("---Arac� Bilgileri---");
			System.out.println("�sim :"+job.getDispacher().getName()+" "+job.getDispacher().getSurname());
			System.out.println("Telfon :"+job.getDispacher().getPhone());
			System.out.println("E-posta :"+job.getDispacher().getMail());
			
			
			
			
		}
	
		
		
		
		
	}

}
