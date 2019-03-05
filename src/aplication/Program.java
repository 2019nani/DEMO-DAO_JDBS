package aplication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1,"book");
		Seller seller = new Seller(21,"Bob","a@gmail.com",new Date(),300.0,obj);
        SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println(seller);
	}

}
