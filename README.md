# Listavip

Create your Docker image:

docker build -t <image name> .

And start your MySQL container from the image:

docker run -d -p 3306:3306 --name <image name> <image name>

Now we can verify. We will exec inside the container:

docker exec -it <image name> bash

root@c86ff80d7524:/# mysql -uroot -p
Enter password: (root)

mysql> show databases;
mysql> use <database name>;
mysql> show tables;
mysql> show columns from <table name>;