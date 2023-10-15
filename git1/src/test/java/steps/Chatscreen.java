package steps;

import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import page.DPChatScreen;

import java.io.IOException;
public class Chatscreen {

    AndroidDriver driver;
    BaseTest basetest;
    DPChatScreen dpChatScreen;

    public Chatscreen() {
        this.driver =BackGround.getDriver();
        dpChatScreen = new DPChatScreen(driver);
    }

    @Then("^click on chat$")
    public void clickOnChat() {
        dpChatScreen.clickonchat();
    }

    @Then("^check chat screen is open or not$")
    public void checkChatScreenIsOpenOrNot() throws IOException {
       dpChatScreen.chatscreen();
    }

    @Then("^check all the chats are able to see$")
    public void checkAllTheChatsAreAbleToSee() {
        dpChatScreen.selectchat();
    }

    @Then("^select any one chat in the list$")
    public void selectAnyOneChatInTheList() {
          dpChatScreen.selectchat();
    }

    @Then("^click on chat bar$")
    public void clickOnChatBar() {
        dpChatScreen.clickonchatbar();
    }

    @Then("^click on search tab and enter patient name$")
    public void clickOnSearchTabAndEnterPatientName() throws IOException {
        dpChatScreen.clickonsearch();
    }
//
//    @Then("^send pdf and image file$")
//    public void sendPdfAndImageFile() {
//
//    }

    @Then("^click on send icon$")
    public void clickOnSendIcon() {
        dpChatScreen.clickonsend();
    }

    @Then("^click on settings icon$")
    public void clickOnSettingsIcon() {
       dpChatScreen.clickonsetting();
    }

    @Then("^enable radio button$")
    public void enableRadioButton() {
        dpChatScreen.clickonradiobutton();
    }

//    @Then("^enter before and after appointment time$")
//    public void enterBeforeAndAfterAppointmentTime() {
//        dpChatScreen.clickonradiobutton();
//    }

    @Then("^click on the submit button$")
    public void clickOnTheSubmitButton() {
        dpChatScreen.clickonsubmit();
    }

    @Then("^disable radio button$")
    public void disableRadioButton() {
        dpChatScreen.disableradiobutton();
    }

    @Then("^send pdf and image file$")
    public void sendPdfAndImageFile() {
    }
}
