# Derived from official mysql image (our base image)
FROM mysql
# Source to create this file
# https://medium.com/@lvthillo/customize-your-mysql-database-in-docker-723ffd59d8fb

# Add a database
ENV MYSQL_DATABASE listavip
ENV MYSQL_ROOT_PASSWORD root

# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/

