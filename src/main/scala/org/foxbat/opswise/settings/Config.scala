package org.foxbat.opswise.settings

import play.api.libs.json.{JsValue, Json}

import scala.io.Source

/**
 * Created by chlr on 6/17/15.
 */
class Config(val config_dir:String = "/config", val instance:String = "/opswise.json") {
    val opswise = Json parse (Source fromURL getClass.getResource(config_dir+instance)).getLines().mkString
    val urls = Json parse (Source fromURL getClass.getResource(config_dir+"app.json")).getLines().mkString
}
