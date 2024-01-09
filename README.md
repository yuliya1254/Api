# <a href="https://reqres.in/"><img src="media/logo/logo_reqres.jpeg" width="55" height="55"/></a> Демопроект автоматизации тестирования API на reqres.in»
## :page_with_curl: Содержание

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#telegram">Уведомления в Telegram</a>

* <a href="#allure">Allure Report отчеты</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>


<a id="tools"></a>


## Технологии и инструменты

<p  align="center">

<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg"></a>
<a href="https://www.java.com/"><img width="5%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://allurereport.org/"><img width="5%" title="Allure Report" src="Allure_Report.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="media/logo/Jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></a>
</p>

## :heavy_check_mark: Реализованные проверки

-  Создание нового пользователя
-  Получение списка пользователей
-  Изменение данных пользователя
-  Удаление пользователя
-  Изменение данных пользователя (не полное)

<a id="console"></a>
##  Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test  
```

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/AD_demo_api_reqres/)

<p align="center">

> Для запуска необходимо нажать "Собрать сейчас".

<a href="https://jenkins.autotests.cloud/job/AD_demo_api_reqres/"><img src="media/screenshots/JenkinsSborka.png" alt="Jenkins"/></a>

> При клике на сборку после завершения можно увидеть артефакты запуска и полезные ссылки для более детального изучения прогона.

<a href="https://jenkins.autotests.cloud/job/AD_demo_api_reqres/"><img src="media/screenshots/JenkinsIntegrations.png" alt="Jenkins"/></a>
</p>

<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram

<p >

> С помощью настроенного бота после завершения прогона в Jenkins поступают уведомления в Telegram.

<img title="telegram bot" src="media/screenshots/TelegramBotAPI.png">
</p>

<a id="allure"></a>
## <img src="media/logo/Allure.svg" width="25" height="25"/></a> [Allure Report](https://jenkins.autotests.cloud/job/AD_demo_api_reqres/5/allure/) отчеты

### Основное окно

<p align="center">
<img title="Allure Dashboard" src="media/screenshots/AllureDashboard.png">
</p>

### Отчеты по тестам

<p align="center">

> В отчете по тестам присутствует развернутая информация по запросам и ответам.

<img title="Allure Tests" src="media/screenshots/AllureWithInfo.png">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/1933/dashboards)

### Основное окно

<p align="center">
<img title="Allure TestOps" src="media/screenshots/Dashboard_TO.png">
</p>

### Дерево тестов с разделением по фичам

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TreeByFeatures_TO.png">
</p>

<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-553)

<p align="center">
<img title="Jira" src="media/screenshots/JiraAPI.png">
</p>


