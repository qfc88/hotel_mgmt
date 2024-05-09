CREATE DATABASE HMS;
USE HMS;
CREATE TABLE Hotel (
    HotelID INT PRIMARY KEY default 10,
    Name VARCHAR(50) default 'HCMIU',
    Address VARCHAR(100) default 'Quarter 6, Linh Trung ward, Thu Duc, HCMC',
    Phone VARCHAR(15) default '(028) 37244270',
    Email VARCHAR(100) default 'info@hcmiu.edu.vn',
    Quality INT default 5
);

CREATE TABLE RoomType (
    TypeID INT PRIMARY KEY not null auto_increment,
    Name VARCHAR(50),
    Description VARCHAR(255),
    Price DECIMAL(10, 2),
    Capacity INT
);

CREATE TABLE Room (
    RoomNumber INT PRIMARY KEY not null auto_increment,
    HotelID INT,
    TypeID INT,
    Status VARCHAR(20),
    FOREIGN KEY (TypeID) REFERENCES RoomType(TypeID)
);

CREATE TABLE Employee (
	EmployeeID INT not null PRIMARY KEY auto_increment,
	HotelID INT,
	FirstName VARCHAR(25),
	MiddleName VARCHAR(25),
	LastName VARCHAR(25) NOT NULL,
	Role VARCHAR(25) NOT NULL,
	Salary DECIMAL(10, 2),
	DateOfBirth DATE,
	HireDate DATE,
	Phone VARCHAR(15),
	Email VARCHAR(255),
	FOREIGN KEY (HotelID) REFERENCES Hotel(HotelID)
);


CREATE TABLE Management(
	MID INT PRIMARY KEY not null auto_increment,
    EmployeeID INT NOT NULL,
	EmpUsername VARCHAR(10),
    NAME VARCHAR(10) NOT NULL,
    PASSWORD VARCHAR(64) NOT NULL,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);

CREATE TABLE User(
    UID INT PRIMARY KEY not null auto_increment,
    Username VARCHAR(16) NOT NULL,
    Email VARCHAR(32) NOT NULL,
    Password VARCHAR(32) NOT NULL
);

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY not null auto_increment,
    UID INT NOT NULL,
    FirstName VARCHAR(25) NOT NULL,
	MiddleName VARCHAR(25),
    LastName VARCHAR(25) NOT NULL,
    DateOfBirth DATE,
    Address VARCHAR(100),
    Phone VARCHAR(15),
    Email VARCHAR(100),
    FOREIGN KEY (UID) REFERENCES User(UID)
);

CREATE TABLE Booking (
    BookingID INT PRIMARY KEY auto_increment,
    CustomerID INT NOT NULL,
    RoomNumber INT NOT NULL,
    CheckinDate DATE,
    CheckoutDate DATE,
    TotalPrice DECIMAL(10, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID),
    FOREIGN KEY (RoomNumber) REFERENCES Room(RoomNumber)
);

 CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY,
    BookingID INT NOT NULL,
    Amount DECIMAL(10, 2),
    PaymentDate DATE,
    PaymentMethod VARCHAR(50),
    FOREIGN KEY (BookingID) REFERENCES Booking(BookingID)
);


