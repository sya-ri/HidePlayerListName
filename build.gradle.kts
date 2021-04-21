import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
}

group = "com.github.syari.hideplayername"
version = "1.0.0"

repositories {
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven(url = "https://oss.sonatype.org/content/groups/public/")
    mavenCentral()
}

dependencies {
    implementation("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
}

configure<BukkitPluginDescription> {
    main = "com.github.syari.hideplayername.Main"
    author = "sya_ri"
    website = "https://github.com/sya-ri/HidePlayerListName"
    apiVersion = "1.16"
}