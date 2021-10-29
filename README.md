# spring-angular-nginx-traefik-docker-starter
spring-angular-nginx-traefik-docker-starter
Installation
install docker

"docker compose up" in parent folder

when changing stuff "docker compose up --build" forces a rebuild docker compose down to stop

current problems: spring doesnt properly scan repository -> build error -> bean/component annotations

backend: http://backend.myproject.localhost/helloworld frontend: http://frontend.myproject.localhost/

to view logs -> docker logs containername beispielcontainername: docker-backend-1
