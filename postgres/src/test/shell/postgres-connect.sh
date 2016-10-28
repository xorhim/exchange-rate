#!/usr/bin/env bash

docker run -it --rm --link exchange-rate-postgres:exchange-rate-postgres postgres psql -h exchange-rate-postgres -U exrt_dba exrt
