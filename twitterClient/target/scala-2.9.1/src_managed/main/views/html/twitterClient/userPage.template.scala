
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
object userPage extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[model.User,List[model.UserTimeLine],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: model.User, ListUserTimeLine: List[model.UserTimeLine]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.64*/("""
"""),_display_(Seq[Any](/*2.2*/main("Twitter Client")/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""

	<div id="container">
		<div id="left">
			<img alt="10px" src=""""),_display_(Seq[Any](/*6.26*/user/*6.30*/.getImageUrl())),format.raw/*6.44*/(""""/>
			<a href=""""),_display_(Seq[Any](/*7.14*/routes/*7.20*/.TwitterController.userPage)),format.raw/*7.47*/("""" > """),_display_(Seq[Any](/*7.52*/user/*7.56*/.getName())),format.raw/*7.66*/("""</a>
			<p>&#64;"""),_display_(Seq[Any](/*8.13*/user/*8.17*/.getScreenName())),format.raw/*8.33*/("""<a href=""""),_display_(Seq[Any](/*8.43*/routes/*8.49*/.TwitterController.logout)),format.raw/*8.74*/("""" >Logout</a> </p><br>
			"""),_display_(Seq[Any](/*9.5*/helper/*9.11*/.form(action =  routes.TwitterController.search)/*9.59*/{_display_(Seq[Any](format.raw/*9.60*/("""
			 <input type="text" name="searchQuery">
			 <input type="submit" class="button seacrh" value="search"/> 
			""")))})),format.raw/*12.5*/("""
	   
		</div>
		<div id="center">
		"""),_display_(Seq[Any](/*16.4*/helper/*16.10*/.form(action =  routes.TwitterController.postNewStatus)/*16.65*/{_display_(Seq[Any](format.raw/*16.66*/("""
			<textarea id="status" name="status"  rows=3 cols=30 maxlength="140"> </textarea>
    		<input type="submit" class="button Tweet" value="Tweet"/> 
		""")))})),format.raw/*19.4*/("""
		"""),_display_(Seq[Any](/*20.4*/for(userTimeLine <- ListUserTimeLine) yield /*20.41*/{_display_(Seq[Any](format.raw/*20.42*/("""
			<div id="tweet" >
				<p>
				    <img alt="10px" src=""""),_display_(Seq[Any](/*23.31*/userTimeLine/*23.43*/.getUser().getImageUrl())),format.raw/*23.67*/(""""/>
				    """),_display_(Seq[Any](/*24.10*/userTimeLine/*24.22*/.getUser().getName())),format.raw/*24.42*/("""
				    &#64;"""),_display_(Seq[Any](/*25.15*/userTimeLine/*25.27*/.getUser().getScreenName())),format.raw/*25.53*/("""
			    </p>
				<p style="margin-left: 20px">"""),_display_(Seq[Any](/*27.35*/userTimeLine/*27.47*/.getText())),format.raw/*27.57*/("""</p>
				<p>Create at: """),_display_(Seq[Any](/*28.20*/userTimeLine/*28.32*/.getDate())),format.raw/*28.42*/("""</p>
    		</div>
		""")))})),format.raw/*30.4*/("""
		</div>
	</div>
""")))})))}
    }
    
    def render(user:model.User,ListUserTimeLine:List[model.UserTimeLine]) = apply(user,ListUserTimeLine)
    
    def f:((model.User,List[model.UserTimeLine]) => play.api.templates.Html) = (user,ListUserTimeLine) => apply(user,ListUserTimeLine)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 05 15:05:40 EET 2012
                    SOURCE: C:/workspace/twitterClient/app/views/twitterClient/userPage.scala.html
                    HASH: 6c17612ab0dd39fdb0171472da81619da8f8b60f
                    MATRIX: 801->1|940->63|977->66|1007->88|1046->90|1152->161|1164->165|1199->179|1252->197|1266->203|1314->230|1354->235|1366->239|1397->249|1450->267|1462->271|1499->287|1544->297|1558->303|1604->328|1666->356|1680->362|1736->410|1774->411|1921->527|1998->569|2013->575|2077->630|2116->631|2303->787|2343->792|2396->829|2435->830|2534->893|2555->905|2601->929|2651->943|2672->955|2714->975|2766->991|2787->1003|2835->1029|2920->1078|2941->1090|2973->1100|3034->1125|3055->1137|3087->1147|3141->1170
                    LINES: 27->1|30->1|31->2|31->2|31->2|35->6|35->6|35->6|36->7|36->7|36->7|36->7|36->7|36->7|37->8|37->8|37->8|37->8|37->8|37->8|38->9|38->9|38->9|38->9|41->12|45->16|45->16|45->16|45->16|48->19|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|56->27|56->27|56->27|57->28|57->28|57->28|59->30
                    -- GENERATED --
                */
            