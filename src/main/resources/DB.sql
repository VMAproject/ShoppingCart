CREATE TABLE Accounts (
  User_Name VARCHAR(20) NOT NULL,
  Active    BIT         NOT NULL,
  Password  VARCHAR(20) NOT NULL,
  User_Role VARCHAR(20) NOT NULL,
  PRIMARY KEY (User_Name)
);

CREATE TABLE Order_Details (
  ID         VARCHAR(50)      NOT NULL,
  Amount     DOUBLE PRECISION NOT NULL,
  Price      DOUBLE PRECISION NOT NULL,
  Quanity    INTEGER          NOT NULL,
  ORDER_ID   VARCHAR(50)      NOT NULL,
  PRODUCT_ID VARCHAR(20)      NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE Orders (
  ID               VARCHAR(50)      NOT NULL,
  Amount           DOUBLE PRECISION NOT NULL,
  Customer_Address VARCHAR(255)     NOT NULL,
  Customer_Email   VARCHAR(128)     NOT NULL,
  Customer_Name    VARCHAR(255)     NOT NULL,
  Customer_Phone   VARCHAR(128)     NOT NULL,
  Order_Date       DATETIME         NOT NULL,
  Order_Num        INTEGER          NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE Products (
  Code        VARCHAR(20)      NOT NULL,
  Create_Date DATETIME         NOT NULL,
  Image       LONGBLOB,
  Name        VARCHAR(255)     NOT NULL,
  Price       DOUBLE PRECISION NOT NULL,
  PRIMARY KEY (Code)
);

ALTER TABLE Orders
  ADD CONSTRAINT UK_sxhpvsj665kmi4f7jdu9d2791 UNIQUE (Order_Num);

ALTER TABLE Order_Details
  ADD CONSTRAINT ORDER_DETAIL_ORD_FK
FOREIGN KEY (ORDER_ID)
REFERENCES Orders (ID);

ALTER TABLE Order_Details
  ADD CONSTRAINT ORDER_DETAIL_PROD_FK
FOREIGN KEY (PRODUCT_ID)
REFERENCES Products (Code);

# ---------------------------------------
INSERT INTO Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
VALUES ('employee1', 1, '123', 'EMPLOYEE');

INSERT INTO Accounts (USER_NAME, ACTIVE, PASSWORD, USER_ROLE)
VALUES ('manager1', 1, '123', 'MANAGER');

# ----------------
INSERT INTO products (CODE, NAME, PRICE, CREATE_DATE)
VALUES ('S001', 'Core Java', 100, `SYSDATETIME`());

INSERT INTO products (CODE, NAME, PRICE, CREATE_DATE)
VALUES ('S002', 'Spring for Beginners', 50, `SYSDATETIME`());

INSERT INTO products (CODE, NAME, PRICE, CREATE_DATE)
VALUES ('S003', 'Swift for Beginners', 120, `SYSDATETIME`());

INSERT INTO products (CODE, NAME, PRICE, CREATE_DATE)
VALUES ('S004', 'Oracle XML Parser', 120, `SYSDATETIME`());

INSERT INTO products (CODE, NAME, PRICE, CREATE_DATE)
VALUES ('S005', 'CSharp Tutorial for Beginers', 110, `SYSDATETIME`());
