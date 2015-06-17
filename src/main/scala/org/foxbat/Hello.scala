package org.foxbat

import org.foxbat.opswise.core.OpswiseAPIManager
import org.foxbat.opswise.settings.Task.Create


object Hello {
  def main(args: Array[String]): Unit = {
    val api = new OpswiseAPIManager()
    api.getTaskHandler().create(Create(name="test_job1", command="echo All Hail Megatron", agent = "optimus-dev2 - AGNT0002"))
}
}

case class Customer(val name:String)