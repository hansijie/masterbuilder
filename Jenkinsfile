#!groovy 

node {
   agent { label "ecs-cloud" }
   stage 'Checkout'
        checkout scm

   stage 'Setup env'
        sh 'echo setup'

   stage 'Build Deploy Package'
        sh 'echo build pkg'

   stage 'Upload Package'
        sh 'echo upload'

   stage 'Deploy to Test'
        sh 'echo deploy to Test'
}
