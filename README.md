# Lista Vip

## Projeto Aula em construção

### Create your Docker image:
<p>docker build -t *image name* .</p>
<p>And start your MySQL container from the image:</p>
<p>docker run -d -p 3306:3306 --name *image name* *image name*
<p>Now we can verify. We will exec inside the container:</p>
### Exec image
<p>docker exec -it *image name* bash</p>
<p>root@c86ff80d7524:/# mysql -uroot -p</p>
Enter password: (root)
### Commands line mysql
> show databases;
> use *database name*;
> show tables;
> show columns from *table name*;
