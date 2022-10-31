def call(String version){
    switch(version) {
        case "0.0.5":
            sh "grep 0.0.5 release.yml"
            break
        case "0.0.6":
            sh "grep 0.0.6 release.yml"
            break
        case "0.0.7":
            sh "grep 0.0.7 release.yml"
            break
    }
}