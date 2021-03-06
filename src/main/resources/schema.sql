DROP TABLE IF EXISTS EVENT_TYPES;

CREATE TABLE EVENT_TYPES (
  ID int(11) NOT NULL AUTO_INCREMENT,
  NAME varchar(200) NOT NULL,
  PRIMARY KEY (ID)
);

DROP TABLE IF EXISTS EVENTS;

CREATE TABLE EVENTS (
  ID int(11) NOT NULL AUTO_INCREMENT,
  EVENT_TYPE_ID int(11) NOT NULL,
  CID varchar(200) NOT NULL,
  UUID varchar(200) NOT NULL,
  PAYLOAD LONGTEXT DEFAULT NULL,
  ADDED_AT datetime DEFAULT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (EVENT_TYPE_ID) REFERENCES EVENT_TYPES(ID)
);