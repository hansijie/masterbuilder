def projectName = 'pipelinedemo'
def gitUrl = 'https://github.com/hansijie/masterbuilder.git'
def packageS3 = 's3://sijiehanbucket/masterbuilder'
def gitRepoName = gitUrl.substring(gitUrl.lastIndexOf('/') + 1)[0..-5]
def gitCred = '7034011d2c321b57ddcec1a6287a67f6e88cf997'

pipeline {
    agent { label "ecs-cloud" }
    stages {
        stage('Git Clone') {
            steps {
                script {
                    git credentialsId: "${gitCred}", url: "${gitUrl}"
                }
            }
        }
        stage('Build Deploy Package') {
            steps {
                script {
                    sh "echo build pkg"
                }
            }
        }
        stage('Upload Package') {
            steps {
                script {
                    sh "echo upload"
                }
            }
        }
        stage("Deploy to DEV") {
            steps {
                script {
                    sh "echo deploy"
                }
            }
        }
    }
}
