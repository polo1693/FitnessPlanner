# Table User

CREATE TABLE if not exists user (
id int unsigned NOT NULL auto_increment,
username varchar(50),
password varchar(50),
role int,
#  0-admin, 1-client, 2-trainer
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

# Table trainer

CREATE TABLE if not exists trainer(
  id int unsigned NOT NULL auto_increment,
  trainerName varchar(50),
  speciality varchar(50),

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

# Table Client

CREATE TABLE if not exists client(
  clientId int unsigned NOT NULL auto_increment,
  firstName varchar(50),
  lastName varchar(50),
  email varchar(50),
  phone varchar(50),
  address varchar(50),
  latitude varchar(50),
  longitude varchar(50),
  cnp varchar(50),
  hasActiveSubscrition BOOLEAN,

  PRIMARY KEY (clientId)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

# Table workout

CREATE TABLE if not exists workout(
  workoutId int unsigned NOT NULL auto_increment,
  workoutName VARCHAR(50),
  id int unsigned NOT NULL,
  startDate VARCHAR(50),
  endDate VARCHAR(50),
  startTime varchar(50),
  endTime varchar(50),
  description varchar(100),
  capacity int,
  isFull BOOLEAN,
  isCanceled BOOLEAN,

  PRIMARY KEY (workoutId),
  FOREIGN KEY (id) REFERENCES trainer(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

# Table booking

CREATE TABLE if not exists booking(
bookingId int unsigned NOT NULL auto_increment,
  id int unsigned NOT NULL,
  workoutId int unsigned NOT NULL,
  clientId int unsigned NOT NULL,
  isApproved BOOLEAN,

  PRIMARY KEY (bookingId),
  FOREIGN KEY (id) REFERENCES trainer(id),
  FOREIGN KEY (workoutId) REFERENCES workout(workoutId),
  FOREIGN KEY (clientId) REFERENCES client(clientId)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

#   Table information price
CREATE TABLE if not exists priceInfo(
  id int unsigned NOT NULL auto_increment,
  pricePerHour DOUBLE,
  pricePerDay DOUBLE,
  pricePerMonth DOUBLE,

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


