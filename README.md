# Lista Vip

## Create your Docker image:

**On directory src/main/resource:** 
```docker build -t your_image_name .```

**And start your MySQL container from the image:**
```docker run -d -p 3306:3306 --name your_container_name your_image_name```

**Now we can verify. We will exec inside the container:**

```docker exec -it your_container_name bash```
root@c86ff80d7524:/# mysql -uroot -p
Enter password: **root**

**Commands line mysql**
```
show databases;
use listavip;
show tables;
show columns from convidado;
```
