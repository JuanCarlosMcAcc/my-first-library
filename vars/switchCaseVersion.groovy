def call(String entorno){
    def resultado = new StringBuilder()
    def comando = "grep ${entorno} release.yml".execute() 
    echo "La version es ${comando}"
    // sh ("grep ${entorno} release.yml")
}