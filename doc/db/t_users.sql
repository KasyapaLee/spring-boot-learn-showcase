DROP TABLE IF EXISTS `users`;
CREATE TABLE `t_users`
(
  `id`       bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name`     varchar(32) DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `age`      int         DEFAULT NULL comment '年龄',
  `email`    varchar(32)  DEFAULT NULL comment '邮箱',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

insert into t_users (id, name, password, age, email) VALUES (1, 'lgq1', '123', 20, 'lgq1@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (2, 'lgq2', '123', 20, 'lgq2@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (3, 'lgq3', '123', 20, 'lgq3@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (4, 'lgq4', '123', 20, 'lgq4@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (5, 'lgq5', '123', 20, 'lgq5@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (6, 'lgq6', '123', 20, 'lgq6@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (7, 'lgq7', '123', 20, 'lgq7@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (8, 'lgq8', '123', 20, 'lgq8@gmail.com');
insert into t_users (id, name, password, age, email) VALUES (9, 'lgq9', '123', 20, 'lgq9@gmail.com');
