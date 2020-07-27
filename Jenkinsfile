@Library('utils') _
pipeline {
    agent none
    stages {
        stage ('Example') {
            steps {
                // log.info 'Starting' 
                script { 
                    sayHello 'dockerBuild'
                }
            }
        }
    }
}
