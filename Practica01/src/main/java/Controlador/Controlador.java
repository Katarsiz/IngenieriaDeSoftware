/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class Controlador {
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }   
    
    @RequestMapping(value="/registrar", method = RequestMethod.GET)
    public ModelAndView registrar(ModelMap model,HttpServletRequest request){
        String nombre = request.getParameter("nombre");
        String carrera = request.getParameter("carrera"); 
        String correo = request.getParameter("correo");
        String p = request.getParameter("password");        
        String fecha = request.getParameter("fecha");        
        model.addAttribute("nombre", nombre);
        model.addAttribute("carrera", carrera);   
        model.addAttribute("fecha", fecha);        
        model.addAttribute("correo", correo);
        model.addAttribute("contra", p);        
        return new ModelAndView("registrar",model);    
    }
    
    @RequestMapping(value="/sesion", method = RequestMethod.POST)
    public ModelAndView sesion(ModelMap model,HttpServletRequest request){
        String correo = request.getParameter("correo");
        String p = request.getParameter("contra");        
        model.addAttribute("correo", correo);
        model.addAttribute("contra", p);        
        return new ModelAndView("sesion",model);    
    }
}
