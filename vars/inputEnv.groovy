def call (String entorno){
    catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS', catchInterruptions: true) {
    timeout(time: 2, unit: 'MINUTES') {
        entorno = input(message: 'Elige el entorno de produccion',
            parameters: [
            [$class : 'ChoiceParameterDefinition',
            choices: ["INT", "PRE", "PRO"].join('\n'),
            name   : 'Please, choose selection']
        ])
    }
    return entorno
}