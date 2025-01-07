package com.co.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.co.utils.MasterClass;


public class CommonFields extends MasterClass{
	
	public CommonFields() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addBtn;
	
	public WebElement addBtn()
	{
		return addBtn;
	}
	
	@FindBy(tagName ="small")
	//@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
	private WebElement errorMsg;
	public WebElement errorMsg() 
	{
		return errorMsg;
	}

	
	//button[text()='Submit']
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitBtn;
	
	public WebElement submitBtn()
	{
		return submitBtn;
	}
	
	//button[text()='Submit']
		@FindBy(xpath = "//button[text()='Submit']")
		private WebElement submitButton;
		
		public WebElement submitButton()
		{
			return submitButton;
		}
	
	@FindBy(xpath = "//button[text()='Back']")
	private WebElement backBtn;
	
	public WebElement backBtn()
	{
		return backBtn;
	}
	
	//button[text()='Verify']
	@FindBy(xpath = "//button[text()='Verify']")
	private WebElement verifyBtn;
	
	public WebElement verifyBtn()
	{
		return verifyBtn;
	}
	
	//id="apply"
	@FindBy(id="apply")
	private WebElement apply;
	
	public WebElement apply()
	{
		return apply;
	}
	
	
	//button[text()='Update']
	@FindBy(xpath="//button[text()='Update']")
	private WebElement updateBtn;
	
	public WebElement updateBtn()
	{
		return updateBtn;
	}

	@FindBy(xpath="//button[text()=' Search']")
	private WebElement searchBtn;
	
	public WebElement searchBtn()
	{
		return searchBtn;
	}
	
	
	//button[text()=' Reset']
	@FindBy(xpath="//button[contains(text(),'Reset')]")
	private WebElement resetBtn;
	
	public WebElement resetBtn()
	{
		return resetBtn;
	}
	
	//span[text()='Next']
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextBtn;
	
	public WebElement nextBtn()
	{
		return nextBtn;
	}
	
	////button[text()='Add']
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancelBtn;
	
	public WebElement cancelBtn()
	{
		return cancelBtn;
	}
	
	@FindBy (xpath ="//input[contains(@placeholder,'Search')]")
	private WebElement search;
	public WebElement search()
	{
		return search;
	}
	
	@FindBy (xpath ="//input[@placeholder='Search by Country Name....']")
	private WebElement searchField;
	public WebElement searchField()
	{
		return searchField;
	}
	
	@FindBy (xpath ="//input[contains(@placeholder,'Search')]")
	private WebElement billSearchField;
	public WebElement billSearchField()
	{
		return billSearchField;
	}
	
//	@FindBy (id="searchInput")
//	private WebElement search;
//	public WebElement search()
//	{
//		return search;
//	}	
	
	@FindBy (id="filterButton")
	private WebElement filterButton;
	public WebElement filterButton()
	{
		return filterButton;
	}
	
	@FindBy (xpath="//button[contains(text(),'Filter ')]")
	private WebElement filter;
	public WebElement filter()
	{
		return filter;
	}
	
	
	
//	@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
	//div[@class='Toastify__toast-body']/div[2]
	@FindBy(xpath = "//div[@class='Toastify__toast-body']/div")
	//@FindBy(xpath = "//div[@class='Toastify__toast-body']/div[text()]")
	private WebElement toastifyMsg;
	public WebElement toastifyMsg() 
	{
		return toastifyMsg;
	}
	
	@FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--light']")
	private WebElement toastifyCloseBtn;
	public WebElement toastifyCloseBtn()
	{
		return toastifyCloseBtn;
	}
	
	@FindBy(xpath = "//*[text()='Close']")
	private WebElement closeBtn;
	public WebElement closeBtn()
	{
		return closeBtn;
	}

}
