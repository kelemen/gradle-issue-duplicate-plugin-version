tasks.register("otherBuildPluginTask") {
    doLast {
        println("Hello from $path")
    }
}
