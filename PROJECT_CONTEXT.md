# PROJECT_CONTEXT.md

## Цель

Переход из ручного тестирования в автоматизацию.
Цель — оффер **Java QA Automation Engineer**.

## Инфо о разработчике

- 4 года manual testing → переход в automation
- ~8 часов обучения в неделю
- Mac (Apple Silicon, arm64), IntelliJ IDEA, Docker Desktop
- Есть опыт с Selenium, но "плохой" — учимся правильно
- Нахожусь в России

## Стек

| Инструмент | Версия / Технология |
|-----------|---------------------|
| Java | 21 |
| Build tool | Maven |
| Selenium | 4.49.0 |
| JUnit | Jupiter 6.1.3 |
| Браузер | Chrome |
| WebDriverManager | НЕ используем (Selenium Manager встроен в 4.6+) |

> Далее добавим: REST Assured, Jackson, Allure, SLF4J/Logback

## Правила работы с AI-ассистентом

- Объяснять **построчно**, как для новичка
- **Не давать готовых ответов** — давать подсказки и наводящие вопросы
- Работать **малыми итерациями** (один шаг = проект собирается)
- Не перегружать сложными концепциями
- Если предлагаю код — объяснять, **почему именно так**
- Проверять меня вопросами "что ты видишь на экране?" / "какая ошибка?"

## Структура проекта

```
src/test/java/com/qa/restfulbooker/
├── SmokeTest.java
├── core/
│   └── BaseUiTest.java
└── config/
    └── ConfigReader.java

src/test/resources/
└── config.properties
```

## Документация проекта

| Файл | Для чего |
|------|----------|
| `PROJECT_CONTEXT.md` | Цель, стек, правила (редко меняется) |
| `ITERATIONS.md` | История итераций и план (каждый шаг) |
| `TEST_ENVIRONMENTS.md` | Стенды, URL, креды (редко меняется) |
| `config.properties` | Конфиг для кода (читается из Java) |

## GitHub

- Репозиторий: https://github.com/Nariman163/qa-automation-framework
- Локально: `~/Desktop/Project/qa-automation-framework`
- Артефакт: `qa-automation-framework`, groupId: `com.qa`
- Пакет: `com.qa.restfulbooker`
