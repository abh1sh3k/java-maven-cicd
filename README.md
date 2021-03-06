# java-maven-cicd

Environment: Ubuntu 20.04

Git and Maven should be pre-installed.

Docker

1. Install Docker [Follow link: hhttps://docs.docker.com/engine/install/ubuntu/]
2. Install docker-compose [Follow link: https://docs.docker.com/compose/install/]

Jenkins-Sonarqube Configurations:

1. Inside jenkins-sonarqube folder execute following commands:
    
    mkdir -p jenkins-data postgres-data sonar-data sonar-extensions
    chmod 777 ${USER}:${USER} *

2. Increase virtual memory count for elastic search in sonarqube container
    
    echo "vm.max_map_count=262144" >> /etc/sysctl.conf

3. Open new shell to reload the configurations


Jenkins

1. Install Blue Ocean, Docker and Docker API plugins

Enable docker remote API

1. Edit the file /lib/systemd/system/docker.service

    sudo vi /lib/systemd/system/docker.service

2. Modify the line that starts with ExecStart to look like this:

    ExecStart=/usr/bin/docker daemon -H fd:// -H tcp://0.0.0.0:4243

3. Save the modified file.

4. Make sure the Docker service notices the modified configuration:

    systemctl daemon-reload

5. Restart the docker service

    sudo service docker restart

6. Test that the Docker API is indeed accessible:

    curl http://localhost:4243/version

