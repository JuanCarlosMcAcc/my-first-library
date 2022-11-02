def call(String entorno){
    def resultado = new StringBuilder()
    resultado = "grep ${entorno} release.yml".execute() 
    echo "La version es ${resultado}"
    // sh ("grep ${entorno} release.yml")
}