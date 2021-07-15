pipeline {
  agent { label 'docker-java-slave' }

  }
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/abh1sh3k/java-maven-cicd.git', branch: 'main')
      }
    }

  }
}