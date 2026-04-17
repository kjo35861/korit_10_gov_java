package ex4;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        System.out.println("EncodingFilter 작동");
        filterChain.doFilter(request, response);
    }
}
