#!/usr/bin/env bash

docker run -it --rm --link exchange-rate-postgres:exchange-rate-postgres -e DS_HST='exchange-rate-postgres' -e DS_DBN='exrt' -e DS_USR='exrt_dba' -e DS_PWD='exrt.super' -p 8080:8080 xorhim/exchange-rate-application
