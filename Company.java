/**
 * company is a class having the field variable employees with
 * the type of the ArrayList<Employee>. Another class file
 * named as the Employee, which is under the same company package. 
 * All the elements in Employee could be recalled by the company class. 
 * This class contains one method to increase the salaries for employees 
 * which will be also achieved in the super abstract class Employee and its
 * two sub-classes the HourlyEmployee and the MonthlyEmployee. 
 *  
 * @version 2018-12-05
 * @author Zibo Wang
 */

package company;

import java.util.ArrayList;

public class Company {
	
	private ArrayList<Employee> employees;
	
	/**
	 * Getter method to return the employees
	 * @return the employees of the company
	 */
	public ArrayList<Employee> getEmployees(){
		return employees;
	}
	/**
	 * setter method for the employees
	 * @param set new values for employees
	 */
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	/**
	 * this method is used to increase the salaries for all employees in
	 * company which contains both of the hourlyEmployee and the monthlyEmployee
	 * @param rate the increasing rate of the salaries
	 */
	public void increaseSalaries(double rate) {
		for (Employee ea : employees) {
			ea.increaseSalaries(rate);
		}
	}

}
