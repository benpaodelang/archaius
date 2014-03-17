/**
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.archaius.samplelibrary

/**
 * User: gorzell
 * Date: 1/17/13
 * Time: 10:18 AM
 * Example of loading and using dynamic properties in scala
 */
class ExampleScala extends App {

  import com.netflix.config.scala.DynamicProperties._

  val numRetries = dynamicIntProperty("numRetries", 1)
  val sayHello = dynamicBooleanProperty("hello", false)
  val helloText = dynamicStringProperty("helloText", "Hello world")

  if (sayHello.get) println(helloText.get)

  println("Number of times to try=%d", numRetries.get)
}
