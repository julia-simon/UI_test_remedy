## Автотесты для компании Remedy Logic 
<p align="center">
  <img src="media/remedylogo.png" alt="Remedy" width="800">
</p>

<a name="Ссылка"></a>
## Содержание

- <a href="#tools">Стек технологий</a>
- <a href="#tests">Список тест-кейсов</a>
- <a href="#run">Команда для запуск тестов локально</a>
- <a href="#remote">Команда для запуска тестов удаленно</a>
- <a href="#jenkins-report">Сборка в Jenkins</a>
- <a href="#allure-report">Пример отчета о прохожлении тестирования в Allure Report</a>
- <a href="#allure-testops">Интеграция с Allure TestOps</a>
- <a href="#jira">Интеграция с Jira</a>
- <a href="#telegram">Уведомления в Telegram</a>
- <a href="#selenoid">Пример видео запуска теста в Selenoid</a>


<a id="tools"></a>
## :computer: Stack of technologies

<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="media/logo/Java.svg"></code>
<code><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></code>
<code><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></code>
<code><img width="5%" title="Selenide" src="media/logo/Selenide.svg"></code>
<code><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></code>
<code><img width="5%" title="Jenkins" src="media/logo/Jenkins_logo.svg"></code>
<code><img width="5%" title="Selenoid" src="media/logo/Selenoid.svg"></code>
<code><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Jira" src="media/logo/Jira.svg"></code>
<code><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></code>
</p>

<a id="tests"></a>
## :bookmark_tabs: Список тест-кейсов:

- [x] Успешная авторизация пользователя
- [x] Проверка ошибки при вводе неправильного пароля
- [x] Проверка логаута
- [x] Создание пациента
- [x] Редактирование карточки пациента
- [x] Добавление заметки на странице приема пациента
- [x] Проверка сообщения об удалении заметки


<a id="run"></a>
## :computer: Команда для запуск тестов локально

```bash
gradle clean smoke_test
```

<a id="remote"></a>
## :computer: Команда для запуска тестов удаленно

```bash
clean
smoke_test
-Dremote=${REMOTE}
-DbaseUrl=${BASE_URL}
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
```

<a id="jenkins-report"></a>
## <img width="4%" title="Jenkins" src="media/logo/Jenkins_logo.svg"> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/julia_simon_qa_guru_19_jenkins_final_project/)

Для запуска сборки в Jenkins необходим перейти в сборку и нажать кнопку <code><strong>*Собрать с параметрами*</strong></code>, выбрать необходимые параметры и нажать кнопку <code><strong>*Собрать*</strong></code>.
Когда сборка будет завершена, станет доступен отчет Allure.

<p align="center">
  <img src="media/jenkins1.jpg" alt="Jenkins" width="800">
</p>


<a id="allure-report"></a>
## <img width="4%" title="Allure Report" src="media/logo/Allure.svg"> Пример отчета о прохожлении тестирования в [Allure Report](https://jenkins.autotests.cloud/job/julia_simon_qa_guru_19_jenkins_final_project/allure/)

Из <code><strong>Jenkins</strong></code> можно перейти в отчет сгенерированный с помощью <code><strong>Allure</strong></code>

<p align="center">
  <img src="media/allure5.jpg" alt="allure5" width="900">
</p>

<a id="allure-testops"></a>
## <img width="4%" title="Allure TestOPS" src="media/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3552/dashboards)

## Тест-кейсы

<p align="center">
  <img src="media/testops.jpg" alt="testops" width="800">
</p>

<a id="jira"></a>
## <img width="4%" title="Jira" src="media/logo/Jira.svg"> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-810)

<p align="center">
  <img src="media/jira.jpg" alt="jira-project" width="800">
</p>

<a id="telegram"></a>
## <img width="4%" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram
После завершения тестирования отчет о результатах автоматически отправляется <code>Telegram</code> канал

<p align="center">
<img title="Telegram Notifications" src="media/telegram.jpg" width="500">
</p>


<a id="selenoid"></a>
## <img width="4%" title="Selenoid" src="media/logo/Selenoid.svg"> Пример видео запуска теста в Selenoid
После прохождения тестов в отчете доступно видео.

<p align="center">
  <img title="Selenoid Video" src="media/video/test.gif">
</p>

[Вернуться к оглавлению ⬆](#Ссылка)
