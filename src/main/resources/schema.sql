
    drop table IF EXISTS address;

    drop table IF EXISTS customer;

    drop table IF EXISTS orders;
    
     create table customer (
        customer_id INT PRIMARY KEY     NOT NULL,
        email_id varchar(30),
        first_name varchar(20) not null,
        last_name varchar(20) not null,
        phone_number varchar(15)
    );

    create table address (
        address_id INT PRIMARY KEY     NOT NULL,
        address_line1 varchar(30),
        address_line2 varchar(30),
        city varchar(30),
        country varchar(30),
        notes varchar(200),
        state varchar(30),
        zip_code varchar(15),
        customer_id_fk INT references customer(customer_id)
    );

   

    create table orders (
        order_id INT PRIMARY KEY     NOT NULL,
        delivery_date time,
        notes varchar(200),
        order_date date not null,
        status varchar(20) not null
    );

 
