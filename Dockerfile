FROM amazonlinux

##########################################################################################################
# Setup timezone
RUN echo ZONE="Asia/Shanghai" > /etc/sysconfig/clock && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "LANG="en_US.UTF-8"" > /etc/sysconfig/i18n
ENV LANG en_US.UTF-8

# Install jdk-8u131
COPY jdk-8u131-linux-x64.rpm /root/
RUN rpm -ivh /root/jdk-8u131-linux-x64.rpm && yum remove -y java-1.7.0-openjdk && mkdir -p /usr/local/helloworld/
ENV JAVA_HOME /usr/java/jdk1.8.0_131

COPY helloworld-versionbereplaced-master.jar /usr/local/helloworld/
ENTRYPOINT java -cp /usr/local/helloworld/helloworld-versionbereplaced-master.jar hello.HelloWorld
