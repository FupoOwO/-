ORM: JPA для создания сущностей и работы с базой данных. Классы Driver, Car, Trip, и Service аннотированы как сущности (@Entity)
Отношения: Используются аннотации @ManyToOne для указания связей между сущностями.
Методы: Реализованы методы для выполнения операций, таких как назначение водителей и автомобилей, начало и окончание поездок, выполнение обслуживания.
Отчёты: Класс Report содержит методы для генерации отчётов по использованию автомобилей и рабочему времени водителей.

--------------------------------------------------------------------------------------------------------------------------
Основные классы и их отношения:
Driver: 
  Атрибуты:
  id: Long
  name: String
  category: String
  available: Boolean

  Методы:
  assignCar(Car): void
--------------------------------
Car:
  Атрибуты:
  id: Long
  model: String
  category: String
  available: Boolean
  requiresService: Boolean
  
  Методы:
  assignDriver(Driver): void
  service(): void
--------------------------------
Trip:
  Атрибуты:
  id: Long
  startTime: LocalDateTime
  endTime: LocalDateTime
  driver: Driver
  car: Car
  
  Методы:
  start(): void
  end(): void
--------------------------------
Service:
  Атрибуты:
  id: Long
  serviceTime: LocalDateTime
  car: Car
  
  Методы:
  performService(): void
--------------------------------
Report:
  Методы:
  generateUsageReport(): List<Trip>
  generateDriverWorkReport(): List<Driver>
