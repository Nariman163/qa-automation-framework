# ITERATIONS

## Пройденные итерации

1. ✅ Создан Maven-проект, `.gitignore` (игнорирует `.idea/`, `target/`)
2. ✅ Добавлены зависимости: Selenium 4.49.0, JUnit 5 (Jupiter 6.1.3)
3. ✅ Создан `SmokeTest` — открывает Chrome, печатает Title, закрывает браузер
4. ✅ Первый коммит сделан и запушен в `main`
5. ✅ Создан `BaseUiTest` с `@BeforeEach` / `@AfterEach` (создание и закрытие driver)
6. ✅ В `BaseUiTest` добавлено поле `WebDriverWait wait`
7. ✅ Создан `ConfigReader` + `config.properties`
8. ✅ `BaseUiTest` читает URL из `ConfigReader.getUiBaseUrl()`
9. ✅ Переезд с `automationintesting.online` на **SauceDemo** (UI) + **ServeRest** (API)
10. ✅ `SmokeTest` проходит против SauceDemo (Title: "Swag Labs")
11. ✅ ServeRest запущен в Docker, `http://localhost:3000/usuarios` отвечает
12. ✅ Разделение проекта на три файла: `PROJECT_CONTEXT.md`, `ITERATIONS.md`, `TEST_ENVIRONMENTS.md`

## Текущая задача

> **Добавить сюда текущую задачу после завершения предыдущей.**

## План

1. Page Object `LoginPage` — только структура, без assertions
2. Первый UI-тест логина + первый assertion
3. Негативные сценарии (locked_out_user, пустые поля)
4. Явные ожидания в Page Object, разбор `StaleElementReferenceException`
5. Logout + fluent interface
6. REST Assured, первый GET-запрос `/usuarios`
7. POST `/usuarios`, создание пользователя
8. Логин через API, получение токена
9. CRUD `/produtos` с авторизацией
10. JSON Schema validation
11. Сериализация/десериализация POJO (Jackson)
12. Allure-отчёт
13. GitHub Actions (CI/CD)
14. Финал: E2E-тест (создание юзера через API → логин через UI → проверка)
