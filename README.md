# FishingBooker QA Project

Automated UI tests for the FishingBooker site, built from scratch using Java, Selenium, and Junit.
These tests focus on the charter card functionality

---
## 🚀 Tech Stack
- Java 17
- Selenium
- JUnit 
- Maven
- ChromeDriver
---
## Project Structure
The project follows a clean Page Object Model (POM) architecture with clear separation of concerns:

## base

● Contains shared logic such as BasePage, handles common setup and teardown

## pages

● Contains one class per UI page (e.g., MainPage, TexasFishingCharterPage), each page class encapsulates its elements and user actions

## tests

● Contains all @Test classes (e.g., TexasCharterTest) 

## constants 

● Contains one class EndPoints that is helping with Url's 

---

## Allure Report Instructions

After running the tests, you can generate and view a full-featured test report using Allure.

You will need to install Allure.

For macOS (with Homebrew):
```
brew install allure
```
For Windows (Make sure Node.js is installed):
```
npm install -g allure
```
Generate report:
```
allure serve target/allure-results
```
---
## Task

## Sitemap page:

● Na ovoj strani naći ćeš spisak svih destinacijskih stranica.

● Iz sekcije Top Fishing Destinations, mozeš izabrati bilo koju destinaciju.

● Klikni na link.

## Destination page:

● Sačekaj da se prikaže lista čartera (najmanje 10 kartica).

● Elementi koje je potrebno proveriti za prvu charter karticu:

  ○ Naziv čartera (link/text),
  
  ○ Informacija o dužini broda,
  
  ○ Max broj ljudi (up to X people),
  
  ○ Cena (“Trips from ...”),
  
  ○ Tooltip info - Hover na tooltip wishlist prikazuje očekivan info (Add listing to
    wishlist)
    
  ○ “See availability” button
  
● Klikni na “Sort by Price (Lowest)” filter.

● Pokupi cene za sve kartice i proveri da su cene sortirane rastuće.

● Klikni na Sort by Price filter.

● Izaberi Price (Highest) iz padajućeg menija.

● Klikni na Apply button.

● Ponovi proveru da su cene sada sortirane opadajuće.

---
## Author 

Stefan Mitrović
