def call(String entorno){
    // def resultado = new StringBuilder()
    // resultado = sh("grep ${entorno} release.yml")
    echo "La version es " sh("grep ${entorno} release.yml")
    // sh ("grep ${entorno} release.yml")
}