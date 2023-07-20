# **UltraQBot**

- 下一代Bukkit OICQ机器人框架
- 基于xbaimiao/mirai-http-sdk开发
- 需要配合mirai-api-http插件(Mirai-Console)使用

## 从UltraQBot开始

**UltraQBot** 目前正在开发阶段

随时可能有API更变
目前已实现部分功能
未来可能会兼容基于AmazingBot 3.x/4.x 的插件

## 额外协议

- 本内容根据GPLv3第7条发布

```
1. 禁止任何人以任何方式对UltraQBot其可执行内容或源码进行付费分发
2. 任何人对UltraQBot源码进行分发时必须附上此仓库链接
3. UltraQBot开发者有权力对违规使用(诈骗行为, 违法行为等)UltraQBot的用户撤销使用授权
```

## 添加至依赖

- Maven

```xml
    <repositories>
        <repository>
            <id>fastmcmirror-repo</id>
            <url>https://repo.fastmcmirror.org/content/repositories/releases/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>dev.rgbmc</groupId>
            <artifactId>UltraQBot</artifactId>
            <version>1.0.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

- Gradle Groovy

```groovy
repositories {
    maven {
        name = 'fastmcmirror-repo'
        url = "https://repo.fastmcmirror.org/content/repositories/releases/"
    }
}

dependencies {
    compileOnly 'dev.rgbmc:UltraQBot:1.0.0'
}
```

- Gradle Kotlin

```kotlin
repositories {
    maven {
        name = "fastmcmirror-repo"
        url = uri("https://repo.fastmcmirror.org/content/repositories/releases/")
    }
}

dependencies {
    compileOnly("dev.rgbmc:UltraQBot:1.0.0")
}
```