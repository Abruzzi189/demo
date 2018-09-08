use demoGit;

create table LOGIN_INFOR(
	id int primary key identity(1,1),
	account varchar(4000) not null,
	[password] varchar(4000) not null,
	[type] varchar(20) not null,
);

insert into LOGIN_INFOR values('khiemnb','12345678','admin');

insert into LOGIN_INFOR values('thoanvv','12345678','admin');

select * from LOGIN_INFOR where LOWER(account) like '%nb%';
