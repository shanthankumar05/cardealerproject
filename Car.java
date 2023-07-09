import java.util.*;
import java.io.*;
public class Car {
	public static void main(String[] args) {
		int carCost;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Select car model: ");
		String carName = sc.nextLine();
		CarCost ccost = new CarCost(); 
		ccost.findCostOfCar(carName);
		System.out.print("Do you need Insurance: ");
		String insuranceCheck = sc.next();
		System.out.print("Do you need Additional Accessories: ");
		String accessoriesCheck = sc.next();
		ccost.discountCheck(insuranceCheck,accessoriesCheck);
		ccost.total(insuranceCheck,accessoriesCheck);
	}
}
