val dasoopsCommonVersion: String by project
val hutoolVersion: String by project
val guavaVersion: String by project
val logbackVersion: String by project
val okhttpVersion: String by project
val jsonpVersion: String by project

dependencies {
    //TODO(依赖打包加载)
    //mirai

    //common
    api("cn.hutool:hutool-all:${hutoolVersion}")
    api("com.google.guava:guava:${guavaVersion}")
    api(platform(("com.dasoops:common-bom:${dasoopsCommonVersion}")))
    api("com.dasoops:common-core")
    api("com.dasoops:common-json")

    api("ch.qos.logback:logback-classic:${logbackVersion}")

    //爬虫框架
    api("org.jsoup:jsoup:${jsonpVersion}")

    //okHttp
    api("com.squareup.okhttp3:okhttp:${okhttpVersion}")

    //kt
    api("org.jetbrains.kotlin:kotlin-reflect")

}

tasks.named("compileJava") {
    inputs.files(tasks.named("processResources"))
}
tasks.named("compileKotlin") {
    inputs.files(tasks.named("processResources"))
}