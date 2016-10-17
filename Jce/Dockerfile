# docker build -t spelchec/test-enc-in-java .
FROM openjdk:6

ENTRYPOINT ["check"]
CMD ["384"]

ADD JceLook.java /
ADD JceLook.sh /
RUN apt-get -y update
RUN apt-get -y install vim dos2unix
RUN dos2unix JceLook.sh JceLook.sh
RUN /JceLook.sh
# docker run -ti spelchec/test-enc-in-java
# > grep 384 results.txt
RUN echo /results.txt