

Dockerfile setup of Ansible is established based on the instructions at:
https://www.liquidweb.com/kb/how-to-install-ansible-on-centos-7-via-yum/

The following is for a base application running through Ansible, running initially based on the instructions:
http://atpras.blogspot.com/2014/02/ansible-hello-world.html

Prerequisites

There should be an ubuntu instance running on post 192.168.0.1 (configured in the host.yml file)

# On Ubuntu box:

adduser ansible
sudo apt-get install -y ssh
