// This is a demo pipeline that will build an image and push it using the steps we created in the shared library

def call() {
    pipeline {
        agent any
        parameters {
            string(name: "IMAGENAME", defaultValue: "", description: "Enter image name.")
            string(name: "REGISTRYNAME", defaultValue: "", description: "Enter registry name.")
        }
        stages {
            stage ("build and push image") {
                steps {
                    script {
                        def FULLNAME = params.REGISTRYNAME + "/" + IMAGENAME
                        docker.build(FULLNAME) // build image
                        docker.push(FULLNAME) // push image
                        docker.remove(FULLNAME) // to remove image from agent 
                    } //script
                }// steps
            }// stage
        } // stages
    } // pipeline
} // def call