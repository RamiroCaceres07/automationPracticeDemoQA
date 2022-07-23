@QaToolsText

 Feature: Test QaTools.com

    Background: Go to page
      Given I navigate to QaTools.com
      When Scroll Web

   @WebTables
   Scenario: As Test Automation, I test Web Tables on Elements

     And Click on Elements
     When Scroll Web
     And Click on Web Tables
     When Scroll Web
     And Click on Add button
     When Enter Ramiro first name
     And Enter Cáceres last name
     When Enter ramirocaba07@gmail.com email
     And Enter 18 age
     When Enter 1999 salary
     And Enter departament departament
     When Click on Summit
     Then Check if the info add on the table

   @TextBox
    Scenario Outline: As Tester Automation, I test TextBox funcionality on Elements
      And Click on Elements
      When Click on TextBox button
      And Enter <name> fullname
      And Enter <email> email
      And Enter <currentAddress> current address
      And Enter <permanentAddress> permanent address
      When Scroll Web
      And Click in Sumbit and check information
      Then Check is displayed

      Examples:
     |name|email|currentAddress|permanentAddress|
     |123|asdafdss@gmail.com|13212|123123|
     |Ramiro|ramirocaba07@gmail.com|dsadasd|dsadasd|
     |12312 |ramirocaba07@gmail.com|2131223|321312 |
     |123123|12321fdsf3@dsada.com    |12321312|12312312|

 @RadioButton
 Scenario: As Test Automation, I test Radio Button funcionality on Elements
   When Click on Elements
   And Click on Radio Button
   When Click on yes selector
   And Scroll Web
   Then Check is yes is selected
   And Click on impressive
   Then Check is impressive is selected

@Buttons
   Scenario: As Test Automation, I test Buttons funcionality on Elements
  When Click on Elements
  And Scroll Web
  And Click on Buttons
  When Double click
  And Right click
  When Scroll Web
  And Simple click
  Then Check if its done

@UploadAndDownload
    Scenario: As Test Automation, I test Upload and Download funcionality on Elements
  And Click on Elements
  When Scroll Web
  And Scroll Web
  And Click on Upload and Download
  When Upload file


@Forms
    Scenario Outline: As Test Automation, I Practice Forms funcionality on Forms
  When Scroll Web
  And Click on Forms
  When Click on Practice From
  And Enter <name> first name
  And Enter <lastName> last name
  And Enter <email> email
  When Select gender
  And Write <userNumber> user number
  When Write <dateOfBirth> date of brith
  And Write <subjects> subjects
  When Scroll Web
  And Select hobbies
  When Upload file form
  And Write <currentAddress> current address
  And Scroll Web
  When Select state
  And Select city
  Then Click on Sumbit



    Examples:
  |name|lastName|email|userNumber|dateOfBirth|subjects|currentAddress|
  |Ramiro|Caceres|ramirocaba99@gmail.com|0932131|20 nov 1999|Hindi|ddsadasd|

@BrowserWindows
Scenario: As Test Automation, I test Browser Windows on Alerts, Frame and Windows
  And Click on Alerts, Frame and Windows
  When Click on Browser Windows
  And Click on New Tab and switch to tab
  When Close New Tab
  And Click on New Window and switch to tab
  When Close New Window
  And Click on New Window Message and switch to tab
  When Close New Window Message

@Alerts
Scenario Outline: As Test Automation, I test Alerts on Alerts, Frame and Windows
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
  Scenario: As Test Automation, I test iFrame funcionality on Alerts, Frame and Windows.

    And Click on Alerts, Frame and Windows
    And Click on Frames
    When Switch to 1 Frame

@Accordian
  Scenario: As Test Automation, I test Ccoordian funcionality on Widgets.

  When Scroll Web
  And Click on Widgets
  When Click on Accordian
  And Click on What is Lorem Ipsum
  When Click on Where does it come from
  And Scroll Web
  When Click on Why do we use it

@AutoComplete
  Scenario Outline: As Test Automation, I test AutoComplete funcionality on Widgets

  When Scroll Web
  And Click on Widgets
  When Click on Auto Complete
  And Write colors on Type Multiple color names and press Enter
  And Write <color> on Type single color name and press Enter

  Examples:
    |color|
    |Black|

@DataPicker
  Scenario: As Test Automation, I test Data Picker funcionality on Widgets
  When Scroll Web
  And Click on Widgets
  When Click on Data Picker
  And Click on Select Date
  When Complete select date entering 2000 year, April month and day
  And Click on Date and Time
  When Complete Date and Time camp entering year, month, day and hour
  Then Check that info enter be correct

@Slider
  Scenario: As Test Automation, I test Slider funcionality on Widgets
  When Scroll Web
  And Click on Widgets
  When Click on Slider
  And Click and Press on Slider 150 and 0







