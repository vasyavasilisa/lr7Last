-- DROP database `lab7`;
CREATE SCHEMA IF NOT EXISTS `lab7` DEFAULT CHARACTER SET utf8;
USE `lab7`;

-- Table `lab7`.`customers`
CREATE TABLE IF NOT EXISTS `lab7`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `discount` VARCHAR(1) NOT NULL,
  `zip` INT NOT NULL,
  `phone_number` VARCHAR(13) NOT NULL,
  `email` VARCHAR(75) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

INSERT INTO `lab7`.`customers`(name, surname, discount, zip, email, phone_number, city)
VALUES('Алексей', 'Конохов', 'N', 33015, 'user1@gmail.com', '+375441236589', 'Minsk'),
('Мария', 'Высоцкая', 'M', 33055, 'user2@gmail.com', '+375441478562', 'Minsk'),
('Василий', 'Коржиков', 'M', 75200, 'user3@gmail.com', '+375448512356', 'Minsk'),
('Николай', 'Еремеев', 'L', 12347, 'user4@gmail.com', '+375445468262', 'Minsk'),
('Анна', 'Батьковна', 'H', 94401, 'user5@gmail.com', '+375446684651', 'Minsk'),
('Пётр', 'Конюхов', 'L', 95035, 'user6@gmail.com', '+375449376354', 'Minsk'),
('Павел', 'Хроменков', 'L', 95117, 'user7@gmail.com', '+375446649545', 'Minsk'),
('Кирилл', 'Крылов', 'N', 94401, 'user8@gmail.com', '+375449467553', 'Minsk'),
('Филипп', 'Бронский', 'L', 48128, 'user9@gmail.com', '+375449654459', 'Minsk');