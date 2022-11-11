def call (String NOMBRE, CONTADOR){
        catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS', catchInterruptions: true) {
        timeout(time: 15, unit: 'SECONDS') {
            script = input(message: 'Elige el script a ejecutar',
                parameters: [
                [$class : 'ChoiceParameterDefinition',
                choices: ["Script Contador", "Script Nombre"].join('\n'),
                default: "Script Contador",
                name   : 'Please, choose selection']
            ])
        }
    }
    
    switch(script) {
        case "Script Contador":
            sh "ls"
            sh "bash script1.sh $CONTADOR"
        break
        case "Script Nombre":
            """sh bash script2.sh "$NOMBRE" """
        break
    }
    return script

}