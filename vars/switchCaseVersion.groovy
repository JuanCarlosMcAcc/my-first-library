def call(String entorno){   
    result = sh ("grep ${entorno} release.yml")
    echo result
}