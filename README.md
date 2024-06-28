# hexagonal-api

Aplicação exemplo de Arquitetura Hexagonal/Ports and Adapters para fins de estudo.

## Fluxo Criado
![img.png](img.png)

## Stack utilizada

**Back-end:** JDK 17, Spring Boot 3.2.3, Maven, Docker, Mongo DB (Docker), Kafka (Docker)

## O que é Arquitetura Hexagonal?

Arquitetura Hexagonal, também conhecida como Ports and Adapters, é um padrão de design de software que visa criar componentes de software desacoplados e facilmente testáveis. Essa arquitetura prevê a divisão do sistema em camadas lógicas, com as regras de negócios no centro e os detalhes técnicos nas camadas externas.
![img_2.png](img_2.png)![](/Users/caiozin/Downloads/image-removebg-preview.png)

## Estrutura de Pastas
![img_1.png](img_1.png)![](/Users/caiozin/Downloads/folder-structure.png)

## Funcionalidades

- Cadastro de Clientes
- Edição de Clientes
- Listagem de Clientes
- Exclusão de Clientes
- API Externa para obter dados de endereço
- Kafka Consumer
- Kafka Producer

## Instalação

Instale o projeto e suas dependencias utilizando o comando maven:

```bash
  $ mvn clean install
```

## Rodando aplicação localmente

* Clone o repositório
* Certifique-se de usar JDK 17

Existem várias maneiras de executar uma aplicação Spring Boot localmente. Uma maneira é executar o método `main` na classe `com.codeline.hexagonal.HexagonalApplication` do seu IDE.

Depois que a aplicação for executada com sucesso, você deverá ver algo como:

```
2024-06-28T15:30:14.959-03:00  INFO 1957 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2024-06-28T15:30:14.968-03:00  INFO 1957 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-06-28T15:30:14.968-03:00  INFO 1957 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.24]
2024-06-28T15:30:15.011-03:00  INFO 1957 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-06-28T15:30:15.012-03:00  INFO 1957 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1081 ms
2024-06-28T15:30:15.143-03:00  INFO 1957 --- [           main] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "4.11.2"}, "os": {"type": "Darwin", "name": "Mac OS X", "architecture": "aarch64", "version": "14.5"}, "platform": "Java/Amazon.com Inc./17.0.11+9-LTS"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=MongoCredential{mechanism=null, userName='root', source='admin', password=<hidden>, mechanismProperties=<hidden>}, transportSettings=null, streamFactoryFactory=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@2921199d, com.mongodb.Jep395RecordCodecProvider@3d40a3b4, com.mongodb.KotlinCodecProvider@7f13811b]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[localhost:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null}
2024-06-28T15:30:15.182-03:00  INFO 1957 --- [localhost:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=21, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=21677833}
2024-06-28T15:30:15.798-03:00  INFO 1957 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path ''
```

A aplicação ficará disponível via localhost:8080