package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IPFilter implements Filter {
	private String filteredIP; //存放被过滤的IP

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		String remoteIP = arg0.getRemoteAddr();
		if(remoteIP.equals(filteredIP)) {
			arg0.getRequestDispatcher("ErrorInfo.jsp").forward(arg0, arg1);
		} else {
			arg2.doFilter(arg0, arg1);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		filteredIP = arg0.getInitParameter("FilteredIP");
		if(filteredIP == null) filteredIP="";
	}

}
