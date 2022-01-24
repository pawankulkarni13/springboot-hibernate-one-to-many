drop table if exists student;
drop table if exists club;
drop table if exists club_registry;
create table if not exists student (
                         s_id int PRIMARY KEY AUTO_INCREMENT,
                         s_name varchar(20) NOT NULL,
                         s_class varchar(20)
);

create table if not exists club (
                      c_id int PRIMARY KEY AUTO_INCREMENT,
                      c_name varchar(40) NOT NULL
);

create table if not exists club_registry (
                               reg_id int PRIMARY KEY AUTO_INCREMENT,
                               s_id int,
                               c_id int,
                               FOREIGN KEY (s_id) REFERENCES student(s_id),
                               FOREIGN KEY (c_id) REFERENCES club(c_id)
);
commit;

insert into club (c_id, c_name) values (1, 'Cricket Club');
insert into club (c_id, c_name) values (2, 'Science Club');
insert into club (c_id, c_name) values (3, 'Football Club');
insert into club (c_id, c_name) values (4, 'Badminton Club');

insert into student (s_id, s_name, s_class) values (1, 'Pawan', 'ISE');
insert into student (s_id, s_name, s_class) values (2, 'Naveen', 'ECE');
insert into student (s_id, s_name, s_class) values (3, 'Sandeep', 'ISE');
insert into student (s_id, s_name, s_class) values (4, 'Chinya', 'CSE');

insert into club_registry (reg_id, s_id, c_id) values (1, 1, 1);
insert into club_registry (reg_id, s_id, c_id) values (2, 1, 2);
insert into club_registry (reg_id, s_id, c_id) values (3, 2, 1);
insert into club_registry (reg_id, s_id, c_id) values (4, 2, 2);
insert into club_registry (reg_id, s_id, c_id) values (5, 2, 3);
insert into club_registry (reg_id, s_id, c_id) values (6, 2, 4);
insert into club_registry (reg_id, s_id, c_id) values (7, 4, 1);
commit;