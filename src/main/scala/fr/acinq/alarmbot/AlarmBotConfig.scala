package fr.acinq.alarmbot

import net.ceedubs.ficus.Ficus._
import com.typesafe.config.{ConfigFactory, Config => TypesafeConfig}
import java.io.File

object AlarmBotConfig {
  val resourcesDir: String = s"${System getProperty "user.dir"}/plugin-resources/alarmbot"

  val config: TypesafeConfig = ConfigFactory parseFile new File(resourcesDir, "alarmbot.conf")

  val botApiKey: String = config.as[String]("config.botApiKey")

  val chatId: String = config.as[String]("config.chatId")
}