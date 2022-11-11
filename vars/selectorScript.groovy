def call (NOMBRE, CONTADOR){
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
            sh "ls"
            sh "bash script1.sh $CONTADOR"
        break
        case "Script Nombre":
            sh 'bash script2.sh $NOMBRE '
        break
    }
    return script

}