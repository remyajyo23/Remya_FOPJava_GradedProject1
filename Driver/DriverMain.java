package Driver;

import Model.AdminDepartment;
import Model.HrDepartment;
import Model.TechDepartment;
import Service.PrintDepartment;

public class DriverMain {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		PrintDepartment.printAdmin(admin);
		System.out.println();

		HrDepartment hr = new HrDepartment();
		PrintDepartment.printHr(hr);
		System.out.println();

		TechDepartment tech = new TechDepartment();
		PrintDepartment.printTech(tech);

	}

}
