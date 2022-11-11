def call (){
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
            script = "script1.sh 12"
        break
        case "Script Nombre":
            script = "script2.sh JuanCarlos"
        break
    }
    return script

}