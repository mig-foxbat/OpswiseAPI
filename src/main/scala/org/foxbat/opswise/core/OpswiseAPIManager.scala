package org.foxbat.opswise.core


import play.api.libs.json.Json
import scala.io.Source


/**
 * Created by chlr on 6/16/15.
 */
class OpswiseAPIManager(config_dir:String = "/config",instance:String = "/opswise.json") {
  OpswiseAPIManager.init(config_dir,instance)
  def getTaskHandler(): TaskHandler = new TaskHandler
}


object OpswiseAPIManager {
  var config:Config = null
  def init(config_dir:String, instance:String) = {
     config = new Config(config_dir,instance)
  }
}

class Config(val config_dir:String, val instance:String) {
  val opswise = Json parse (Source fromURL getClass.getResource(config_dir+instance)).getLines().mkString
  val urls = Json parse (Source fromURL getClass.getResource(config_dir+"/app.json")).getLines().mkString
  val timeout =  10000
}


