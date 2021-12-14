CREATE DATABASE "prestiti" OWNER mongodb;
\connect prestiti
ALTER DATABASE "prestiti" SET TIMEZONE TO 'Europe/Rome';
SET TIMEZONE TO 'Europe/Rome';

CREATE TABLE "prestiti"
(
    order_id integer,
    customer_id character varying,
    notify_to_phone_nr character varying
) TABLESPACE pg_default;

ALTER TABLE "prestiti"
    OWNER to mongodb;
