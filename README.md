# Автоматизация тестирования мобильного приложения Wikipedia

<p align="center">
<a href="https://github.com/wikimedia/apps-android-wikipedia/releases"><img src="images/screenshots/Wiki.jpg" width="30%" alt="Wiki"/></a>
</p>

## Содержание:
+ [Стек технологий](#computer-Стек-технологий)
+ [Тестовые сценарии](#clipboard-Тестовые-сценарии)
+ [Сборка в Jenkins](#-Сборка-в-Jenkins)
+ [Команды запуска тестов в терминале](#desktop_computer-Команды-запуска-тестов-в-терминале)
+ [Интеграция с Allure report](#-Интеграция-с-Allure-report)
+ [Интеграция с Allure TestOps](#-Интеграция-с-Allure-testOps)
+ [Интеграция с Jira](#-Интеграция-с-Jira)
+ [Видео прохождения тестов](#cinema-Видео-прохождения-Тестов)
+ [Интеграция с Appium](#-Интеграция-с-Appium)
+ [Интеграция с Browserstack](#-Интеграция-с-Browserstack)
+ [Информирование в Telegram](#-Информирование-в-Telegram)

## :computer: Стек технологий
<p align="center">
<a href="https://www.java.com/"><img src="images/logo/java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://gradle.org/"><img src="images/logo/gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/allureReport.svg" width="50" height="50"  alt="Allure Reports"/></a>
<a href="https://qameta.io/"><img src="images/logo/allureTestOps.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://appium.io/"><img src="images/logo/appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="https://www.browserstack.co"><img src="images/logo/browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://www.atlassian.com/software/jira"><img src="images/logo/jira.svg" width="50" height="50"  alt="Jira"/></a>
<a href="https://telegram.org/"><img src="images/logo/telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## :clipboard: Тестовые сценарии
+ :white_check_mark: Проверка работы кнопки "Search"
+ :white_check_mark: Проверка работы кнопки "Saved"
+ :white_check_mark: Проверка работы кнопки "Edits"
+ :white_check_mark: Проверка перехода из поиска в найденную статью
+ :white_check_mark: Проверка вхождения в выдачу поиска искомого значения

## <img width="5%" src="images/logo/jenkins.svg"> Сборка в Jenkins
<kbd>[![](images/screenshots/JenkinsResult.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_DIPLOM_MOBILE/)</kbd>

#### Параметры сборки:
| Параметры          | Значение                             |
|:-------------------|:-------------------------------------|
| DEVICE             | Способы запуска мобильных автотестов |

<kbd>[![](images/screenshots/JenkinsStart.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_DIPLOM_MOBILE/build)</kbd>

## :desktop_computer: Команды запуска тестов в терминале
#### Команды для локального запуска:
```bash
./gradlew clean taskWithTagWiki -Dhost=${DEVICE}
```
>${DEVICE} заменяем на одно из: browserstackDevice, personalDevice, virtualDevice

#### Команды для удаленного запуска:
```bash
clean taskWithTagWiki -Dhost=${DEVICE}
```
>${DEVICE} заменяем на одно из: browserstackDevice, personalDevice, virtualDevice

## <img width="5%" title="Allure" src="images/logo/allureReport.svg"> Интеграция с Allure report
#### Диаграммы прохождения тестов:
<kbd>[![](images/screenshots/AllureReportScheme.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_DIPLOM_MOBILE/allure/)</kbd>

#### Развернутый результат прохождения тестов:
| Левая часть скриншота | Правая часть скриншота            |
|:----------------------|:----------------------------------|
| Тестовые сценарии     | Подробное описание шагов          |
|                       | Финальный скриншот каждого теста  |
|                       | Исходники страницы теста          |
|                       | Исходники консоли браузера        |
|                       | Финальный ролик с процессом теста |

<kbd>[![](images/screenshots/AllureReportTestCases.jpg)](https://jenkins.autotests.cloud/job/Loarlam-QA_GURU_13_DIPLOM_MOBILE/allure/#suites/4563a8ad7e60f3291988229e90518d9a)</kbd>

## <img width="5%" title="Allure" src="images/logo/allureTestOps.svg"> Интеграция с Allure TestOps
#### Диаграммы прохождения тестов:
<kbd>![](images/screenshots/AllureTestopsScheme.jpg)</kbd>

#### Развернутый результат прохождения тестов:
| Левая часть скриншота | Правая часть скриншота            |
|:----------------------|:----------------------------------|
| Тестовые сценарии     | Подробное описание шагов          |
|                       | Финальный скриншот каждого теста  |
|                       | Исходники страницы теста          |
|                       | Исходники консоли браузера        |
|                       | Финальный ролик с процессом теста |

<kbd>![](images/screenshots/AllureTestOpsTestCases.jpg)</kbd>

## <img width="5%" title="Jira" src="images/logo/jira.svg"> Интеграция с Jira
<kbd>![](images/screenshots/JiraResult.jpg)</kbd>

## :cinema: Видео прохождения тестов
#### :white_check_mark: Проверка работы кнопки "Search":
<p align="center">
  <img src="images/gif/VideoResult1.gif">
</p>

#### :white_check_mark: Проверка работы кнопки "Saved":
<p align="center">
  <img src="images/gif/VideoResult2.gif">
</p>

#### :white_check_mark: Проверка работы кнопки "Edits":
<p align="center">
  <img src="images/gif/VideoResult3.gif">
</p>

#### :white_check_mark: Проверка перехода из поиска в найденную статью:
<p align="center">
  <img src="images/gif/VideoResult4.gif">
</p>

#### :white_check_mark: Проверка вхождения в выдачу поиска искомого значения:
<p align="center">
  <img src="images/gif/VideoResult5.gif">
</p>

## <img width="5%" title="Appium" src="images/logo/appium.svg"> Интеграция с Appium
#### Запуск автотестов на личном смартфоне при помощи Appium Server GUI:
<kbd>![](images/screenshots/AppiumVirtualDevice.jpg)</kbd>

#### Запуск автотестов на виртуальном смартфоне при помощи Appium Inspector и Android Studio:
<kbd>![](images/screenshots/AppiumInspector.jpg)</kbd>

## <img width="5%" title="Browserstack" src="images/logo/browserstack.svg"> Интеграция с Browserstack
#### Детальная инфографика процесса:
<kbd>![](images/screenshots/Browserstack.jpg)</kbd>

## <img width="5%" title="Telegram" src="images/logo/telegram.svg"> Информирование в Telegram
#### Оповещение ведется при помощи Telegram bot API:
<kbd>![](images/screenshots/TelegramResult.jpg)</kbd>