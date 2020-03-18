DROP TABLE IF EXISTS AM_API_CATEGORIES;
CREATE TABLE IF NOT EXISTS AM_API_CATEGORIES (
  UUID VARCHAR(50),
  NAME VARCHAR(255),
  DESCRIPTION VARCHAR(1024),
  TENANT_ID INTEGER DEFAULT -1,
  UNIQUE (NAME,TENANT_ID),
  PRIMARY KEY (UUID)
);

ALTER TABLE AM_SYSTEM_APPS
ADD TENANT_DOMAIN VARCHAR(255) DEFAULT 'carbon.super';

DROP TABLE IF EXISTS AM_USER;
CREATE TABLE IF NOT EXISTS AM_USER (
    USER_ID VARCHAR(255) NOT NULL,
    USER_NAME VARCHAR(255) NOT NULL,
    PRIMARY KEY(USER_ID)
);

DROP TABLE IF EXISTS AM_SECURITY_AUDIT_UUID_MAPPING;
CREATE TABLE IF NOT EXISTS AM_SECURITY_AUDIT_UUID_MAPPING (
    API_ID INTEGER NOT NULL,
    AUDIT_UUID VARCHAR(255) NOT NULL,
    PRIMARY KEY (API_ID),
    FOREIGN KEY (API_ID) REFERENCES AM_API(API_ID)
);