pipeline {
  agent {
    docker {
      image 'abh1sh3k/jenkins-slave'
    }

  }
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/abh1sh3k/java-maven-cicd.git', branch: 'main')
      }
    }

  }
}