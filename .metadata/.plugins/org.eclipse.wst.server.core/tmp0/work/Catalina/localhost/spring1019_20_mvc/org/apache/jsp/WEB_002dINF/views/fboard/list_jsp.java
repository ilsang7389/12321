/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.81
 * Generated at: 2023-10-20 08:14:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.fboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/fboard/../temp/footer.jsp", Long.valueOf(1697693244844L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1697591963434L));
    _jspx_dependants.put("jar:file:/E:/ICT/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring1019_20_mvc/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/views/fboard/../temp/header.jsp", Long.valueOf(1697780760364L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <TITLE> New Document </TITLE>\r\n");
      out.write("  <meta charset=\"euc-kr\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/css/style.css\"/>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\r\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write(" <script src=\"");
      out.print(application.getContextPath());
      out.write("/resources/js/ajaxdemo1.js\"></script>\r\n");
      out.write(" <style>\r\n");
      out.write(" a{\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("select.btn-mini {\r\n");
      out.write("    height: auto;\r\n");
      out.write("    width : 200px;\r\n");
      out.write("    line-height: 14px;\r\n");
      out.write("}\r\n");
      out.write(".card {\r\n");
      out.write("     \r\n");
      out.write("    border: none;\r\n");
      out.write("    box-shadow: 5px 6px 6px 2px #e9ecef;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write(".dots{\r\n");
      out.write("  height: 4px;\r\n");
      out.write("  width: 4px;\r\n");
      out.write("  margin-bottom: 2px;\r\n");
      out.write("  background-color: #bbb;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".badge{\r\n");
      out.write("    padding: 7px;\r\n");
      out.write("    padding-right: 9px;\r\n");
      out.write("    padding-left: 16px;\r\n");
      out.write("    box-shadow: 5px 6px 6px 2px #e9ecef;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user-img{\r\n");
      out.write("    margin-top: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".check-icon{\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("    color: #c3bfbf;\r\n");
      out.write("    top: 1px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    margin-left: 3px;\r\n");
      out.write("}\r\n");
      out.write(".form-check-input{\r\n");
      out.write("    margin-top: 6px;\r\n");
      out.write("    margin-left: -24px !important;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".form-check-input:focus{\r\n");
      out.write("    box-shadow: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".icons i{\r\n");
      out.write("    margin-left: 8px;\r\n");
      out.write("}\r\n");
      out.write(".reply{\r\n");
      out.write("    margin-left: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".reply small{\r\n");
      out.write("    color: #b7b4b4;\r\n");
      out.write("}\r\n");
      out.write(".reply small:hover{\r\n");
      out.write("    color: green;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".bgGr1 {\r\n");
      out.write("	background-color: #0d6efd\r\n");
      out.write("}\r\n");
      out.write(".bgGr2 {\r\n");
      out.write("	background-color: #ffc107\r\n");
      out.write("}\r\n");
      out.write(".bgGr3 {\r\n");
      out.write("	background-color: #0dcaf0\r\n");
      out.write("}\r\n");
      out.write("#colTitle{\r\n");
      out.write("	background-color: #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mytable-condensed{\r\n");
      out.write("  font-size: 11px;\r\n");
      out.write("}\r\n");
      out.write(" </style>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("	$('#searchv').focusin(function() {\r\n");
      out.write("		$(this).val(\"검색어 입력\")\r\n");
      out.write("	});\r\n");
      out.write("	$('#searchv').focusout(function() {\r\n");
      out.write("		$(this).val(\"\")\r\n");
      out.write("	});\r\n");
      out.write("	window.\r\n");
      out.write("	//let firstColor =\"d-flex flex-row-reverse mybgColor\";\r\n");
      out.write("	console.log(\"log00 => \"+$('.mybgColor').attr('class'));\r\n");
      out.write("	$('#item1').click(function(){\r\n");
      out.write("		//$(this).attr('class',firstColor)\r\n");
      out.write("		console.log(\"log => \"+$('.mybgColor').attr('class'));\r\n");
      out.write("		$('.mybgColor').attr('class',function(){\r\n");
      out.write("			$(this).attr('style','background-color:#0dcaf0');\r\n");
      out.write("			/*\r\n");
      out.write("			let changeClass = $(this).attr('class');\r\n");
      out.write("			let class_sttr_arr = changeClass.split(\" \");\r\n");
      out.write("			$.each(class_sttr_arr,function(e,val){\r\n");
      out.write("				console.log(e+\"::::::::::::::::::\"+val)\r\n");
      out.write("				if(val.includes(\"bg-\")){\r\n");
      out.write("					console.log(\"================>\"+e+\":\"+val);\r\n");
      out.write("					$('.mybgColor').attr('class').replace(val,'bg-info');\r\n");
      out.write("				}else{\r\n");
      out.write("					changeClass +=\" bg-info\";\r\n");
      out.write("				}\r\n");
      out.write("				$('.mybgColor').attr('class',changeClass)\r\n");
      out.write("			});\r\n");
      out.write("			*/\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	$('#item2').click(function(){\r\n");
      out.write("		console.log(\"log => \"+$('.mybgColor').attr('class'));\r\n");
      out.write("		$('.mybgColor').attr('class',function(){\r\n");
      out.write("			$(this).attr('style','background-color:#ffc107');\r\n");
      out.write("		});\r\n");
      out.write("		//이미지 세팅하기\r\n");
      out.write("		let imgArr = ['d1.jpg','d2.jpg','d3.jpg'];\r\n");
      out.write("		$('.carousel-item > img').each(function(idx){\r\n");
      out.write("			console.log(\"바뀔 이미지 :\"+imgArr[idx]+\", log Img => \"+$(this).attr('src'));\r\n");
      out.write("			$(this).attr('src','resources/image/'+imgArr[idx]);\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("	$('#item3').click(function(){\r\n");
      out.write("		$('.mybgColor').attr('class',function(){\r\n");
      out.write("			$(this).attr('style','background-color:#0d6efd');\r\n");
      out.write("		});\r\n");
      out.write("		//이미지 세팅하기\r\n");
      out.write("		let imgArr = ['c1.jpg','c2.jpg','c3.jpg'];\r\n");
      out.write("		$('.carousel-item > img').each(function(idx){\r\n");
      out.write("			console.log(\"바뀔 이미지 :\"+imgArr[idx]+\", log Img => \"+$(this).attr('src'));\r\n");
      out.write("			$(this).attr('src','resources/image/'+imgArr[idx]);\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write("<header class=\"text-white text-center\" >\r\n");
      out.write("<div class=\"d-flex flex-row-reverse mybgColor\">\r\n");
      out.write("  <div class=\"p-2 bg-info\"><a href=\"#\" class=\"nav-link text-white\" id=\"item1\">Flex item 1</a></div>\r\n");
      out.write("  <div class=\"p-2 bg-warning\"><a href=\"#\" class=\"nav-link text-white\" id=\"item2\">Flex item 2</a></div>\r\n");
      out.write("  <div class=\"p-2 bg-primary\"><a href=\"#\" class=\"nav-link text-white\" id=\"item3\">회원가입</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("        <!-- Carousel -->\r\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("  <!-- Indicators/dots -->\r\n");
      out.write("  <div class=\"carousel-indicators\">\r\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"0\" class=\"active\"></button>\r\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"1\"></button>\r\n");
      out.write("    <button type=\"button\" data-bs-target=\"#demo\" data-bs-slide-to=\"2\"></button>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <!-- The slideshow/carousel -->\r\n");
      out.write("  <div class=\"carousel-inner\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("      <img src=\"resources/image/d1.jpg\" alt=\"Kosmo113\" class=\"d-block\" style=\"width:100%\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h3>UI 요구사항 확인하기,UI 설계하기 </h3>\r\n");
      out.write("        <p>jQuery 를 이용하여 제공받은 샘플파일에서 아래 요구사항대로 구현합니다.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"resources/image/d2.jpg\" alt=\"Carousel\" class=\"d-block\" style=\"width:100%\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h3>Carousel 기능을 CSS3로!</h3>\r\n");
      out.write("        <p>Thank you, CSS3!</p>\r\n");
      out.write("      </div> \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img src=\"resources/image/d3.jpg\" alt=\"JSP\" class=\"d-block\" style=\"width:100%\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h3>UI 요구사항 확인하기,UI 설계하기 </h3>\r\n");
      out.write("        <p>jQuery 를 이용하여 제공받은 샘플파일에서 아래 요구사항대로 구현합니다.</p>\r\n");
      out.write("      </div>  \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Left and right controls/icons -->\r\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#demo\" data-bs-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("</div>  \r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-sm mybgColor\" >\r\n");
      out.write("     <div class=\"container-fluid\" >\r\n");
      out.write("        <ul class=\"navbar-nav\" >\r\n");
      out.write("            <li class=\"nav-item\"><a href=\"main\" class=\"nav-link active\" >Home</a></li>\r\n");
      out.write("            <li class=\"nav-item\"><a href=\"fbordWrite\" class=\"nav-link\">Board</a></li>\r\n");
      out.write("            <li class=\"nav-item\"><a href=\"ajaxBoard\" class=\"nav-link\">ajaxBoard</a></li>\r\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Profile</a></li>\r\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Contact</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"d-flex\">\r\n");
      out.write("        <input class=\"form-control me-2\" type=\"text\" placeholder=\"Search\" name=\"searchv\" id=\"searchv\">\r\n");
      out.write("        <button class=\"btn btn-primary\" type=\"button\">Search</button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<article>\r\n");
      out.write("	<header style=\"color: white\">FreeBoard</header>\r\n");
      out.write("	<ul class=\"list-unstyled\">\r\n");
      out.write("		<li class=\"border-top my-3\">ICT34기 FreeBoard List 페이지 입니다.</li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<h2>FreeBoard List</h2>\r\n");
      out.write("			<table class=\"table table-hover\">\r\n");
      out.write("				<thead>\r\n");
      out.write("					<tr class=\"table-secondary\">\r\n");
      out.write("						<th scope=\"col\">번호</th>\r\n");
      out.write("						<th scope=\"col\">제목</th>\r\n");
      out.write("						<th scope=\"col\">작성자</th>\r\n");
      out.write("						<th scope=\"col\">조회수</th>\r\n");
      out.write("						<th scope=\"col\">날짜</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody>\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("				<tfoot>\r\n");
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th colspan=\"5\" class=\"text-end\">\r\n");
      out.write("							<!-- https://getbootstrap.com/docs/5.0/components/buttons/ -->\r\n");
      out.write("							<button class=\"btn btn-outline-danger btn-sm\"\r\n");
      out.write("								onclick=\"location='fbordWrite'\">글작성</button>\r\n");
      out.write("						</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</tfoot>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</article>\r\n");
      out.write("pageEncoding=\"EUC-KR\"%>\r\n");
      out.write("\r\n");
      out.write("  <aside >\r\n");
      out.write("        <header>\r\n");
      out.write("             <span class=\"fs-4\">핵심 교과목</span>\r\n");
      out.write("        </header>\r\n");
      out.write("      <ul class=\"list-unstyled \">\r\n");
      out.write("      <li class=\"mb-1\" >\r\n");
      out.write("        <button class=\"bg-white btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed \" data-bs-toggle=\"collapse\" data-bs-target=\"#home-collapse\" aria-expanded=\"true\">\r\n");
      out.write("          Java\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse show\" id=\"home-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled\">\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">클래스</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">인터페이스</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">NetWork</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"border-top my-3\"></li>\r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("        <button class=\"bg-white btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\" data-bs-toggle=\"collapse\" data-bs-target=\"#dashboard-collapse\" aria-expanded=\"false\">\r\n");
      out.write("                  빅데이터 \r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse\" id=\"dashboard-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled\">\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Python</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">NumPy</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Pandas</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Tensorflow</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"border-top my-3\"></li>\r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("        <button class=\"bg-white btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\" data-bs-toggle=\"collapse\" data-bs-target=\"#orders-collapse\" aria-expanded=\"false\">\r\n");
      out.write("          Orders\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse\" id=\"orders-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled\">\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">New</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Processed</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Shipped</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Returned</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"border-top my-3\"></li>\r\n");
      out.write("      <li class=\"mb-1\">\r\n");
      out.write("        <button class=\"bg-white btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed\" data-bs-toggle=\"collapse\" data-bs-target=\"#account-collapse\" aria-expanded=\"false\">\r\n");
      out.write("          Account\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse\" id=\"account-collapse\">\r\n");
      out.write("          <ul class=\"btn-toggle-nav list-unstyled\">\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">New...</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Profile</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Settings</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"link-dark d-inline-flex text-decoration-none rounded\">Sign out</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    </aside>\r\n");
      out.write(" \r\n");
      out.write("   <footer class=\"mt-5 p-4 text-white text-center mybgColor\">\r\n");
      out.write("        Page Footer\r\n");
      out.write("    </footer>\r\n");
      out.write("<script>\r\n");
      out.write("	$(function(){\r\n");
      out.write("		$('#wbtn').click(function(){\r\n");
      out.write("			location =\"boardForm\";\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/fboard/list.jsp(25,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/views/fboard/list.jsp(25,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/fboard/list.jsp(25,5) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\r\n");
            out.write("						<tr class=\"table-warning\">\r\n");
            out.write("							<th scope=\"row\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</th>\r\n");
            out.write("							<td ><a href=\"fboardHit?num=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"link-secondary\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></td>\r\n");
            out.write("							<th >");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.subject}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</th>\r\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.hit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.fdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("						</tr>\r\n");
            out.write("\r\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}