# Master Microservices with Spring Boot, Docker, Kubernetes

![Course Image](image.png)

[Dom's notes on Perplexity](https://www.perplexity.ai/page/Java-Spring-Boot-SsnFh73ZQRyOwrXuPlu2WA)

Learn how to create enterprise and production ready Microservices with Spring, Spring Cloud, Docker and Kubernetes.

## Topics covered in the course
* Section 1 - Introduction to Microservices Architecture
* Section 2- Building microservices using Spring Boot
* Section 3 - How do we right size our microservices & identify boundaries
* Section 4 - Handle deployment, portability &  scalability of microservices using Docker
* Section 5 - Deep Dive on Cloud Native Apps & 15-Factor methodology
* Section 6 - Configurations Management in Microservices
* Section 7 - Using MySQL DBs inside microservices
* Section 8 - Service Discovery & Service Registration in microservices
* Section 9 - Gateway, Routing & Cross cutting concerns in Microservices
* Section 10 - Making Microservices Resilient
* Section 11 - Observability and monitoring of microservices
* Section 12 - Microservices Security
* Section 13 - Event Driven microservices using RabbitMQ,Spring Cloud Functions & Stream
* Section 14 - Event Driven microservices using Kafka,Spring Cloud Functions & Stream
* Section 15 - Container Orchestration using Kubernetes
* Section 16 - Deep dive on Helm
* Section 17 - Server-side service discovery and load balancing using Kubernetes
* Section 18 - Deploying microservices into cloud K8s cluster
* Section 19 - Introduction to K8s Ingress, Service Mesh (Istio) & mTLS
* Section 20 - Congratulations & Thank You

## Prerequisite for the course
- Good understanding on Java and Spring concepts
- Basic understanding on SpringBoot & REST services is a bonus but not mandatory
- Interest to learn and explore about Microservices

# Important Links
- Spring Boot - https://spring.io/projects/spring-boot
- Create SpringBoot project - https://start.spring.io
- DTO pattern blog - https://martinfowler.com/eaaCatalog/dataTransferObject.html
- Model Mapper - http://modelmapper.org/
- Map Struct - https://mapstruct.org/
- Spring Doc - https://springdoc.org/
- Open API - https://www.openapis.org/
- Lucidchart Blog - https://www.lucidchart.com/blog/ddd-event-storming
- Docker website - https://www.docker.com
- Docker hub website - https://hub.docker.com
- Buildpacks website - https://buildpacks.io
- Google Jib website - https://github.com/GoogleContainerTools/jib
- Docker compose website - https://docs.docker.com/compose/
- Twelve-Factor methodology - https://12factor.net
- Beyond the Twelve-Factor App book - https://www.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631/
- Spring Cloud website - https://spring.io/projects/spring-cloud
- Spring Cloud Config website - https://spring.io/projects/spring-cloud-config
- Spring Cloud Bus website - https://spring.io/projects/spring-cloud-bus
- RabbitMQ website - https://www.rabbitmq.com
- Hookdeck website- https://hookdeck.com
- Spring Cloud Netflix website - https://spring.io/projects/spring-cloud-netflix
- Spring Cloud OpenFeign - https://spring.io/projects/spring-cloud-openfeign
- Netflix Blog - https://netflixtechblog.com/netflix-oss-and-spring-boot-coming-full-circle-4855947713a0
- Resilience4j website - https://resilience4j.readme.io
- Spring Cloud Gateway website - https://spring.io/projects/spring-cloud-gateway
- Stripe RateLimitter pattern blog - https://stripe.com/blog/rate-limiters
- Apache Benchmark website - https://httpd.apache.org
- Grafana website - https://grafana.com
- Grafana Loki setup - https://grafana.com/docs/loki/latest/get-started/quick-start/
- Micrometer website - https://micrometer.io
- Prometheus website - https://prometheus.io/
- Grafana Dashboards - https://grafana.com/grafana/dashboards/
- OpenTelemetry website - https://opentelemetry.io/
- OpenTelemetry automatic instrumentation - https://opentelemetry.io/docs/instrumentation/java/automatic/
- Keycloak website - https://www.keycloak.org/
- Apache Kafka website - https://kafka.apache.org
- Docker compose file for Kafka - https://github.com/bitnami/containers/blob/main/bitnami/kafka/docker-compose.yml
- Local Kubernetes Cluster with Docker Desktop - https://docs.docker.com/desktop/kubernetes/
- Kubernetes Dashboard - https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/
- Helm website - https://helm.sh
- Chocolatey website - https://chocolatey.org/
- Bitnami Helm charts GitHub repo - https://github.com/bitnami/charts
- Spring Cloud Kubernetes website - https://spring.io/projects/spring-cloud-kubernetes
- Spring Cloud Kubernetes Blog - https://spring.io/blog/2021/10/26/new-features-for-spring-cloud-kubernetes-in-spring-cloud-2021-0-0-m3
- GCP website - https://cloud.google.com
- GCP SDK installation - https://cloud.google.com/sdk/docs/install
- Kubernetes Ingress - https://kubernetes.io/docs/concepts/services-networking/ingress/
- Ingress Controllers - https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/
- Istio (Service mesh) - https://istio.io


## Maven Commands used in the course

| Maven Command                              | Description                                                     |
| ------------------------------------------ | --------------------------------------------------------------- |
| `mvn clean install -Dmaven.test.skip=true` | Generate a jar inside target folder                             |
| `mvn spring-boot:run`                      | Start a springboot maven project                                |
| `mvn spring-boot:build-image`              | Generate a docker image using Buildpacks. No need of Dockerfile |
| `mvn compile jib:dockerBuild`              | Generate a docker image using Google Jib. No need of Dockerfile |

## Docker Commands used in the course

| Docker Command                                                                                                                | Description                                                    |
| ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------- |
| `docker build . -t polyglotdev/accounts:s4`                                                                                   | Generate a docker image based on a Dockerfile                  |
| `docker run  -p 8080:8080 polyglotdev/accounts:s4`                                                                            | Start a docker container based on a given image                |
| `docker images`                                                                                                               | List all the docker images present in the Docker server        |
| `docker image inspect image-id`                                                                                               | Display detailed image information for a given image id        |
| `docker image rm image-id`                                                                                                    | Remove one or more images for a given image ids                |
| `docker image push docker.io/polyglotdev/accounts:s4`                                                                         | Push an image or a repository to a registry                    |
| `docker image pull docker.io/polyglotdev/accounts:s4`                                                                         | Pull an image or a repository from a registry                  |
| `docker ps`                                                                                                                   | Show all running containers                                    |
| `docker ps -a`                                                                                                                | Show all containers including running and stopped              |
| `docker container start container-id`                                                                                         | Start one or more stopped containers                           |
| `docker container pause container-id`                                                                                         | Pause all processes within one or more containers              |
| `docker container unpause container-id`                                                                                       | Unpause all processes within one or more containers            |
| `docker container stop container-id`                                                                                          | Stop one or more running containers                            |
| `docker container kill container-id`                                                                                          | Kill one or more running containers instantly                  |
| `docker container restart container-id`                                                                                       | Restart one or more containers                                 |
| `docker container inspect container-id`                                                                                       | Inspect all the details for a given container id               |
| `docker container logs container-id`                                                                                          | Fetch the logs of a given container id                         |
| `docker container logs -f container-id`                                                                                       | Follow log output of a given container id                      |
| `docker container rm container-id`                                                                                            | Remove one or more containers based on container ids           |
| `docker container prune`                                                                                                      | Remove all stopped containers                                  |
| `docker compose up`                                                                                                           | Create and start containers based on given docker compose file |
| `docker compose down`                                                                                                         | Stop and remove containers                                     |
| `docker compose start`                                                                                                        | Start containers based on given docker compose file            |
| `docker compose down`                                                                                                         | Stop the running containers                                    |
| `docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql`                 | Create a MySQL DB container                                    |
| `docker run -p 6379:6379 --name polyglot-redis -d redis`                                                                      | Create a Redis Container                                       |
| `docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.3 start-dev` | Create Keycloak Container                                      |


## Apache Benchmark command used in the course

| Apache Benchmark command                                                   | Description                                        |
| -------------------------------------------------------------------------- | -------------------------------------------------- |
| `ab -n 10 -c 2 -v 3 http://localhost:8072/eazybank/cards/api/contact-info` | Perform load testing on API by sending 10 requests |

## Kubernetes Commands used in the course

| Kubernetes Command                                                                                           | Description                                                       |
| ------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------- |
| `kubectl apply -f filename`                                                                                  | Create a deployment/service/configmap based on a given YAML file  |
| `kubectl get all`                                                                                            | Get all the components inside your cluster                        |
| `kubectl get pods`                                                                                           | Get all the pods details inside your cluster                      |
| `kubectl get pod pod-id`                                                                                     | Get the details of a given pod id                                 |
| `kubectl describe pod pod-id`                                                                                | Get more details of a given pod id                                |
| `kubectl delete pod pod-id`                                                                                  | Delete a given pod from cluster                                   |
| `kubectl get services`                                                                                       | Get all the services details inside your cluster                  |
| `kubectl get service service-id`                                                                             | Get the details of a given service id                             |
| `kubectl describe service service-id`                                                                        | Get more details of a given service id                            |
| `kubectl get nodes`                                                                                          | Get all the node details inside your cluster                      |
| `kubectl get node node-id`                                                                                   | Get the details of a given node                                   |
| `kubectl get replicasets`                                                                                    | Get all the replica sets details inside your cluster              |
| `kubectl get replicaset replicaset-id`                                                                       | Get the details of a given replicaset                             |
| `kubectl get deployments`                                                                                    | Get all the deployments details inside your cluster               |
| `kubectl get deployment deployment-id`                                                                       | Get the details of a given deployment                             |
| `kubectl get configmaps`                                                                                     | Get all the configmap details inside your cluster                 |
| `kubectl get configmap configmap-id`                                                                         | Get the details of a given configmap                              |
| `kubectl get events --sort-by=.metadata.creationTimestamp`                                                   | Get all the events occurred inside your cluster                   |
| `kubectl scale deployment accounts-deployment --replicas=1`                                                  | Set the number of replicas for a deployment inside your cluster   |
| `kubectl set image deployment gatewayserver-deployment gatewayserver=polyglotdev/gatewayserver:s11 --record` | Set a new image for a deployment inside your cluster              |
| `kubectl rollout history deployment gatewayserver-deployment`                                                | Know the rollout history for a deployment inside your cluster     |
| `kubectl rollout undo deployment gatewayserver-deployment --to-revision=1`                                   | Rollback to a given revision for a deployment inside your cluster |
| `kubectl get pvc`                                                                                            | List the pvcs inside your cluster                                 |
| `kubectl delete pvc data-happy-panda-mariadb-0`                                                              | Delete a pvc inside your cluster                                  |

## Helm Commands used in the course

| Helm Command                      | Description                                                    |
| --------------------------------- | -------------------------------------------------------------- |
| `helm create [NAME]`              | Create a default chart with the given name                     |
| `helm dependencies build`         | To recompile the given helm chart                              |
| `helm install [NAME] [CHART]`     | Install the given helm chart into K8s cluster                  |
| `helm upgrade [NAME] [CHART]`     | Upgrades a specified release to a new version of a chart       |
| `helm history [NAME]`             | Display historical revisions for a given release               |
| `helm rollback [NAME] [REVISION]` | Roll back a release to a previous revision                     |
| `helm uninstall [NAME]`           | Uninstall all of the resources associated with a given release |
| `helm template [NAME] [CHART]`    | Render chart templates locally along with the values           |
| `helm list`                       | Lists all of the helm releases inside a K8s cluster            |
