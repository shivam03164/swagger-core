package converter

import models._

import com.wordnik.swagger.converter._

import com.wordnik.swagger.core.util._

import java.util.Date

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class JsonPropertyModelTest extends FlatSpec with ShouldMatchers {
  val models = ModelConverters.readAll(classOf[ModelWithJsonProperty])
  JsonSerializer.asJson(models) should be ("""[{"id":"ModelWithJsonProperty","properties":{"theCount":{"type":"integer","format":"int32"}}}]""")
}
