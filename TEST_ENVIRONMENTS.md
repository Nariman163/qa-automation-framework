# TEST ENVIRONMENTS

## UI: SauceDemo
Stable, benchmark site for UI automation.

- **URL:** `https://www.saucedemo.com`
- **Документация:** https://www.saucedemo.com/ (внутри сайта есть "About" для тестовых данных)

### Тестовые пользователи

| Логин | Пароль | Описание |
|-------|--------|----------|
| `standard_user` | `secret_sauce` | Обычный пользователь |
| `locked_out_user` | `secret_sauce` | Заблокированный пользователь (лимит входов) |
| `problem_user` | `secret_sauce` | Пользователь с багами в UI (проблемные товары) |

---

## API: ServeRest
Local REST API for API automation.

- **Docker:**
  ```bash
  docker run -p 3000:3000 paulogoncalvesbh/serverest:latest
  ```
- **Base URL:** `http://localhost:3000`
- **Онлайн-версия** (fallback, если Docker не работает): `https://serverest.dev`
- **Документация:** https://serverest.dev

### Эндпоинты

| Метод | URL | Описание |
|-------|-----|----------|
| GET | `/usuarios` | Список всех пользователей |
| POST | `/usuarios` | Создание нового пользователя |
| PUT | `/usuarios/:id` | Обновление пользователя |
| DELETE | `/usuarios/:id` | Удаление пользователя |
| POST | `/login` | Логин (получение токена) |
| GET | `/produtos` | Список товаров |
| POST | `/produtos` | Создание товара |
| GET | `/carrinhos` | Список корзин |
