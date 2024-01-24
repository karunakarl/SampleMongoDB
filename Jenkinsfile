pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building jenkins pipeline...'
            }
        }
        stage('checking file'){
steps {
    script{
            if(fileExists('Jenkinsfile')) {
                echo "File  Jenkinsfile found!"
            }else{
                echo "File  Jenkinsfile found!"
            }
    }
            }
        }
    }
}
