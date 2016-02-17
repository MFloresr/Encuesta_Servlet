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


@WebServlet("/encuesta")
public class App extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private Map<String, Integer> bebidas= new HashMap<String, Integer>();

    public App(){
        super();
    }

    public void init(ServletConfig conf) throws ServletException {
        conf.getServletContext().setAttribute("bebidas",bebidas);
        super.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int veces=0;

        String bebidaselecionada=request.getParameter("bebida");
        if(bebidas.containsKey(bebidaselecionada)){
            veces=bebidas.get(bebidaselecionada);
        }
        bebidas.put(bebidaselecionada, veces+1);
        request.getRequestDispatcher("Resultado_Servlet").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("formulario.jsp").forward(request,response);
    }
}


