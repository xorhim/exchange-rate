#!/bin/sh

set -e

CMD="$@"
echo ${CMD}

PGPASSWORD=${DS_PWD}

until psql -h ${DS_HST} -U ${DS_USR} -c '\l' ${DS_DBN}; do
  >&2 echo "Postgres is unavailable - sleeping"
  sleep 1
done

>&2 echo "Postgres is up"
