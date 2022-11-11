def call (String NOMBRE, Int CONTADOR){
        catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS', catchInterruptions: true) {
        timeout(time: 2, unit: 'MINUTES') {
            script = input(message: 'Elige el script a ejecutar',
                parameters: [
                [$class : 'ChoiceParameterDefinition',
                choices: ["Script Contador", "Script Nombre"].join('\n'),
                name   : 'Please, choose selection']
            ])
        }
    }
    
    switch(script) {
        case "Script Contador":
            sh "script1.sh $CONTADOR"
        break
        case "Script Nombre":
            sh "script2.sh $NOMBRE"
        break
    }
    return script

}