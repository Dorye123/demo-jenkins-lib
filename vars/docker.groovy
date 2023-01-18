def build(String imageName) {
    sh "docker build -t ${imageName} . "
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

