package timeusage

import org.apache.spark.api.java.JavaRDD
import org.apache.spark.sql.{ColumnName, DataFrame, Row}
import org.junit.{Assert, Test}
import org.junit.Assert.assertEquals
import org.scalatest.freespec.AnyFreeSpec

import scala.util.Random

class TimeUsageSuite extends AnyFreeSpec {
  "Timeusage" - {

    //    "when passed the default arguments" - {

    "Should read the dataframe" in {
      val (schema, df) = TimeUsage.read("src/main/resources/atussum.csv")
      df.printSchema

      println(schema)
    }
  }
}
