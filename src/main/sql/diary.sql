create database diary;

use diary;

create table users (
  id int primary key not null auto_increment ,
  name varchar(32) comment '用户名',
  nick_name varchar(128) comment '昵称',
  email varchar(128) not null comment '邮箱',
  password varchar(20)
);

CREATE TABLE diaries (
  id int primary key not null auto_increment ,
  content varchar(140) comment '日记内容',
  user_id int not null comment '用户Id',
  created datetime comment '创建日期'
);