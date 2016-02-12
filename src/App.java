import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name= "encuesta",urlPatterns = {"/encuesta"})
public class App extends HttpServlet{
    private static final long serialVersionUID = 1L;
    Map<String, Integer> contadorFormulario = new HashMap<String, Integer>();
    public void init(ServletConfig conf) throws ServletException {
        super.init(conf);
        Map<String, Integer> ContadorFormulario = new HashMap<String, Integer>();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        Object scAttribute = sc.getAttribute(String.valueOf(contadorFormulario));
        sc.setAttribute("attribute", "value");


        String x =request.getParameter("bebida");
        System.out.println(x);
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("formulario.jsp").forward(request,response);
    }
}


