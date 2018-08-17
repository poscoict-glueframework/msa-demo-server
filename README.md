# 관련 소스

* [demo server](https://github.com/poscoict-glueframework/msa-demo-server.git)
* [config 관리](https://github.com/poscoict-glueframework/template-config.git)
* [마이크로서비스 예제 : sample-api](https://github.com/poscoict-glueframework/msa-sample.git)
* [마이크로서비스 예제 : second-api](https://github.com/poscoict-glueframework/template-config.git)

```
git clone https://github.com/poscoict-glueframework/msa-demo-server.git demo
git clone https://github.com/poscoict-glueframework/msa-sample.git sample
git clone https://github.com/poscoict-glueframework/msa-second.git second
git clone https://github.com/poscoict-glueframework/template-config.git config
```

# demo server

demo 에는 config server, eureka server, zuul proxy 예시가 있습니다. 

```
cd demo
mvn -Plocal clean install
java -jar demo-config-server/target/demo-config-server-0.0.2-SNAPSHOT.jar
```

```
cd second
mvn -Plocal clean install
java -jar demo-eureka-server/target/demo-eureka-server-0.0.2-SNAPSHOT.jar
```

```
cd sample
mvn -Plocal clean install
java -jar demo-zuul-server/target/demo-zuul-server-0.0.2-SNAPSHOT.jar
```

## 확인

sample-api, second-api 는 zuul을 통해 라우팅이 일어난다.  

```
http://localhost:8888/zuul-server/local
http://localhost:8888/zuul-server/vdi
http://localhost:8761/
http://localhost:8080/sample-api/sample
http://localhost:8080/second-api/adapter/second?name=2nd
```

로컬(VDI) 프로파일이 적용된 경우, 다음과 같이 포트를 할당한다.

* 8888 : config server에서 사용
* 8761 : eureka(Service Registry/Descovery) 사용
* 8080 : zuul(API Gateway) 사용
* 9080(8180) : 마이크로서비스(sample-api)에서 사용
* 9180(8280) : 마이크로서비스(second-api)에서 사용
