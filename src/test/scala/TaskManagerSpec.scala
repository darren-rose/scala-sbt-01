import java.time.LocalDate

import org.scalatest._

/**
  * Created by darrenrose on 05/05/2017.
  */
class TaskManagerSpec extends FlatSpec with Matchers {

  "An empty tasks list" should "have 0 tasks due today" in {
    // given
    val tasks = List()
    // when
    val dueToday = TaskManager.dueToday(tasks)
    // then
    dueToday should have length 0
  }

  "A tasks list with 1 task today" should "have 1 task due today" in {
    // given
    val t1 = Task("clean shoes", LocalDate.now())
    val t2 = Task("clean kitchen", LocalDate.now().plusDays(1))
    val tasks = List(t1, t2)
    // when
    val dueToday = TaskManager.dueToday(tasks)
    // then
    dueToday should have length 1
  }

}
