/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-05 09:03:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Clerker_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <title>日报管理系统</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/layui/css/layui.css\">\r\n");
      out.write("     <script src=\"../js/jquery-1.11.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("  <div class=\"layui-header\">\r\n");
      out.write("    <div class=\"layui-logo\"><span class=\"shenfen\"></span>日报管理系统</div>\r\n");
      out.write("    <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("      <li class=\"layui-nav-item\">\r\n");
      out.write("        <a href=\"javascript:;\">\r\n");
      out.write("          <img src=\"../jpg/猴.jpg\" class=\"layui-nav-img\">\r\n");
      out.write("          <span class=\"user\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <dl class=\"layui-nav-child\">\r\n");
      out.write("          <dd><a href=\"\">基本资料</a></dd>\r\n");
      out.write("          <dd><a href=\"\">安全设置</a></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"logout.jsp\">退出</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("    <div class=\"layui-side-scroll\">\r\n");
      out.write("      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("      <ul class=\"layui-nav layui-nav-tree\"  lay-filter=\"test\">\r\n");
      out.write("        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a class=\"\" href=\"javascript:;\">日报管理</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd class=\"tianxie\"><a href=\"../ribao.ajax/tianxie.jsp\"target=\"ck\">日报填写</a></dd>\r\n");
      out.write("            <dd class=\"chakan\"><a href=\"../ribao.ajax/chakan.html\"target=\"ck\">日报查看</a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a class=\"\" href=\"javascript:;\">评论管理</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd class=\"评论\"><a href=\"../ribao.ajax/pinglun.html\"target=\"ck\">评论查看</a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"class layui-nav-item\">\r\n");
      out.write("            <a href=\"../class.ajax/ajax.html\" target=\"ck\">班级信息管理</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"student layui-nav-item\"><a href=\"../student111.ajax/ajax.html\"target=\"ck\">学生信息管理</a></li>\r\n");
      out.write("        <li class=\"teacher layui-nav-item\"><a href=\"../teacher.ajax/ajax.html\"target=\"ck\">教师信息管理</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-body\">\r\n");
      out.write("    <!-- 内容主体区域 -->\r\n");
      out.write("    <div style=\" width:100%;height:100%\">\r\n");
      out.write("     \r\n");
      out.write("    <iframe name=\"ck\" class=\"view\"style=\" width:100%;height:100%\" src=\"huanying.html\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-footer\">\r\n");
      out.write("    <!-- 底部固定区域 -->\r\n");
      out.write("    © layui.com - 底部固定区域\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../css/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//JavaScript代码区域\r\n");
      out.write("layui.use('element', function(){\r\n");
      out.write("  var element = layui.element;\r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}