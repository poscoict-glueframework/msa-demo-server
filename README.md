# ���� �ҽ�

* [demo server](https://github.com/poscoict-glueframework/msa-demo-server.git)
* [config ����](https://github.com/poscoict-glueframework/template-config.git)
* [����ũ�μ��� ���� : sample-api](https://github.com/poscoict-glueframework/msa-sample.git)
* [����ũ�μ��� ���� : second-api](https://github.com/poscoict-glueframework/template-config.git)

```
git clone https://github.com/poscoict-glueframework/msa-demo-server.git demo
git clone https://github.com/poscoict-glueframework/msa-sample.git sample
git clone https://github.com/poscoict-glueframework/msa-second.git second
git clone https://github.com/poscoict-glueframework/template-config.git config
```

# demo server

demo ���� config server, eureka server, zuul proxy ���ð� �ֽ��ϴ�. 

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

## Ȯ��

sample-api, second-api �� zuul�� ���� ������� �Ͼ��.  

```
http://localhost:8888/zuul-server/local
http://localhost:8888/zuul-server/vdi
http://localhost:8761/
http://localhost:8080/sample-api/sample
http://localhost:8080/second-api/adapter/second?name=2nd
```

����(VDI) ���������� ����� ���, ������ ���� ��Ʈ�� �Ҵ��Ѵ�.

* 8888 : config server���� ���
* 8761 : eureka(Service Registry/Descovery) ���
* 8080 : zuul(API Gateway) ���
* 9080(8180) : ����ũ�μ���(sample-api)���� ���
* 9180(8280) : ����ũ�μ���(second-api)���� ���
