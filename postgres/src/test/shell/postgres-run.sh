#!/usr/bin/env bash

docker run --rm --name exchange-rate-postgres -e POSTGRES_PASSWORD='super123456' -p 15432:5432 xorhim/exchange-rate-postgres
