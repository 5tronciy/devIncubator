CREATE SCHEMA `dev` ;

CREATE TABLE `dev`.`user` (
  `userid` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `sureName` VARCHAR(45) NULL,
  PRIMARY KEY (`userid`));

CREATE TABLE `dev`.`account` (
  `accountid` INT NOT NULL,
  `account` INT NULL,
  `userid` INT NULL,
  PRIMARY KEY (`accountid`),
  INDEX `userid_idx` (`userid` ASC) VISIBLE,
  CONSTRAINT `userid`
    FOREIGN KEY (`userid`)
    REFERENCES `dev`.`user` (`userid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('1', 'Oleg', 'Ivanov');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('2', 'Ivan', 'Petrov');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('3', 'Matwei', 'Sidorov');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('4', 'Ignat', 'Matveev');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('5', 'Mary', 'Key');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('6', 'Jack', 'Martin');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('7', 'John', 'Castro');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('8', 'Phil', 'Ivy');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('9', 'Mike', 'Thyson');
INSERT INTO `dev`.`user` (`userid`, `name`, `sureName`) VALUES ('10', 'Nikolay', 'Pogrebnyak');
	
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('1', '001', '1');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('2', '002', '2');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('3', '003', '3');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('4', '004', '4');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('5', '005', '5');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('6', '006', '6');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('7', '007', '7');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('8', '008', '8');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('9', '009', '9');
INSERT INTO `dev`.`account` (`accountid`, `account`, `userid`) VALUES ('10', '010', '10');
