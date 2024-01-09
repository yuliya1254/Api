# Демо проект по автоматизации тестирования API на [reqres.in](https://reqres.in/)
<p align="center">
<img title="reqres.in" src="media/logo/reqres_logo.png">
</p>

##  Содержание:

> ➠ [Технологический стек](#технологии-и-инструменты)
>
> ➠ [Покрытый функционал](#покрытый-функционал)
>
> ➠ [Запуск тестов из терминала](#Запуск-тестов-из-терминала)
>
> ➠ [Удаленный запуск (в Jenkins)](#Удаленный запуск-(в Jenkins))
>
> ➠ [Отчет в Allure report](#Отчет в Allure report)
> 
> ➠ [Отчет в Allure TestOps](#Отчет в Allure TestOps)
> 
> ➠ [JiraAtlassian Jira интеграция](#JiraAtlassian Jira интеграцияа)
>
> ➠ [Telegram уведомления](#Telegram уведомления)


## Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg"></a>
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/JUnit5.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins.svg"></a>
<a href="https://allurereport.org/"><img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="media/logo/Jira.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></a>
</p>

## Покрытый функционал

> Разработаны автотесты:

- [x] Создание нового пользователя
- [x] Получение списка пользователей
- [x] Изменение данных пользователя
- [x] Удаление пользователя
- [x] Изменение данных пользователя (не полное)

##  Запуск тестов из терминала

```
gradle clean test
```

###  :rocket: Удаленный запуск (в Jenkins):
<p align="center">
<img title="Jenkins" src="media/screens/JenkinsBuild.png">
</p>

1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/HW_API_22/">проект</a>
2. Нажать **Build with Parameters**
3. Результат запуска сборки можно посмотреть в отчёте Allure

## :triangular_flag_on_post: Allure отчеты:

### <img src="media/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/>Отчет в Allure</a> <a target="_blank" href="https://jenkins.autotests.cloud/job/HW_API_22/9/allure/"> report</a>

#### :black_small_square: Основной отчет
<p align="center">
<img title="Allure Report Dashboards" src="media/screens/allureReport.png">
</p>

#### :black_small_square: Тесты
<p align="center">
<img title="Allure Report Tests" src="media/screens/testForAllure.png">
</p>

### <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure TestOps"/>Отчет в Allure</a> <a target="_blank" href="https://allure.autotests.cloud/project/3938/dashboards"> TestOps</a>

#### :black_small_square: Основной отчет
<p align="center">
<img title="Allure TestOps Dashboards" src="media/screens/testOpsOrhet.png">
</p>

#### :black_small_square: Тесты
<p align="center">
<img title="Allure TestOps Tests" src="media/screens/testsForTestOp.png">
</p>

## <img src="media/logo/Jira.svg" width="25" height="25" alt="Jira"/>Atlassian Jira интеграция</a>
<p align="center">
  <img title="Allure TestOps overview" src="media/screens/jira.png">
</p>


## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Telegram"/>Telegram уведомления</a>

<p align="center">
<img title="Allure Overview Dashboard" src="media/screens/telegram.png">
</p>



