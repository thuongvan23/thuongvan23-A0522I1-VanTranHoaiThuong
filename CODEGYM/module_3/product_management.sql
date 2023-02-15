create database product_management;
create table Customer(
	cID int primary key not null,
    cName varchar(50),
    cAge int
);
create table Oder(
	oID int primary key not null,
    cID int,
    oDate date,
    oTotalPrice int
);
create table product(
	pID int primary key not null,
    pName varchar(50),
    pPrice int
);
create table OderDetail(
	oID int not null,
    pID int not null,
	primary key (oID, pID),
	-- oID int primary key not null,
--     pID int primary key not null,
    odQTY varchar(50)
);
alter table Oder
	add Foreign Key (cID) References Customer(cID);
alter table oderdetail
	add foreign key (oID) references oder(oID),
	add foreign key (pID) references product(pID);
