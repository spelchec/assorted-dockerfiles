# docker build -t spelchec/ansible .
FROM centos:7
MAINTAINER Tom Olson
RUN yum -y update
RUN rpm -iUvh http://dl.fedoraproject.org/pub/epel/7/x86_64/e/epel-release-7-8.noarch.rpm
RUN yum -y install ansible openssh-server
RUN ssh-keygen -f /root/.ssh/id_rsa -P phrase
# creates a public and private key.

# docker run -ti --name ansible spelchec/ansible