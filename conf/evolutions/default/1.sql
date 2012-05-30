# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table testimonial (
  id                        bigint auto_increment not null,
  quote                     varchar(255),
  name                      varchar(255),
  location                  varchar(255),
  dt_created                datetime,
  dt_last_modified          datetime,
  constraint pk_testimonial primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table testimonial;

SET FOREIGN_KEY_CHECKS=1;

