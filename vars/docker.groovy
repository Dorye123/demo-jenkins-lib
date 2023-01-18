def build(String imageName, String dockerFilePath ) {
    sh "docker build -t ${imageName} -f ${dockerFilePath} . "
}

def push(String imageName) {
    sh "docker push ${imageName} "
}

def remove(String imageName) {
    sh "docker rmi ${imageName} "
}

def tag(String sourceImageName, String targetImageName) {
    sh "docker tag ${sourceImageName} ${targetImageName} "
}

