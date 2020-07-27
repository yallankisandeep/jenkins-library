package org.common
class Utilities {
    static def throwError(script, error){
        script.echo "$error"
        throw new Exception("$error")
    }
    static def dockerBuild(script, message) {
        script.echo "$message"
        script.sh '''echo "docker build --force-rm -t jenkins/library -f Docker.sample ."
                     set +x
                     docker build --force-rm -t jenkins/library -f Docker.sample .'''
     }
 }
