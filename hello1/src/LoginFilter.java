import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter({"/giveyourname.jsp","/helloname.jsp"})
public class LoginFilter implements Filter {
	
	private String contextPath;
	
@Override
	public void init(FilterConfig fConfig) throws ServletException {
		contextPath = fConfig.getServletContext().getContextPath();
	}

@Override	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
	HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;  

    if (req.getSession().getAttribute("ucode") == null ) { 
        res.sendRedirect(contextPath + "/login.jsp");
    }
	
    chain.doFilter(request, response);
    }

@Override 
	public void destroy() {
	}
}
