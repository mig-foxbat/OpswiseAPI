package org.foxbat

import org.foxbat.opswise.core.TaskHandler
import org.foxbat.opswise.settings.Task.Create


object Hello {
  def main(args: Array[String]): Unit = {
  val task = new TaskHandler(null)
    task.create(Create(name="test_job",command = "F u", agent = "Smith"))
}
}

case class Customer(val name:String)