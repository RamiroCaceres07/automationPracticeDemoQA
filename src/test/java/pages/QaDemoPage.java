package pages;

public class QaDemoPage extends BasePage{

    public QaDemoPage(){super(driver);}

    //Locators

    //Buttons locators
    private String elementsLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]";
    private String textBoxLocator="//span[contains(text(),'Text Box')]";
    private String radioButtonLocator = "//span[contains(text(),'Radio Button')]";
    private String webTablesLocator = "//span[contains(text(),'Web Tables')]";
    private String buttonButtonLocator = "//span[contains(text(),'Buttons')]";
    private String doubleClickOnButtonLocator = "//button[@id='doubleClickBtn']";
    private String rightClickOnButtonLocator = "//button[@id='rightClickBtn']";
    private String simpleClickOnButtonLocator = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]";
    private String yesSelectorInRadioButtonLocator = "//label[contains(text(),'Yes')]";
    private String impressiveSelectorInRadioButtonLocator = "//label[contains(text(),'Impressive')]";
    private String sumbitLocator = "//button[@id='submit']";
    private String clickOnAddLocator = "//button[@id='addNewRecordButton']";
    private String uploadAndDownloadLocator = "//span[contains(text(),'Upload and Download')]";
    private String uploadFileLocator = "//input[@id='uploadFile']";
    private String formsButtonLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[2]/div[2]/*[1]";
    private String practiceFromButtonLocator = "//span[contains(text(),'Practice Form')]";
    private String genderMaleLocator = "//label[contains(text(),'Male')]";
    private String hobbiesSportLocator = "//label[contains(text(),'Sports')]";
    private String uploadPictureLocator = "//input[@id='uploadPicture']";
    private String clickStateLocator = "//div[contains(text(),'Haryana')]";
    private String clickCityLocator = "//div[contains(text(),'Karnal')]";

    //ALERTS, FRAME AND WINDOWS - BROWSER WINDOWS
    private String alertsFrameAndWindowLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]";
    private String browserWindowLocator = "//span[contains(text(),'Browser Windows')]";
    private String newTabLocator = "//button[@id='tabButton']";
    private String newWindowLocator = "//button[@id='windowButton']";
    private String newWindowMessageLocator = "//button[@id='messageWindowButton']";

    //ALERTS, FRAME AND WINDOWS - ALERTS
    private String alertButton = "//span[contains(text(),'Alerts')]";
    private String buttonToSeeAlert = "//button[@id='alertButton']";
    private String buttonAppearAfter5Seconds = "//button[@id='timerAlertButton']";
    private String buttonConfirmBoxWillAppear = "//button[@id='confirmButton']";
    private String buttonPromptBoxWillAlert = "//button[@id='promtButton']";

    //ALERTS, FRAME AND WINDOWS - FRAME
    private String frameButton = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/span[1]";
    private String iFrame1byID = "frame1";
    private String iFrame2byID = "//iframe[@id='frame2']";

    //WIDGETS, ACCORDIAN
    private String widgetsButtonLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]";
    private String accordianButtonLocator = "//span[contains(text(),'Accordian')]";
    private String whatIsLoremIpsumButtonLocator = "//div[@id='section1Heading']";
    private String whereDoesItComeFromLocator = "//div[@id='section2Heading']";
    private String whyDoWeUseItLocator = "//div[@id='section3Heading']";

    //WIDGETS, AUTO COMPLETE
    private String autoCompleteButtonLocator = "//span[contains(text(),'Auto Complete')]";
    private String typeMultipleColorLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
    private String typeSingleColorLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";

    //Writers locators
    private String fullNameLocator = "//input[@id='userName']";
    private String firstNameLocator = "//input[@id='firstName']";
    private String lastNameLocator = "//input[@id='lastName']";
    private String emailLocator = "//input[@id='userEmail']";
    private String ageLocator = "//input[@id='age']";
    private String salaryLocator = "//input[@id='salary']";
    private String departamentLocator = "//input[@id='department']";
    private String currentAddressLocator = "//textarea[@id='currentAddress']";
    private String permanentAddressLocator = "//textarea[@id='permanentAddress']";
    private String userNumberLocator = "//input[@id='userNumber']";
    private String dateOfBirthLocator = "//input[@id='dateOfBirthInput']";
    private String subjectsLocator = "//input[@id='subjectsInput']";
    private String stateWriteLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]";
    private String cityWriteLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[2]/div[1]/*[1]";

    //Checkers locators
    private String raw4Locator = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]";
    private String isDiplayedLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]";
    private String getTextYesOrImpressiveLocator = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/p[1]";
    private String tableLocatorWebTables = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]";
    private String checkDoubleClickLocator = "//p[@id='doubleClickMessage']";
    private String checkRightClickLocator = "//p[@id='rightClickMessage']";
    private String checkSimpleClickLocator =   "//p[@id='dynamicClickMessage']";

    //Driver Methods

    public void navigateToQaTools(){
        navigateTo("https://demoqa.com/");
    }

    public void switchToTab(int numTab) {swtichToTabByIndex(numTab);}

    public void closeTabAndWindow(){closeTabAndWindowDriver();}

    public void scrollWindow(){
        scrollWeb();
    }

    public void scrollWindow350(){scrollWeb350();}

    public void acceptAlert(){aceptAlert();};

    public void writeAlertAndAccept(String textWrite){sendKeysAndAccept(textWrite);}

    public void switchToiFrame(){switchToFrame(iFrame1byID);}

    //ClickOn Methods
    public void clickOnElementsButton(){
        clickElement(elementsLocator);
    }

    public void clickOnTextBox(){
        clickElement(textBoxLocator);
    }

    public void clickOnRadioButton(){
        clickElement(radioButtonLocator);
    }

    public void clickOnWebTablesButton(){clickElement(webTablesLocator);}

    public void clickOnAddWebTables(){clickElement(clickOnAddLocator);}

    public void clickOnYesInRadioButton(){
        clickElement(yesSelectorInRadioButtonLocator);
    }

    public void clickOnImpressiveInRadioButton(){
        clickElement(impressiveSelectorInRadioButtonLocator);
    }

    public void clickOnSumbit(){
        clickElement(sumbitLocator);
    }

    public void clickOnButtonButton(){clickElement(buttonButtonLocator);}

    public void doubleClickOnButton(){doubleClickElement(doubleClickOnButtonLocator);}

    public void rightClickOnButton(){rightClickElement(rightClickOnButtonLocator);}

    public void simpleClickOnButton(){clickElement(simpleClickOnButtonLocator);}

    public void clickOnUploadAndDownload(){clickElement(uploadAndDownloadLocator);}

    public void clickOnGenderMale(){clickElement(genderMaleLocator);}

    public void clickOnForms(){clickElement(formsButtonLocator);}

    public void clickOnPracticeForm(){clickElement(practiceFromButtonLocator);}

    public void uploadFile(){writeText(uploadFileLocator, "/Users/ramirocaceres/Downloads/pawel-czerwinski-oK-HLdJwJ_s-unsplash.jpg");}

    public void clickOnHobbiesSport(){clickElement(hobbiesSportLocator);}

    public void uploadPicture(){writeText(uploadPictureLocator, "/Users/ramirocaceres/Downloads/pawel-czerwinski-BP2RioglKXk-unsplash.jpg" );}

    public void clickOnState(){clickElement(stateWriteLocator);}

    public void clickOnSelectState(){clickElement(clickStateLocator);}

    public void clickOnCity(){clickElement(cityWriteLocator);}

    public void clickOnSelectCity(){clickElement(clickCityLocator);}

    public void clickOnAlertsFrameAndWindow(){clickElement(alertsFrameAndWindowLocator);}

    public void clickOnBrowserWindow(){clickElement(browserWindowLocator);}

    public void clickOnNewTab(){clickElement(newTabLocator);}

    public void clickOnNewWindow(){clickElement(newWindowLocator);}

    public void clickOnNewWindowMessage(){clickElement(newWindowMessageLocator);}

    public void clickOnAlertButton(){clickElement(alertButton);}

    public void clickOnToSeeAlert(){clickElement(buttonToSeeAlert);}

    public void clickOnButtonAppearAfter5Seconds(){clickElement(buttonAppearAfter5Seconds);}

    public void clickOnButtonConfirmWillAppear(){clickElement(buttonConfirmBoxWillAppear);}

    public void clickOnButtonPromptWillAppear(){clickElement(buttonPromptBoxWillAlert);}

    public void clickOnFramesButton(){clickElement(frameButton);}

    public void clickOnWidgetsButton(){clickElement(widgetsButtonLocator);}

    public void clickOnAccordian(){clickElement(accordianButtonLocator);}

    public void clickOnWhatIsLoremIpsum(){clickElement(whatIsLoremIpsumButtonLocator);}

    public void clickOnWhereDoesItComeFrom(){clickElement(whereDoesItComeFromLocator);}

    public void clickOnWhyDoUseIt(){clickElement(whyDoWeUseItLocator);}

    public void clickOnAutoCompleteButton(){clickElement(autoCompleteButtonLocator);}

    public void clickOnTypeMultiplesColors(){clickElement(typeMultipleColorLocator);}


    //Write Methods
    public void writeFullName(String name){
        writeText(fullNameLocator,name);
    }

    public void writeName(){
        writeText(firstNameLocator, "Ramiro" );
    }

    public void writeNameVar(String nameVar){writeText(firstNameLocator, nameVar);}

    public void writeLastName(){
        writeText(lastNameLocator, "Caceres");
    }

    public void writeLastNameVar(String lastNameVar){writeText(lastNameLocator, lastNameVar);}

    public void writeAge(){
        writeText(ageLocator, "2");
    }

    public void writeSalary(){
        writeText(salaryLocator, "22222");
    }

    public void writeDepartament(){
        writeText(departamentLocator, "mdeo");
    }

    public void writeEmailHardcode(){writeText(emailLocator, "ramiro@gmail.com");}

    public void writeEmail(String email){
        writeText(emailLocator, email);
    }

    public void writeCurrentAddress(String currentAddress){
        writeText(currentAddressLocator, currentAddress);
    }

    public void writePermanentAddress(String permanentAddress){
        writeText(permanentAddressLocator,permanentAddress);
    }

    public void writeUserNumber(String userNumber){writeText(userNumberLocator, userNumber);}

    public void writeDateOfBrith(String dateOfBirth){writeText(dateOfBirthLocator, dateOfBirth);}

    public void writeSubjects(String subjects){writeText(subjectsLocator, subjects);}

    public void writeEnterBirth(){writeEnter(dateOfBirthLocator);}

    public void writeEnterSubject(){writeEnter(subjectsLocator);}

    public void typeMultipleColor(String colors){writeText(typeMultipleColorLocator, colors);}

    public void pressEnterOnMultipleColor(){writeEnter(typeMultipleColorLocator);}

    public void typeSingleColor(String color){writeText(typeSingleColorLocator, color);}

    public void pressEnterOnSingleColor(){writeEnter(typeSingleColorLocator);}


    //Checkers Methods
    public Boolean isDisplayedList(){
        return elementIsDisplayed(isDiplayedLocator);
    }
    public Boolean isDisplayedTableRaw4(){return elementIsDisplayed(raw4Locator);}
    public Boolean isDisplayedDoubleClick(){return elementIsDisplayed(checkDoubleClickLocator);}
    public Boolean isDisplayedRightClick(){return elementIsDisplayed(checkRightClickLocator);}
    public Boolean isDisplayedSimpleClick(){return elementIsDisplayed(checkSimpleClickLocator);}
    public String getTextFromButtonYesOrImpressive(){
        return getTextFromElement(getTextYesOrImpressiveLocator);
    }








}
