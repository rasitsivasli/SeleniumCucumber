@sOutline
Feature: Parameterized Feature

  Scenario Outline:  Amazon search
    Given kullanici amazon sayfasina gider
    When kullanici "<keyword>" icin arama yapar
    Then kullanici title da "<keyword>" gormelidir
    And sayfayi kapatir

    Examples:
      | keyword |
      | mac|
      | msi|
      | asus|
      | dell|
      | hp|
    # | keyword | ifadesi sütun basligini ifade eder parametre olarak test methoduna gitmez.

