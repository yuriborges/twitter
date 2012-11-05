
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Twitter Client")/*1.24*/ {_display_(Seq[Any](format.raw/*1.26*/("""
	
	<img alt="10px"  src=""""),_display_(Seq[Any](/*3.25*/routes/*3.31*/.Assets.at("images/oauth_application.png"))),format.raw/*3.73*/(""""/>
	<p class="indexFont"> Welcome to Twitter client  by Yuri Borges </p>
	
    """),_display_(Seq[Any](/*6.6*/helper/*6.12*/.form(action = routes.TwitterController.start)/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
    	<input type="submit" class="submit" value="Authorize the App"/> 
    """)))})),format.raw/*8.6*/("""
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 05 14:14:09 EET 2012
                    SOURCE: C:/workspace/twitterClient/app/views/index.scala.html
                    HASH: ddc3d4d548395ed2bb67a831f8ea281f6300b901
                    MATRIX: 828->1|858->23|897->25|959->52|973->58|1036->100|1151->181|1165->187|1219->233|1258->235|1364->311
                    LINES: 30->1|30->1|30->1|32->3|32->3|32->3|35->6|35->6|35->6|35->6|37->8
                    -- GENERATED --
                */
            