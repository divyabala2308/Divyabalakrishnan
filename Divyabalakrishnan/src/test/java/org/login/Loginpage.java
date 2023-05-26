package org.login;

import org.bases.Basess;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basess {
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement clickprice ;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createbtn;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(xpath="//div[text()='Mobile number or email address']")
	private WebElement emailid;
	
	@FindBy(id="password_step_input")
	private WebElement password1;
	
	
	@FindBy(id="location")
	private WebElement dropdownlocation;
	
	@FindBy(id="hotels")
	private WebElement dropdownhotel;
	
	@FindBy(id="room_type")
	private WebElement dropdownroom;
		
	@FindBy(id="room_nos")
	private WebElement dropdownroomno;
		
	@FindBy(id="adult_room")
	private WebElement dropdownadult;
		
	@FindBy(id="child_room")
	private WebElement dropdownchildren;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
   @FindBy(id="Submit")
	private WebElement searchbtn;
   
   @FindBy(id="radiobutton_0")
   private WebElement radiobtn;
   
   @FindBy(id="continue")
   private WebElement continuebtn;
   
   @FindBy(id="address")
   private WebElement address;
   
   @FindBy(id="cc_num")
   private WebElement cnumber;
   
   @FindBy(id="cc_type")
   private WebElement cardtype;
   
   @FindBy(id="cc_exp_month")
   private WebElement expirymnth ;
   
   @FindBy(id="cc_exp_year")
   private WebElement expiryyear ;
   
   @FindBy(id="cc_cvv")
   private WebElement cvv ;
   
   @FindBy(id="book_now")
   private WebElement booknowbtn ;
   
   @FindBy(id="order_no")
   private WebElement atributevalue;
   
 
	
	
	//getter
	public WebElement gettxtusername() {
		return txtusername;
		
	}
	public WebElement getpassword() {
		return password;
		

	}
	
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
		
	}
	public WebElement getCreatebtn() {
		return createbtn;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPassword1() {
		return password1;
	}
	
	public WebElement getdropdownlocation() {
		return dropdownlocation;
	}
	
	public WebElement getdropdownhotel() {
		return dropdownhotel;
	}
	
	public WebElement getdropdownroom() {
		return dropdownroom;
	}
	
	public WebElement getdropdownroomno() {
		return dropdownroomno;
	}
	
	public WebElement getdropdownadult() {
		return dropdownadult;
	}
	
	public WebElement getdropdownchildren() {
		return dropdownchildren;
	}
	
	public WebElement getcheckindate() {
		return checkindate;
		
	}
	
	public WebElement getcheckoutdate() {
		return checkoutdate;
		
	}
	
	public WebElement getsearchbtn() {
		return searchbtn;
	}
	
	public WebElement getradiobtn() {
		return radiobtn;
	}
	
	public WebElement getcontinuebtn() {
		return continuebtn;
		

	}
	
	public WebElement getaddress() {
		return address;
	}
	
	public WebElement getcnumber() {
		return cnumber;
			
	}
	
	public WebElement getcardtype() {
		return cardtype;
			
	}
	
	public WebElement getexpirymnth() {
		return expirymnth;
			
	}
	
	public WebElement getexpiryyear() {
		return expiryyear;
			
	}

	public WebElement getbooknowbtn() {
		return booknowbtn;
			
	}
	
	public WebElement getcvv() {
		return cvv;
			
	}
	
	public WebElement getatributevalue() {
		return atributevalue;
		
	}
	
	public WebElement getclickprice() {
		return clickprice;
		 
		
	}
	
	
	
	
	
		


}
	
	