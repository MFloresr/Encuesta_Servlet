import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/Resultado_Servlet")
public class Resultado_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<String, Integer> bebidas;

    public Resultado_Servlet(){
        super();
    }

    public void init(ServletConfig conf) throws ServletException {
        bebidas=(HashMap<String, Integer>) conf.getServletContext().getAttribute("bebidas");
        super.init();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("bebidas", bebidas);
        request.getRequestDispatcher("solucion.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
