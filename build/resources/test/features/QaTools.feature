@QaToolsText

 Feature: Test QaTools.com

    Background: Go to page
      Given I navigate to QaTools.com
      When Scroll Window
      And Click on Elements
      When Scroll to Web Tables
      When Scroll Web 350


   @TextBox
    Scenario Outline: As Tester Engineer, i test TextBox funcionality
      When Click on TextBox button
      And Enter <name> fullname
      And Enter <email> email
      And Enter <currentAddress> current address
      And Enter <permanentAddress> permanent address
      When Scroll Web
      And Click on Sumbit and check information
      Then Check is displayed

      Examples:
     |name|email|currentAddress|permanentAddress|
     |123|asdafdss@gmail.com|13212|123123|
     |Ramiro|ramirocaba07@gmail.com|dsadasd|dsadasd|
     |12312 |ramirocaba07@gmail.com|2131223|321312 |
     |123123|12321fdsf3@dsada.com    |12321312|12312312|

 @RadioButton
 Scenario: As Test Engineer, test radio button funcionality
   And Click on Radio Button
   When Click on yes selector
   Then Check is yes is selected
   And Click on impressive
   Then Check is impressive is selected

 @WebTables
Scenario: As Test Engineer, test web tables

  And Click on Web Tables
  When Scroll to Add
  And Click on Add button
  When Enter First Name
  And Enter Last Name
  When Enter email
  And Enter age
  When Enter salary
  And Enter departament
  When Click on Summit
  Then Check if the info add on the table

@Buttons
   Scenario: As Test Engineer, test button funcionality
  And Click on Buttons
  When Double click
  And Right click
  When Scroll
  And Simple click
  Then Check if its done

@UploadAndDownload
    Scenario: As Test Engineer, test upload and download funcionality
  When Scroll Web 350
  And Click on Upload and Download
  When Upload file


@Forms
    Scenario Outline: As Test Engineer, test dynamic properties funcionality

  When Scroll WebMas
  And Click on Forms
  When Click on Practice From
  And Enter <name> name
  And Enter <lastName> lastname
  And Enter <email> emaill
  When Select gender
  And Write <userNumber> user number
  When Write <dateOfBirth> date of brith
  And Write <subjects> subjects
  When ScrollWeb
  And Select hobbies
  When Upload file form
  And Write <currentAddress> current address
  When Select state
  And Select city
  Then Click on Sumbit



    Examples:
  |name|lastName|email|userNumber|dateOfBirth|subjects|currentAddress|
  |Ramiro|Caceres|ramirocaba99@gmail.com|0932131|20 nov 1999|Hindi|ddsadasd|


@BrowserWindows
Scenario: As Test Engineer, im test windows with selenium

  And Click on Alerts, Frame and Windows
  When Click on Browser Windows
  And Click on New Tab and switch to tab
  When Close New Tab
  And Click on New Window and switch to tab
  When Close New Window
  And Click on New Window Message and switch to tab
  When Close New Window Message

@Alerts
Scenario Outline: As Test Engineer, test alerts with selenium

  And Click on Alerts, Frame and Windows
  And Click on Alerts
  When Click button to see alert
  And Switch to alert and dismiss alert
  When Click on button alert will appear after 5 seconds
  And Switch and dismiss alert will appear after 5 seconds
  When Click on confirm box will appear
  And Confirm box will appear
  When Click on prompt box
  Then Enter <text> text and accept box

  Examples:
  |text|
  |Ramiro|
  |Bianca|

@iFrame

  Scenario: As Test Engineer, test iframe funcionality

    And Click on Alerts, Frame and Windows
    And Click on Frames
    When Switch to 1 Frame


@Accordian

  Scenario: As Test Engineer, test acoordian funcionality

  And Click on Widgets
  When Click on Accordian
  And Click on What is Lorem Ipsum
  When Click on Where does it come from
  And Scroll Web
  When Click on Why do we use it

@AutoComplete

  Scenario Outline: As Test Engineer, test AutoComplete funcionality

  And Click on Widgets
  When Click on Auto Complete
  And Write colors on Type Multiple color names and press Enter
  And Write <color> on Type single color name and press Enter

  Examples:
    |color|
    |Black|


