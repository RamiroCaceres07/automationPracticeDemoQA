package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.QaDemoPage;

import static java.lang.Thread.sleep;

public class QaToolsSteps {

    QaDemoPage qaDemoPage = new QaDemoPage();

//@WEB TABLES//
    @Given("^I navigate to QaTools.com$")
    public void navigateToQaTools(){
        qaDemoPage.navigateToQaTools();
    }


    @And("^Click on Elements$")
    public void clickOnElements() throws InterruptedException {
        qaDemoPage.clickOnElementsButton();
        Thread.sleep(1000);
    }

    @And("^Click on Web Tables$")
    public void clickOnWebTables(){
        qaDemoPage.clickOnWebTablesButton();
    }


    @And("^Click on Add button$")
    public void clickOnAddButton(){
        qaDemoPage.clickOnAddWebTables();
    }

    @When("^Enter (.+) first name$")
    public void writeFirstName(String firstName){
        qaDemoPage.writeName(firstName);
    }

    @And("^Enter (.+) last name$")
    public void writeLastName(String lastName){
        qaDemoPage.writeLastName(lastName);
    }

    @When("^Enter (.+) email$")
    public void writeEmail(String email){
        qaDemoPage.writeEmail(email);
    }

    @And("^Enter (.+) age$")
    public void writeAge(String age){
        qaDemoPage.writeAge(age);
    }

    @When("^Enter (.+) salary$")
    public void writeSalary(String salary){
        qaDemoPage.writeSalary(salary);
    }

    @And("^Enter (.+) departament$")
    public void writeDepartament(String departament){
        qaDemoPage.writeDepartament(departament);
    }

    @When("^Click on Summit$")
    public void clickOnSummit(){
        qaDemoPage.clickOnSumbit();
    }

    @Then("^Check if the info add on the table$")
    public void checkOfAddOnTable(){
        Assert.assertTrue("no", qaDemoPage.isDisplayedTableRaw4());
    }

    //@TEXT BOX//

    @When("^Click on TextBox button$")
    public void clickOnTextBoxButton(){
        qaDemoPage.clickOnTextBox();
    }

    @And("^Enter (.+) fullname$")
    public void writeFullName(String name){
        qaDemoPage.writeFullName(name);
    }


    @And("^Enter (.+) current address$")
    public void writeCurrentAddress(String currentAddress){
        qaDemoPage.writeCurrentAddress(currentAddress);
    }

    @And("^Enter (.+) permanent address$")
    public void writePermanentAddress(String permanentAddress){
        qaDemoPage.writePermanentAddress(permanentAddress);
    }

    @And("^Click on Sumbit and check information$")
    public void clickOnSumbit() throws InterruptedException {
        sleep(1000);
        qaDemoPage.clickOnSumbit();
    }

    @Then("^Check is displayed$")
    public void checkIsDisplayed(){
        Assert.assertTrue("No aparece", qaDemoPage.isDisplayedList());
    }

//@RADIO BUTTON

    @And("^Click on Radio Button$")
    public void clickOnRadioButton() throws InterruptedException {
        Thread.sleep(1000);
        qaDemoPage.clickOnRadioButton();
    }

    @When("^Click on yes selector$")
    public void yesOnRadioButton(){
        qaDemoPage.clickOnYesInRadioButton();
    }

    @Then("^Check is yes is selected$")
    public void checkOfYesIsSelected(){
        String getText = qaDemoPage.getTextFromButtonYesOrImpressive();

        Assert.assertEquals("You have selected Yes", getText);
    }

    @And("^Click on impressive$")
    public void clickOnImpressive(){
        qaDemoPage.clickOnImpressiveInRadioButton();
    }

    @Then("^Check is impressive is selected$")
    public void checkOfImpressiveIsSelected(){
        String getText = qaDemoPage.getTextFromButtonYesOrImpressive();

        Assert.assertEquals("You have selected Impressive", getText);
    }

//@BUTTONS

    @And("^Click on Buttons$")
public void clickOButton()  {
    qaDemoPage.clickOnButtonButton();
}

    @When("^Double click$")
    public void doubleClick() throws InterruptedException {
        Thread.sleep(500);
        qaDemoPage.doubleClickOnButton();
    }

    @And("^Right click$")
    public void rightClick() {
        qaDemoPage.rightClickOnButton();
    }


    @And("^Simple click$")
    public void simpleClick() {
       qaDemoPage.simpleClickOnButton();
    }


    @Then("^Check if its done$")
    public void checkItsDone() {
        Assert.assertTrue("Double click no anda", qaDemoPage.isDisplayedDoubleClick());
        Assert.assertTrue("Right click no anda", qaDemoPage.isDisplayedRightClick());
        Assert.assertTrue("Simple click no anda", qaDemoPage.isDisplayedSimpleClick());
    }


//@UploadAndDownload

    @When("^Scroll Web$")
    public void scroll350(){
        qaDemoPage.scrollWindow();
    }

    @And("^Click on Upload and Download$")
    public void clickOnUploadAndDownload(){
        qaDemoPage.clickOnUploadAndDownload();
    }

    @When("^Upload file$")
    public void uploadFile(){
        qaDemoPage.uploadFile();
    }

//@Forms


    @And("^Click on Forms$")
    public void clickOnForms(){
        qaDemoPage.clickOnForms();
    }

    @When("^Click on Practice From$")
    public void clickOnPracticeFrom(){
        qaDemoPage.clickOnPracticeForm();
    }

    @When("^Select gender$")
    public void selectGender(){
        qaDemoPage.clickOnGenderMale();
    }

    @And("^Write (.+) user number$")
    public void writeUserNumber(String userNumber){
        qaDemoPage.writeUserNumber(userNumber);
    }

    @When("^Write (.+) date of brith$")
    public void writeDateOfBrith(String dateOfBirth){

        qaDemoPage.writeDateOfBrith(dateOfBirth);
        qaDemoPage.writeEnterBirth();
    }

    @And("^Write (.+) subjects$")
    public void writeSubjects(String subjects) throws InterruptedException {
        Thread.sleep(1000);
        qaDemoPage.writeSubjects(subjects);
        qaDemoPage.writeEnterSubject();

    }


    @And("^Select hobbies$")
    public void clickOnHobbiesSports(){
        qaDemoPage.clickOnHobbiesSport();
    }

    @When("^Upload file form$")
    public void uploadPicture(){
        qaDemoPage.uploadPicture();
    }

    @And("^Write (.+) current address$")
    public void writeCurrentAddressForm(String currentAddress){
        qaDemoPage.writeCurrentAddress(currentAddress);
    }

    @When("^Select state$")
    public void writeState() throws InterruptedException {
        Thread.sleep(1000);
        qaDemoPage.clickOnState();
        qaDemoPage.clickOnSelectState();


    }

    @And("^Select city$")
    public void writeCity(){
        qaDemoPage.clickOnCity();
        qaDemoPage.clickOnSelectCity();
    }

    @Then("^Click on Sumbit$")
    public void clickOnSumbitt(){
        qaDemoPage.clickOnSumbit();
    }


//BROWSER WINDOW


    @And("^Click on Alerts, Frame and Windows$")
    public void clickOnAlertsFrameAndWindow(){
        qaDemoPage.clickOnAlertsFrameAndWindow();
    }

    @When("^Click on Browser Windows$")
    public void clickOnBrowserWindow(){
        qaDemoPage.clickOnBrowserWindow();
    }

    @And("^Click on New Tab and switch to tab$")
    public void clickOnNewTab(){
        qaDemoPage.clickOnNewTab();
        qaDemoPage.switchToTab(1);
    }

    @When("^Close New Tab$")
    public void closeTab(){
        qaDemoPage.closeTabAndWindow();
        qaDemoPage.switchToTab(0);
    }

    @And("^Click on New Window and switch to tab$")
    public void clickOnNewWindow(){
        qaDemoPage.clickOnNewWindow();
        qaDemoPage.switchToTab(1);
    }

    @When("^Close New Window$")
    public void closeNewWindow(){
        qaDemoPage.closeTabAndWindow();
        qaDemoPage.switchToTab(0);
    }

    @And("^Click on New Window Message and switch to tab$")
    public void clickOnNewWindowMessage(){
        qaDemoPage.clickOnNewWindowMessage();
        qaDemoPage.switchToTab(1);
    }

    @When("^Close New Window Message$")
    public void closeNewWindowMessage(){
        qaDemoPage.closeTabAndWindow();
        qaDemoPage.switchToTab(0);
    }


//ALERTS


    @And("^Click on Alerts$")
    public void clickOnAlertsButton(){
        qaDemoPage.clickOnAlertButton();
    }

    @When("^Click button to see alert$")
    public void clickOnButtonToSeeAlert(){
        qaDemoPage.clickOnToSeeAlert();
    }

    @And("^Switch to alert and dismiss alert$")
    public void switchToAlertAndDismissAlert(){
        qaDemoPage.acceptAlert();
    }

    @When("^Click on button alert will appear after 5 seconds$")
    public void clickOnAlertButtonWillApearAfter5Seconds(){
        qaDemoPage.clickOnButtonAppearAfter5Seconds();
    }

    @And("^Switch and dismiss alert will appear after 5 seconds$")
    public void switchAndDismissAlertWillAppearAfter5Seconds() throws InterruptedException {
        Thread.sleep(5500);
        qaDemoPage.acceptAlert();
    }

    @When("^Click on confirm box will appear$")
    public void clickOnConfirmBoxWillAppear(){
        qaDemoPage.clickOnButtonConfirmWillAppear();
    }

    @And("^Confirm box will appear$")
    public void confirmBoxWillAppear(){
        qaDemoPage.acceptAlert();
    }

    @When("^Click on prompt box$")
    public void clickOnPromptBox(){
        qaDemoPage.clickOnButtonPromptWillAppear();
    }

    @Then("^Enter (.+) text and accept box$")
    public void enterTextAndAcceptBox(String text){
        qaDemoPage.writeAlertAndAccept(text);
    }


//@FRAME

    @And("^Click on Frames$")
    public void clickOnFrameButton(){
        qaDemoPage.clickOnFramesButton();
    }

    @When("^Switch to 1 Frame$")
    public void switchTo1Frame(){
        qaDemoPage.switchToiFrame();
    }

//@WidgetsAccordian

    @And("^Click on Widgets$")
    public void clickOnWidgets() {
        qaDemoPage.clickOnWidgetsButton();
    }

    @When("^Click on Accordian$")
    public void clickOnAccordian(){
        qaDemoPage.clickOnAccordian();
    }

    @And("^Click on What is Lorem Ipsum$")
    public void clickOnWhatInLoremIpsum()  {
        qaDemoPage.clickOnWhatIsLoremIpsum();
    }

    @When("^Click on Where does it come from$")
    public void clickOnWhereDoesItComeFrom(){
        qaDemoPage.clickOnWhereDoesItComeFrom();
    }

    @When("^Click on Why do we use it$")
    public void clickOnWhyDoWeUseIt() throws InterruptedException {
        qaDemoPage.clickOnWhyDoUseIt();
    }

//@WidgetsAutoComplete

    @When("^Click on Auto Complete$")
    public void clickOnAutoComplete(){
        qaDemoPage.clickOnAutoCompleteButton();
    }

    @And("^Write colors on Type Multiple color names and press Enter$")
    public void writeColorOnTypeMultipleColorNameAndPressEnter() throws Exception  {
        qaDemoPage.clickOnTypeMultiplesColors();
        Thread.sleep(1000);
        qaDemoPage.typeMultipleColor("Black");
        qaDemoPage.pressEnterOnMultipleColor();
        qaDemoPage.typeMultipleColor("White");
        qaDemoPage.pressEnterOnMultipleColor();
    }

    @And("^Write (.+) on Type single color name and press Enter$")
    public void writeColorOnTypeSingleColorAndPressEnter(String color)  {
        qaDemoPage.typeSingleColor(color);
        qaDemoPage.pressEnterOnSingleColor();
    }



}
