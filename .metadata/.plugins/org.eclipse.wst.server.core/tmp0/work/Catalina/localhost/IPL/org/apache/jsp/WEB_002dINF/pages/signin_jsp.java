/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2017-03-07 12:51:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.3.RELEASE.jar", Long.valueOf(1477046538000L));
    _jspx_dependants.put("jar:file:/home/bridgeit/Desktop/IPL/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/IPL/WEB-INF/lib/spring-webmvc-4.3.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1474276970000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\t \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("h3 {\n");
      out.write("\tpadding-right: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h4 {\n");
      out.write("\tpadding-right: 100px;\n");
      out.write("\tpadding-top: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("\tpadding-right: 100px;\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header, footer, article, section, hgroup, nav, figure {\n");
      out.write("\t/* Giving a display value to the HTML5 rendered elements: */\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article .line {\n");
      out.write("\t/* The dividing line inside of the article is darker: */\n");
      out.write("\tbackground-color: #15242a;\n");
      out.write("\tborder-bottom-color: #204656;\n");
      out.write("\tmargin: 1.3em 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer .line {\n");
      out.write("\tmargin: 30em 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("\tbackground: url(img/gradient_light.jpg) repeat-x 50% 50% #f8f8f8;\n");
      out.write("\tpadding: 0 5px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tright: 0;\n");
      out.write("\ttop: 4em;\n");
      out.write("\tborder: 1px solid #FCFCFC;\n");
      out.write("\t-moz-box-shadow: 0 1px 1px #333333;\n");
      out.write("\t-webkit-box-shadow: 0 1px 1px #333333;\n");
      out.write("\tbox-shadow: 0 1px 1px #333333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul li {\n");
      out.write("\tdisplay: inline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul li a, nav ul li a:visited {\n");
      out.write("\tcolor: #565656;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfloat: left;\n");
      out.write("\tfont-size: 1.25em;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tmargin: 5px 2px;\n");
      out.write("\tpadding: 7px 10px 4px;\n");
      out.write("\ttext-shadow: 0 1px 1px white;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul li a:hover {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tbackground-color: #f0f0f0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav, article, nav ul li a, figure {\n");
      out.write("\t/* Applying CSS3 rounded corners: */\n");
      out.write("\t-moz-border-radius: 10px;\n");
      out.write("\t-webkit-border-radius: 10px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#page {\n");
      out.write("\twidth: 1340px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article {\n");
      out.write("\tbackground-color: #213E4A;\n");
      out.write("\tmargin: 3em 0;\n");
      out.write("\tpadding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("figure {\n");
      out.write("\tfloat: right;\n");
      out.write("\theight: 400px;\n");
      out.write("\tmargin-left: 15px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\twidth: 400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("figure:hover {\n");
      out.write("\t-moz-box-shadow: 0 0 2px #4D7788;\n");
      out.write("\t-webkit-box-shadow: 0 0 2px #4D7788;\n");
      out.write("\tbox-shadow: 0 0 2px #4D7788;\n");
      out.write("}\n");
      out.write("\n");
      out.write("figure img {\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-top: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Footer styling: */\n");
      out.write("footer {\n");
      out.write("\tmargin-top: 5px margin-bottom:30px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 0.825em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer p {\n");
      out.write("\tmargin-bottom: -2.5em;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer a, footer a:visited {\n");
      out.write("\tcolor: #cccccc;\n");
      out.write("\tbackground-color: #213e4a;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tpadding: 2px 4px;\n");
      out.write("\tz-index: 100;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer a:hover {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tbackground-color: #142830;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer a.by {\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer a.up {\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("</style>\n");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mainCss}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("</head>\n");
      out.write("<body background=\"images/images.jpg\">\n");
      out.write("\n");
      out.write("\t<section id=\"page\"> <!-- Defining the #page section with the section tag -->\n");
      out.write("\n");
      out.write("\t<header> <!-- Defining the header section of the page with the appropriate tag -->\n");
      out.write("\n");
      out.write("\t<img src=\"images/iplLogo.jpg\" alt=\"logo\" width=\"450px\" height=\"150\" />\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("  <a href=\"about\" id=\"about\">About</a>\n");
      out.write("  <a href=\"signin\" id=\"signIn\">SignIn</a>\n");
      out.write("  <a href=\"signup\" id=\"signup\">SignUp</a>\n");
      out.write("  <a href=\"contact\" id=\"contact\">Contact</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\t<div class=\"line\"></div>\n");
      out.write("\t<!-- Dividing line --> <article id=\"article1\"> <!-- The new article tag. The id is supplied so it can be scrolled into view. -->\n");
      out.write("\n");
      out.write("\t<h2>\n");
      out.write("\t\t<font color=\"white\">Sign In</font>\n");
      out.write("\t</h2>\n");
      out.write("\n");
      out.write("\t<div class=\"line\"></div>\n");
      out.write("\n");
      out.write("\t<div class=\"articleBody clear\">\n");
      out.write("\n");
      out.write("\t\t<figure> <!-- The figure tag marks data (usually an image) that is part of the article -->\n");
      out.write("\n");
      out.write("\t\t<!-- <a href=\"http://tutorialzine.com/2010/02/photo-shoot-css-jquery/\"> -->\n");
      out.write("\t\t\t<!-- <img src=\"images/signin.png\" width=\"400px\" height=\"150px\" alt=\"img not found\" /></a> --></figure>\n");
      out.write("\n");
      out.write("\t\t<h3 align=\"center\">\n");
      out.write("\t\t\t<font color=\"white\">Enter the following Information</font>\n");
      out.write("\t\t</h3>\n");
      out.write("\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\t\t<form method=\"post\" action=\"signin\">\n");
      out.write("\t\t\t<table bgcolor=\"FloralWhite\" cellpadding=\"5px\" cellspacing=\"5px\"\n");
      out.write("\t\t\t\talign=\"center\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Email</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"email\" required />\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Password</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"password\" required />\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\"><input type=\"submit\" value=\"SUBMIT\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<a href=\"signup\"><h4 align=\"center\">\n");
      out.write("\t\t\t\t<font color=\"#990000\">New user??Click here to sign up!</font>\n");
      out.write("\t\t\t</h4></a>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</article> <footer>\n");
      out.write("\n");
      out.write("\t<div class=\"line\"></div>\n");
      out.write("\n");
      out.write("\t<p>&copy; Vivo IPL 2017 Schedule. All Rights Reserved.</p>\n");
      out.write("\t<!-- Change the copyright notice --> <a href=\"#\" class=\"up\"><input\n");
      out.write("\t\ttype=\"button\" value=\"Go Up\"></a> </footer> </section>\n");
      out.write("\t<!-- Closing the #page section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f0_reused = false;
    try {
      _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f0.setParent(null);
      // /WEB-INF/pages/signin.jsp(147,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f0.setValue("/CSS/IPl.css");
      // /WEB-INF/pages/signin.jsp(147,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f0.setVar("mainCss");
      int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
        if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
      _jspx_th_spring_005furl_005f0_reused = true;
    } finally {
      if (!_jspx_th_spring_005furl_005f0_reused) {
        _jspx_th_spring_005furl_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_spring_005furl_005f0);
      }
    }
    return false;
  }
}
