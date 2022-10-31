def call(String name, String surname, String second_surname) {
    echo """    Hello world, my name is ${name}, 
    my first surname is ${surname} 
    and my last surname is ${second_surname}.
    """
}

def call(String parametro) {
    echo """Esta es la funcion2 el valor del parametro es ${parametro}"""
    sh "ls"
}

def call(int numero){
    echo "Esto es un el numero: ${numero}"
}