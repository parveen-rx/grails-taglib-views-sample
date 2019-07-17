--run below sql statement from existing user to create database record in the DB for application

INSERT INTO STUDENT(id, age, city, country, deleted, gender, name) VALUES (HIBERNATE_SEQUENCE.nextval, 27, 'Noida', 'India', 0, 'Male', 'Deepak Kumar');

INSERT INTO STUDENT(id, age, city, country, deleted, gender, name) VALUES (HIBERNATE_SEQUENCE.nextval, 25, 'Noida', 'India', 0, 'Female', 'Ankita Verma');


INSERT INTO STUDENT(id, age, city, country, deleted, gender, name) VALUES (HIBERNATE_SEQUENCE.nextval, 23, 'BLR', 'India', 0, 'Female', 'Isha Kaur');


INSERT INTO STUDENT(id, age, city, country, deleted, gender, name) VALUES (HIBERNATE_SEQUENCE.nextval, 27, 'Noida', 'India', 0, 'Male', 'Ajey Singh');


INSERT INTO STUDENT(id, age, city, country, deleted, gender, name) VALUES (HIBERNATE_SEQUENCE.nextval, 27, 'BLR', 'India', 0, 'Male', 'Raghu K Swami');


Commit;