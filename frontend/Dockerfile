FROM node:16-alpine3.11 as builder
WORKDIR /app
COPY ./app /app
RUN npm install && npm run build
FROM nginx:alpine
ADD nginx-default.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /app/dist/frontend /usr/share/nginx/html
