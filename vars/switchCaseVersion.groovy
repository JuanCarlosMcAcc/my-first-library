def call(String entorno){   
    sh ("grep ${entorno} release.yml")
}