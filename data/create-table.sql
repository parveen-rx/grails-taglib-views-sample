--run below sql statement from existing user to create table and sequence in the DB for application

CREATE TABLE STUDENT
(
    ID NUMBER(19) NOT NULL,
    AGE VARCHAR2(255 CHAR),
    CITY VARCHAR2(255 CHAR),
    COUNTRY VARCHAR2(255 CHAR),
    DELETED VARCHAR2(255 CHAR),
    GENDER VARCHAR2(255 CHAR),
    NAME VARCHAR2(255 CHAR) NOT NULL,
    CONSTRAINT student_id_pk PRIMARY KEY (id)
);

COMMIT;

-- create hibernate sequence
CREATE SEQUENCE  "HIBERNATE_SEQUENCE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 10 CACHE 20 NOORDER  NOCYCLE  NOPARTITION ;

COMMIT;

CREATE TABLE USER_INFO
(
    ID NUMBER(19) NOT NULL,
    FIRST_NAME VARCHAR2(255 CHAR),
    LAST_NAME VARCHAR2(255 CHAR),
    COUNTRY VARCHAR2(255 CHAR),
    ADDRESS VARCHAR2(255 CHAR),
    AGE NUMBER(3),
    CONSTRAINT user_id_pk PRIMARY KEY (id)
);

COMMIT;