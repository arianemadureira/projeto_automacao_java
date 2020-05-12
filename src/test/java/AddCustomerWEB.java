import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomerWEB {

    public static WebDriver obj = new ChromeDriver();
    CadastroPage cadastropage = new CadastroPage(obj);

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\test_sicredi\\chromedriver.exe");
        obj.get("https://www.grocerycrud.com/demo/bootstrap_theme");
    }

    @AfterClass
    public static void tearDownTest() {
        obj.close();
    }

    @Test
    public void DESAFIO1_AddCustomerValid(){

        cadastropage.setComboVersion("bootstrap_theme_v4");
        cadastropage.getBtnADD();
        cadastropage.setCustomerName("Teste Sicredi");
        cadastropage.setLastName("Teste");
        cadastropage.setContactFirst("Ariane Madureira");
        cadastropage.setFieldPhone("51 9999-9999");
       cadastropage.setAddressLine1("Av Assis Brasil, 3970");
       cadastropage.setAddressLine2("Torre D");
       cadastropage.setCity("Porto Alegre");
       cadastropage.setState("RS");
       cadastropage.setPostalCode("91000-000");
       cadastropage.setCountry("Brasil");
        cadastropage.getComboEmployer();
        cadastropage.setOption("Thompson");
        cadastropage.getOption();
        cadastropage.setCredit("200");
        cadastropage.getBtnSave();
        Assert.assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list",cadastropage.getMsgSucesso());
    }
    @Test
    public void DESAFIO2_RemoveCustomerValid(){
        cadastropage.getlinkGoBack();
        cadastropage.setSearchName("Teste sicredi");
       // cadastropage.getChkAll();

        if (cadastropage.getTableSize() == 3){
            cadastropage.getChkAll();
            cadastropage.getBtnDelete();
            Assert.assertEquals("Are you sure that you want to delete this 1 item?", cadastropage.getMsgDeletePopUp());
           cadastropage.getBtnDeletePOpUp();
           Assert.assertEquals("Your data has been successfully deleted from the database.",cadastropage.getMsgDeleteAlert());


        }

    }

}