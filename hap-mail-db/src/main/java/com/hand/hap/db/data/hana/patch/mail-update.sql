ALTER TABLE SYS_MESSAGE_EMAIL_CONFIG ALTER (
    HOST NVARCHAR(50) NOT NULL ,
    PORT NVARCHAR(10) NOT NULL ,
    USE_WHITE_LIST NVARCHAR(1) NOT NULL);

ALTER TABLE SYS_MESSAGE_EMAIL_ACCOUNT ALTER (
    USER_NAME NVARCHAR(240) NOT NULL );

ALTER TABLE SYS_MESSAGE_TEMPLATE ALTER (
    SUBJECT NCLOB NOT NULL ,
    CONTENT NCLOB NOT NULL);