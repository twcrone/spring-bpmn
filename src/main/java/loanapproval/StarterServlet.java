package loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StarterServlet extends HttpServlet {

    ApplicationContext context = null;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        if(context == null) {
            context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        }

        RuntimeService runtimeService = (RuntimeService) context.getBean("runtimeService");
        runtimeService.startProcessInstanceByKey("loanApproval");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>Done</body></html>");
    }
}
