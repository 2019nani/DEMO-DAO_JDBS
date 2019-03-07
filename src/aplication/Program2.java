package aplication;

import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		System.out.println("====== Test 4: department Insert ======");
		Department newDepartment = new Department(6, "vigilancia");
		departmentdao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		System.out.println();

		sc.close();
	}

}
