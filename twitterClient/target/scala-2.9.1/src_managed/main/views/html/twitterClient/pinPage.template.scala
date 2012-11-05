
package views.html.twitterClient

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
object pinPage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Twitter Client")/*1.24*/ {_display_(Seq[Any](format.raw/*1.26*/("""
	
	<img alt="10"  src=""""),_display_(Seq[Any](/*3.23*/routes/*3.29*/.Assets.at("images/oauth_application.png"))),format.raw/*3.71*/(""""/>
	<p class="indexFont"> Welcome to Twitter client  by Yuri Borges </p>
	
    """),_display_(Seq[Any](/*6.6*/helper/*6.12*/.form(action = routes.TwitterController.loadUserPage)/*6.65*/ {_display_(Seq[Any](format.raw/*6.67*/("""
    	
    	<p class="indexFont"> Enter the PIN code here:
    	<input type="text" id="pin" name="pin"/></p>
    	<input type="submit" class="submit"  value="Start Application"/> 
    """)))})),format.raw/*11.6*/("""
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 05 14:16:32 EET 2012
                    SOURCE: C:/workspace/twitterClient/app/views/twitterClient/pinPage.scala.html
                    HASH: 53a62d4235adb24fbaff7734ed82619bfeee47aa
                    MATRIX: 844->1|874->23|913->25|975->52|989->58|1052->100|1170->184|1184->190|1245->243|1284->245|1505->435
                    LINES: 30->1|30->1|30->1|32->3|32->3|32->3|35->6|35->6|35->6|35->6|40->11
                    -- GENERATED --
                */
            