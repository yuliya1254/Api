# Демо проект по автоматизации тестирования API на [reqres.in](https://reqres.in/)
<p align="center">
<img title="reqres.in" src="media/logo/reqres_logo.png">
</p>

##  Содержание:

> ➠ [Технологический стек](#технологии-и-инструменты)
>
> ➠ [Покрытый функционал](#покрытый-функционал)
>
> ➠ [Запуск из терминала](#Запуск-тестов-из-терминала)
>
> ➠ [Сборка в Jenkins](#Сборка-в-Jenkins)
>
> ➠ [Пример Allure-отчета](#Пример-Allure-отчета)


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
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></a>
</p>
В данном проекте автотесты написаны на <code>Java</code>.

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

## Сборка в [Jenkins](https://jenkins.autotests.cloud/job/HW_API_22/)
Для запуска сборки необходимо перейти в раздел <code>Build Now</code>

<p align="center">
<img title="Jenkins Build" src="media/screens/JenkinsBuild.png">
</p>

После выполнения сборки, в блоке <code>Build History</code> напротив номера сборки появится значок <code>Allure Report</code> кликнув по которому, откроется страница с сформированным html-отчетом.

## Пример [Allure-отчета](https://jenkins.autotests.cloud/job/diplom_api/3/allure/)
### Overview

<p align="center">
<img title="Allure Overview" src="media/screens/allureReport.png">
</p>

### Результат выполнения теста

<p align="center">
<img title="Test Results in Alure" src="media/screens/ResultTest.png">
</p>