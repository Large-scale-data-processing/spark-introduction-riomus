package pl.riomus

import org.apache.spark.{SparkConf, SparkContext}
import scala.collection.JavaConversions._
import java.io._
import java.util

/**
  * Created by  Roman Bartusiak <riomus@gmail.com> on 25.10.16.
  */
object SparkStart extends App {
    val sparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("SparkStart")
      .set("spark.app.id", "SparkStart")
    val ctx = new SparkContext(sparkConf)

    val out=ctx.parallelize((1 to 100).toSeq)
      .flatMap(_=>(1 to 100).iterator)
      .map(_*10)
      .reduce((a,b)=>a+b)

    println(out);
}
