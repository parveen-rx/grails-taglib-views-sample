--run below sql statement from a sys user to create a user in the DB for application

CREATE TABLESPACE tbs_gsa DATAFILE 'tbs_gsa.DBF' SIZE 10M AUTOEXTEND ON;

CREATE TABLESPACE tbs_lob_gsa DATAFILE 'tabs_lob_gsa.DBF' SIZE 10M AUTOEXTEND ON;

CREATE USER gsdbu identified BY gsdbu default tablespace tbs_gsa quota unlimited on tbs_gsa QUOTA UNLIMITED ON tbs_lob_gsa;

Commit;

grant dba to gsdbu;

Commit;