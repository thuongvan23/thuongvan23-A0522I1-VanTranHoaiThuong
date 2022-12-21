create database Demo;
create table Products(
	id int primary key not null,
    productCode int,
	productName varchar(50),
	productPrice int,
	productAmount int,
	productDescription varchar(100),
	productStatus varchar(100)
);

insert into products (id, productCode, productName, productPrice, productAmount, productDescription, productStatus)
	values (1, 2, "A", 4, 12, "gsf", "fdfqdf"),
		   (2, 5, "C", 7, 32, "gsdsf", "fdqwefdf"),
		   (3, 6, "D", 21, 6, "gsdscbf", "fddewf"),
		   (4, 3, "E", 5, 11, "gsffdhy", "fddqwf");
           
alter table demo.Products
modify column productCode int unique;
           
alter table demo.Products add unique idx_productCode (productCode);

alter table demo.products add unique composite_idx (productName, productPrice);

create view vwProducts as
select productCode, productName, productPrice, productStatus from Products;

create or replace view vwProducts as
select productCode, productName, productPrice from Products;

drop view vwproducts;

delimiter //
create procedure inforProducts()
	begin 
		select * from Products;
	end //
delimiter ;
    
delimiter //
create procedure addNewProduct(id1 int, productCode1 int, productName1 varchar(50), productPrice1 int, productAmount1 int, productDescription1 varchar(100), productStatus1 varchar(100))
	begin 
		insert into products(id, productCode, productName, productPrice, productAmount, productDescription, productStatus)
			values (id1, productCode1, productName1, productPrice1, productAmount1, productDescription1, productStatus1);
	end //
delimiter ;

delimiter // 
create procedure editProduct(id1 int, productCode1 int, productName1 varchar(50), productPrice1 int, productAmount1 int, productDescription1 varchar(100), productStatus1 varchar(100))
	begin 
		update products
        set products. id = id1, products.productCode = productCode1, products.productName = productName1, products.productPrice = productPrice1, products.productAmount =  productAmount1, products.productDescription = productDescription1, products.productStatus = productStatus1
        where products.id = id1;
	end //
delimiter ;
    
-- call inforProducts();
-- call addNewProduct(12, 21, "andf", 43, 54, "afdsdf", "bvb"); 

delimiter //
create procedure deleted(id1 int)
	begin
		delete from products 
        where products.id = id1;
	end //
delimiter ;

    
    
    
    


