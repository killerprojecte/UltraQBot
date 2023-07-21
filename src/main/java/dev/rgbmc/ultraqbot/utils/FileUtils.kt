package dev.rgbmc.ultraqbot.utils

import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import java.util.*

object FileUtils {
    fun download(url: String, file: File) {
        download(URL(url), file)
    }

    fun download(url: URL, file: File) {
        try {
            url.openStream().use { ins ->
                val target: Path = file.toPath()
                Files.createDirectories(target.parent)
                Files.copy(ins, target, StandardCopyOption.REPLACE_EXISTING)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun fileToBase64(file: File): String {
        val input = FileInputStream(file)
        val bytes = ByteArray(file.length().toInt())
        input.read(bytes)
        val encoded = Base64.getEncoder().encodeToString(bytes)
        input.close()
        return encoded
    }
}