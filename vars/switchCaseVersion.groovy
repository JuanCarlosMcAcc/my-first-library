def call(String entorno){
    // def resultado = new StringBuilder()
    resultado = sh ("grep ${entorno} release.yml")
    echo "La version es ${resultado}"
    // sh ("grep ${entorno} release.yml")
}