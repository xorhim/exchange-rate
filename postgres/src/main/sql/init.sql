create database exrt;

create user exrt_dba with password 'exrt.super';
grant all privileges on database exrt to exrt_dba;

\connect exrt exrt_dba;

create table currency (
  currency_code varchar(10) not null,
  name varchar(100) not null
);

create table exchange_rate (
  exchange_rate_id bigserial not null,
  source_currency_code varchar(10) not null,
  target_currency_code varchar(10) not null,
  rate numeric(15, 4) not null,
  valid_since timestamp not null
);

alter table currency add constraint pk_currency primary key (currency_code);
alter table exchange_rate add constraint pk_currency_exchange primary key (exchange_rate_id);

alter table exchange_rate add constraint fk_exchange_rate_src_currency foreign key (source_currency_code) references currency (currency_code);
alter table exchange_rate add constraint fk_exchange_rate_tgt_currency foreign key (target_currency_code) references currency (currency_code);

insert into currency (currency_code, name) values ('RUB', 'Russian Ruble');
insert into currency (currency_code, name) values ('USD', 'United States Dollar');
insert into currency (currency_code, name) values ('GBP', 'British Pound');

insert into exchange_rate (source_currency_code, target_currency_code, rate, valid_since)
    values ('USD', 'RUB', 63.0399, localtimestamp);
insert into exchange_rate (source_currency_code, target_currency_code, rate, valid_since)
    values ('GBP', 'RUB', 77.1734, localtimestamp);
