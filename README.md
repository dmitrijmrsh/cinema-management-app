# cinema-management-app

Приложение для бронирования билетов в кинотеатр, разработанное с
применением микросервисной архитектуры, реализованной с помощью Spring Cloud.
В данный момент находится в стадии разработки.

Завершены следующие сервисы:
- config-server - сервис конфигураций приложения
- eureka-server - discovery-сервер для регистрации микросервисов
- api-gateway - единая точка входа для микросервисов
- film-service - сервис по взаимодействию в фильмами
- screening-service - сервис по взаимодействию с кинозалами