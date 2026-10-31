# StockTrading

docker run -d \
--name postgres-spring-boot \
-e POSTGRES_DB=trading_db \
-e POSTGRES_USER=postgres \
-e POSTGRES_PASSWORD=postgres \
-p 5432:5432 \
-v pgdata:/var/lib/postgresql/data \
postgres:16-alpine

swagger url
http://localhost:8080/swagger-ui/index.html
