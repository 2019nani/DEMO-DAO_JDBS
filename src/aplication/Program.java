package aplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("====== Test 1: seller findById ======");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		System.out.println();
		System.out.println("====== Test 2: seller findByDepartmentId ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
			System.out.println();
			System.out.println("====== Test 3: seller findAll ======");
			list = sellerdao.findAll();
			for (Seller x : list) {
				System.out.println(x);
				System.out.println();

			}
			System.out.println("====== Test 4: seller Insert ======");
			Seller newSeller = new Seller(null,"davi","d@gmail.com",new Date(),10000.00,department);
		    sellerdao.insert(newSeller);
			System.out.println("Inserted! New id = " + newSeller.getId());
			System.out.println();
			System.out.println("====== Test 5: seller Update ======");
			seller = sellerdao.findById(1);
			seller.setNome("Martha Waine");
			sellerdao.update(seller);
			System.out.println("Update Completed");
			System.out.println();
			System.out.println("====== Test 6: seller delete ======");
			System.out.println("Enter with id for delete");
			int id = sc.nextInt();
			sellerdao.deleteById(id);
			System.out.println("Delete completed");
			sc.close();
		}
	}



