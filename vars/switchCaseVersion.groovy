def call(String entorno){

    def resultado = sh(returnStdout: true, script: """ grep ${entorno} release.yml """)
    // echo "La version es ${resultado} "
    echo "La version APP_JAVA-${entorno} es ${resultado}"


}