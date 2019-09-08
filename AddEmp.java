package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddEmp
{
	WebDriver driver;
	public AddEmp(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	@FindBy(id = "EmployeeLbl") WebElement emp;
	@FindBy(id = "addEmpLbl") WebElement add;
	@FindBy(id = "loginName") WebElement logname;
	@FindBy(id = "password") WebElement pass;
	@FindBy(id = "fName") WebElement fname;
	@FindBy(id = "lName") WebElement lname;
	@FindBy(id = "designation") WebElement design;
	@FindBy(id = "mRadio") WebElement sex;
	@FindBy(id = "dateOfBirth") WebElement dob;
	@FindBy(id = "login.status") WebElement status;
	@FindBy(id = "department.id") WebElement deptid;
	@FindBy(id = "salary") WebElement sal;
	@FindBy(id = "mobileNo") WebElement cellNo;
	@FindBy(id = "maritalStatus") WebElement matrialstatus;
	
	public void addEmpolyee(String loginNam,String password1,String FName,String LName,String birth,String salary,String cell)
	{
		emp.click();
		add.click();
		logname.sendKeys(loginNam);
		pass.sendKeys(password1);
		fname.sendKeys(FName);
		lname.sendKeys(LName);
		Select s = new Select(design);
		s.selectByVisibleText("System Engineer");
		sex.click();
		dob.sendKeys(birth);
		Select s1 = new Select(status);
		s1.selectByValue("1");
		sal.sendKeys(salary);
		cellNo.sendKeys(cell);
		Select s2 = new Select(matrialstatus);
		s2.selectByVisibleText("Married");
		
	}
	

}
