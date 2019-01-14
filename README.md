download,install zookeeper and start zookeeper
edit zookeeper's server port in /conf/zoo.cfg, for example 2182, the default is 2181.
cd /bin
cmd
run zkServer.cmd

make sure dubbo provider's server port is diffrent from dubbo consumer'server port in your local environment
for example one is 8081 ,the other one is 8082.

download and start dubbo-admin
https://github.com/apache/incubator-dubbo
click branches
select 2.6.x
then select tag
remember the tag should less than 2.6.1, for after the version of 2.6.1, they remove dubbo admin.

edit dubbo-admin port ,for example 8083
edit dubbo-admin's zookeeper adress
then start dubbo-admin by tomcat
the dubbo-admin adress is http://localhost:8083/dubbo-admin/