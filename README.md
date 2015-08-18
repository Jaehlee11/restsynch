-------------------------------- 
Open Java Rest synch project
----------------------------

1. About
----------
This project is a base framework to do RESTful Web Services to integrate distributed applications.
It uses JSON to handle request and response messages and support uniform interface, PUT, GET, POST, and DELETE.
For repository, it define Repository Interfaces extended CrudRepository as Spring Data repository abstraction. 
The query is derived from the method mane. It doesn't use a manually defined query. 

This project is implemented with SPRING-BOOT, JPA/HIBERNATE, and HSQLDB by MAVEN 
	SPRING-BOOT-1.2.5.RELEASE as Parent
	JRE 1.8

2. Directory layout
---------------------
/restsysnch
	+----------/src
                  +---/main
                          +/java : Java code
                               +---/lab
                                      +---/jaehlee11
                                                 +---/net
                                                        +---/restsynch               : An application class
                                                                 +------/domain      : Entity classes 
                                                                 +------/repository  : Repository interfaces 
                                                                 +------/service     : Service interfaces and implement classes 
                                                                 +------/web         : Controller classes 
                  +---/test
                          +/java : Java code to do unit tests
	+----------/porm.xml
	+----------/README.md

