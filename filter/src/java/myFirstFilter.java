
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class myFirstFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("First Filter Created ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Before chaining of first filter ...");
        chain.doFilter(request, response);
        System.out.println("After chaining of first filter ...");
    }

    @Override
    public void destroy() {
        System.out.println("First Filter Destroyed ... ");
    }
    
}
