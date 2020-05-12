import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {
    WebDriver driver;



    By comboVersion         =   By.id("switch-version-select");
    By btnAdd               =   By.xpath("//div[@class='floatL t5']//a[@href='/demo/bootstrap_theme_v4/add']");
    By customerName         =   By.id("field-customerName");
    By lastname             =   By.id("field-contactLastName");
    By contactFirst         =   By.id("field-contactFirstName");
    By fieldphone           =   By.id("field-phone");
    By addressline1         =   By.id("field-addressLine1");
    By addressline2         =   By.id("field-addressLine2");
    By city                 =   By.id("field-city");
    By state                =    By.id("field-state");
    By postalCode           =   By.id("field-postalCode");
    By country              =   By.id("field-country");
    By ComboEmployer        =  By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/a/span");
    By employoption         =  By.cssSelector(".chosen-search > input");
    By optionSelected       =  By.cssSelector(".active-result");
    By credit               =   By.id("field-creditLimit");
    By btnSave              =   By.id("form-button-save");
    By msgSuccess           =   By.xpath("//div[@id='report-success']//p");
    By linkGoback           =   By.linkText("Go back to list");
    By sarchname            =   By.name("customerName");
    By chkActionAll         =   By.className("select-all-none");
    By tableReg             =   By.xpath("//table//tr");
    By btnDelete            =   By.xpath("//div[@class='floatL']//a[@Title='Delete']");
    By msgDeletePopUp       =   By.className("alert-delete-multiple-one");
    By btnDeletePopUp       =   By.xpath("//button[@class='btn btn-danger delete-multiple-confirmation-button']");
    By msgDeleteSucess      =   By.xpath("//span[@data-growl='message']//p");

    public CadastroPage(WebDriver driver){

        this.driver = driver;

    }
    public void setComboVersion(String version){
        new Select(driver.findElement(comboVersion)).selectByValue(version);

    }

    public void getBtnADD(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(btnAdd));
        driver.findElement(btnAdd).click();

    }
    public void setCustomerName(String name){
        driver.findElement(customerName).sendKeys(name);

    }

    public void setLastName(String lastname){
        driver.findElement(customerName).sendKeys(lastname);

    }

    public void setContactFirst(String contact){
        driver.findElement(contactFirst).sendKeys(contact);

    }

    public void setFieldPhone(String phone){
        driver.findElement(fieldphone).sendKeys(phone);

    }
    public void setAddressLine1(String address1){
        driver.findElement(addressline1).sendKeys(address1);

    }
    public void setAddressLine2(String address2){
        driver.findElement(addressline2).sendKeys(address2);

    }
    public void setCity(String valueCity){
        driver.findElement(city).sendKeys(valueCity);

    }
    public void setState(String valueState){
        driver.findElement(state).sendKeys(valueState);

    }
    public void setPostalCode(String valuePostalCode){
        driver.findElement(postalCode).sendKeys(valuePostalCode);

    }
    public void setCountry(String valueCountry){
        driver.findElement(country).sendKeys(valueCountry);

    }
    public void getComboEmployer(){
        driver.findElement(ComboEmployer).click();

    }
    public void setOption(String option){
        driver.findElement(employoption).sendKeys(option);

    }
    public void getOption(){
        driver.findElement(optionSelected).click();

    }
    public void setCredit(String valueCredit){
        driver.findElement(credit).sendKeys(valueCredit);

    }
    public void getBtnSave(){
        driver.findElement(btnSave).click();

    }
    public String getMsgSucesso(){
        WebDriverWait loading = new WebDriverWait(driver, 60);
        WebElement sucess =loading.until(ExpectedConditions.visibilityOfElementLocated(msgSuccess));
       return sucess.getText();
    }
    public void getlinkGoBack(){
        driver.findElement(linkGoback).click();

    }
    public void setSearchName(String valueSearch){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(sarchname));
        driver.findElement(sarchname).sendKeys(valueSearch);

    }
    public void getChkAll(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(chkActionAll));
        driver.findElement(chkActionAll).click();

    }
    public int getTableSize(){

        return driver.findElements(tableReg).size();

    }
    public void getBtnDelete(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnDelete)).click();
    }
    public String getMsgDeletePopUp(){
        WebDriverWait loading = new WebDriverWait(driver, 60);
        WebElement sucess =loading.until(ExpectedConditions.visibilityOfElementLocated(msgDeletePopUp));
        return sucess.getText();
    }
    public void getBtnDeletePOpUp(){
        driver.findElement(btnDeletePopUp).click();
    }
    public String getMsgDeleteAlert(){
        return driver.findElement(msgDeleteSucess).getText();
    }




}
