# projectTricolor

В проекте тестируется мобильное приложение **"Кино и ТВ"**.

*Тест расположен:* H:\project mobile\projectKinoAndTv\src\test\java\actions\TestTricolor.java


*Предусловия для запуска теста:*
1) Пользователь имеет валидные данные для авторизации
2) Установлено приложение ("src/test/resources/Кино и ТВ.apk") насмартфон, либо эмулятор
3) В классе **TestTricolor** задать версию Android(PLATFORM_VERSION) и название эмулятора/устройства(DEVICE_NAME)
4) Ввести логин и пароль пользователя в классе **TestTricolor**, либо использовать данные из теста

Для запуска теста из консоли в корне проекта нужно выполнить:
*gradle test --tests TestTricolor*