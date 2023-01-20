package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;

public class n11StepDefinitions {
    n11Pages n11Pages = new n11Pages(DriverFactory.getAppiumDriver());

    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir(){
        n11Pages.elektronikTiklama();
    }

    @When("Telefonve Aksesuarlari Secilir")
    public void telefonveAksesuarlariSecilir() {
        n11Pages.telefonveAksesuarlariSecimi();
    }

    @When("Cep telefonu secilin")
    public void cepTelefonuSecilin() {
        n11Pages.cepTelefonuSecimi();
    }

    @When("Marka secilin")
    public void markaSecilin() {
        n11Pages.markaSecimi();
    }

    @When("Filtrelemeye tiklanin")
    public void filtrelemeyeTiklanin() {
        n11Pages.filtrelemeyeTiklama();
    }

    @When("Filtreleme yapilin")
    public void filtrelemeYapilin() {
        n11Pages.filtrelemeYapma();
    }

    @When("Sonuclarigostere tiklanin")
    public void sonuclarigostereTiklanin() {
        n11Pages.sonuclarigostereTiklama();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        n11Pages.urunSepeteEkleme();
    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {
        n11Pages.sepetimeGitme();
    }

    @Then("Sepete urunun geldigi kontrol edilir")
    public void sepeteUrununGeldigiKontrolEdilir() {
        n11Pages.sepeteUrununGeldigiKontrolEtme();
    }

}
