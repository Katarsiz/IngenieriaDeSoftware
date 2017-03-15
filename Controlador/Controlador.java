package Controlador;

import Mapeo.*;
import Modelo.*;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Julio
 */
@Controller 
public class Controlador {
    
    @Autowired
    ProfesorDAO profesor_db;

    @Autowired
    UserDAO user_db;
    
    @Autowired
    PersonaDAO persona_db;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    @RequestMapping(value="/persona2", method = RequestMethod.POST)
    public ModelAndView persona2(ModelMap model,HttpServletRequest request){
        // Obtenemos el correo y el password del usuario
        String p1 = request.getParameter("correo");
        String p2 = request.getParameter("contra");
        // Consultamos para ver si el usuario existe
        User user = user_db.getUser(p1);
        Persona persona = null;
        if(user == null)
           return new ModelAndView("inicio", model); 
        persona = user.getPersona();
        String p3 = "";
        String p4 = "";
        String p5 = "";
        
        if(p2.equals(user.getPassword())){
            p3 = persona.getNombre();
            p4 = persona.getFechanac().toString();
            p5 = persona.getCarrera();
        }        
        // Agregamos los atributos al JSP
        model.addAttribute("correo", p1);
        model.addAttribute("contra", p2);
        model.addAttribute("nombre", p3);
        model.addAttribute("fecha", p4);
        model.addAttribute("carrera", p5);        
        return new ModelAndView("persona",model);    
    }
    
    // Método para agregar a la base    
    @RequestMapping(value="/persona1", method = RequestMethod.GET)
    public ModelAndView persona1(ModelMap model,HttpServletRequest request){
        String p1 = request.getParameter("nombre");
        String p2 = request.getParameter("carrera");
        String p3 = request.getParameter("fecha");
        String p4 = request.getParameter("correo");
        String p5 = request.getParameter("contra");
        if(p1 == null || p2 == null || p3 == null || p4 == null || p5 == null )
            return new ModelAndView("registro", model);
        String tmp[] = p3.split("-");
        
        
        Persona per = new Persona();
        per.setCarrera(p2);
        per.setFechanac(new Date(Integer.parseInt(tmp[2]),Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1])));
        per.setId_persona();
        per.setNombre(p1);
        
        User user = new User();
        user.setCorreo(p4);
        user.setPassword(p5);
        user.setId_user();
        user.setPersona(per);
    
    
        persona_db.guardar(per);

        user_db.guardar(user);
             model.addAttribute("nombre", p1);
        model.addAttribute("carrera", p2);
        model.addAttribute("fecha", p3);
        model.addAttribute("correo", p4);
        model.addAttribute("contra", p5);
        return new ModelAndView("registrado",model);

    }
    
    @RequestMapping(value="/persona3", method = RequestMethod.GET)
    public ModelAndView persona3(ModelMap model,HttpServletRequest request){
        return new ModelAndView("registro",model);
    
    }
    
}
