/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa04cc;

/**
 *
 * @author Oziel
 */
public class Programa04CC {

    public static void main(String[] args) {
        DAOEmpleado dao = new DAOEmpleado();
        
        Empleado emp = new Empleado();
        
        emp.setClave(10);
        emp.setNombre("Gabriel");
        emp.setDireccion("Av 11");
        emp.setTelefono("9999");
        dao.create(emp);
    }
}
