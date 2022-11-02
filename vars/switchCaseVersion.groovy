def call(String entorno){
    // def resultado = new StringBuilder()
    // resultado = sh("grep ${entorno} release.yml")
    // echo "La version es " | sh("grep ${entorno} release.yml")
    // def resultado = sh ("grep ${entorno} release.yml")
    def resultado = sh(returnStdout: true, script: """ grep ${entorno} release.yml """)
    echo "La version es ${resultado} "
}