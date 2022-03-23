FROM postgres:9.6-alpine
ARG POSTGRES_USER
ARG POSTGRES_PASSWORD
ARG POSTGRES_DB

COPY init-schema.sql /docker-entrypoint-initdb.d/