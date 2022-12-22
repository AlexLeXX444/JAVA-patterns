
---
---
 # Цель:

Достичь понимания основных паттернов проектирования на примерах их использования.
Также напонить основные принципы ООП.

---
---

# ООП.

Объектно Ориентированное Программирование (ООП) - парадигма программирования, в которой ключевым блоком является объект, который относится с объектом в конкретной задаче.

### Главные аспекты:

- любая система состоит из объектов;
- каждый объект имеет состояние и поведение;
- объекты взаимодействуют между собой определенным образом.

## Основные принципы ООП:

- Инкапсуляция;
- Наследование;
- Полиморфизм.

## Инкапсуляция:

- механизм, благодаря которому любой класс или часть системы рассматриваются как отдельный модуль и пользователь этого модуля может взаимодействовать с ним только определенными способами и не видит реализации этого модуля;
- сводит к минимуму количество связей между частями системы, тем самым, упрощая изменение модулей (рефакторинг).

## Наследование:

- механизм создания класса с помощью другого с использованием всех свойств и методов суперкласса добавляя новые свойства при необходимости;
- отображает иерархичность окружающего мира.

## Полиморфизм:

- механизм, благодаря которому подклассы могут изменять реализацию методов суперкласса, сохраняя его сигнатуру, благодаря чему интерфейс суперкласса остается неизменным;
- позволяет работать с объектами подклассов как с объектами суперкласса, даже с учетом того, что реализация определенных методов у подклассов может отличаться от реализации методов суперкласса.

---
---

# Паттерны проектирования.

*Паттерн или шаблон проетирования в разработке программного обеспечения* — повторяемая архитектурная конструкция, представляющая собой решение проблемы проектирования в рамках некоторого часто возникающего контекста. Обычно шаблон не является законченным образцом, который может быть прямо преобразован в код; это лишь пример решения задачи, который можно использовать в различных ситуациях.

## [Фабрика (Factory method).](https://github.com/AlexLeXX444/JAVA-patterns/tree/main/fabrickTask)

## [Абстрактная фабрика (Abstract fabrick).](https://github.com/AlexLeXX444/JAVA-patterns/tree/main/abstractFabrickTask)

## [Одиночка (Singleton).](https://github.com/AlexLeXX444/JAVA-patterns/tree/main/singletoneTask)
