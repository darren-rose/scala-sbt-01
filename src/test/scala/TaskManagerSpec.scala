// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
import java.time.LocalDate

import org.scalatest._

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
