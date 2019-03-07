package aplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
		
		 /*System.out.println("====== Test 1: department Insert ======");
		 Department newDepartment = new Department(7, "vigilancia");
		 departmentdao.insert(newDepartment); 
		 System.out.println("Inserted! New id = "+ newDepartment.getId()); 
		 System.out.println();
		 

		System.out.println("====== Test 2: department Update ======");
		Department department = departmentdao.findById(6);
		department.setNome("Vigia");
		departmentdao.update(department);
		System.out.println("Update Completed");
		System.out.println();
		
		System.out.println("====== Test 3: department findById ======");
		Department department = departmentdao.findById(6);
		System.out.println(department);
		System.out.println();
		
		System.out.println("====== Test 4: department delete ======");
		System.out.println("Enter with id for delete");
		int id = sc.nextInt();
		departmentdao.deleteById(id);
		System.out.println("Delete completed");*/

		System.out.println("====== Test 5: department findAll ======");
		List<Department> list = new ArrayList<>();
		list = departmentdao.findAll();
		for (Department x : list) {
			System.out.println(x);
			System.out.println();

		}
		sc.close();
	}

}
