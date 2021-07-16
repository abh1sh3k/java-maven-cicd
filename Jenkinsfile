pipeline {
  agent { label 'docker-java-slave' }

  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/abh1sh3k/java-maven-cicd.git', branch: 'main')
      }
    }

    stage('build') {
      steps {
        sh "mvn clean package"
        script {
          app = docker.build("abh1sh3k/sampleapp")
        }
      }
    }

    stage('Push Image') {
      steps {
        script {
          withDockerRegistry(credentialsId: 'docker', url: 'https://index.docker.io/v1/') {
            app.push("${env.BUILD_NUMBER}")            
            app.push("latest")
          }
        }
      }
    }
  }
}