create database SellingManagement;

create table Customers(
	cID   int primary key not null,
	cName varchar(50) not null,
	cAge  int default 0 
);

create table Orders(
	oID   		int primary key not null,
    cID   		int not null,
    oDate 		datetime not null,
    oTotalPrice double,
    
    foreign key (cID) references Customers(cID)
);

create table Products(
	pID 	int primary key not null,
	pName 	varchar(100) not null,
	pPrice 	double not null
);

create table OrdersDetail(
	oID 	int not null,
    pID 	int not null,
    odQTY 	int not null,
    
    primary key(oID, pID),
    foreign key(oID) references Orders(oID),
    foreign key(pID) references Products(pID)
);

insert into Customers(cID, cName, cAge)
	value	(1, "MinhQuan", 10),
			(2, "NgocOanh", 20),
            (3, "HongHa", 50);
insert into orders(oID, cID, oDate, oTotalPrice)
	value	(1, 1, 3/21/2006, null),
			(2, 2, 3/21/2006, null),
            (3, 1, 3/21/2006, null);
insert into products(pID, pName, pPrice)
	value	(1, "Laundry machine", 3),
			(2, "Fridge", 5),
            (3, "Air condition", 7),
            (4, "Fan", 1),
            (5, "Electric stove", 2);
insert into ordersDetail(oID, pID, odQTY)
	value	(1, 1, 3),
			(1, 3, 7),
            (1, 4, 2),
            (2, 1, 1),
            (3, 1, 8),
            (2, 5, 4),
            (2, 3, 3);
-- Display oID, oDate, oPrice of products               
select oID, oDate, oTotalPrice from Orders;
-- Display customers have buying 
select * from customers inner join orders
on customers.cID = orders.cID;
-- Display products were bought by customers
select * from products inner join ordersdetail
on products.pID =  ordersdetail.pID;
-- Display bills, date and price of bill
select orders.oID, orders.oDate, sum(products.pPrice*ordersdetail.odQTY) as money from orders
inner join ordersdetail on ordersdetail.oID = orders.oID
inner join products on products.pID = ordersdetail.pID
group by orders.oID;



    
            



