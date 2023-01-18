def call(String imageName, String dockerFilePath ) {
    sh "docker build -t ${imageName} -f ${dockerFilePath} . "
}