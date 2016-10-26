docker build -t spelchec/ansible .
# docker run -ti --name ansible spelchec/ansible
# docker start ansible
docker cp ansible:/root/.ssh/id_rsa.pub .

# docker network inspect bridge

