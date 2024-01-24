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
                fileExists 'Jenkinsfile'
            }
        }
    }
}
