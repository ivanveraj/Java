
package academiaadasoft;

import javax.swing.JOptionPane;

public class AcademiaADASOFT 
{
    public AcademiaADASOFT() 
    {
    }

    public static void main(String[] args) 
    {
        //Instancias de las clases, crear los objetos
        Estudiantes objEst;//definiendo un variable tipo clase estudiantes
        objEst=new Estudiantes();//llamando al constructor para que le de el inicio al objeto
        AcademiaADASOFT objAcad=new AcademiaADASOFT ();
        Profesores objPro=new Profesores();
        Acudientes objAcu=new Acudientes();
        Archivos objArc=new Archivos();
        CRUDEstudiantes objCRUDEst=new CRUDEstudiantes();
        int opcPpal,opcEst,opcPila;
        String id,tex;
        do//mientras opcPPal principal
        {
           opcPpal=Validaciones.leerEntero(objAcad.MenuPPAL());
           switch(opcPpal)//en caso de opcion del principal
           {
               case 1:do//mientras opcEst
                      {
                       opcEst=Validaciones.leerEntero(objAcad.MenuEstudiantes());
                       switch(opcEst)//en caso de opcion de estudiantes
                       {
                           case 1: id=Validaciones.leerString("Digite identificación del estudiante a ingresar en el archivo: ");
                                   objCRUDEst.IngresarEstudiante(objArc, id);
                                   break;
                           case 2: id=Validaciones.leerString("Digite identificación del estudiante a consultar en el archivo: ");
                                   tex=objCRUDEst.Consultarestudiante(objArc, id);
                                   if(tex.equals(""))
                                    {
                                        JOptionPane.showMessageDialog(null,"El estudiante no existe en el archivo");
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null,"El estudiante es: \n"+tex);
                                    }
                                    break; 
                           case 3: JOptionPane.showMessageDialog(null,"El archivo completo es:\n"+objCRUDEst.MostrarTodo(objArc));
                                   break;
                      }//fin caso estudiantes
                      }while(opcEst<7);
                      break;
               case 6:
                      break;
                      
               }//fin caso
        }while(opcPpal<10);
        

    }//fin del main
    
    
public String MenuPPAL()
{
    return "MENU PRINCIPAL\n\n"
            + "Ejercicio: A los requerimientos de ADASOFT, se aumenta el siguiente: tanto profesores como estudiantes"
            + "\n deben tener el año de nacimiento, y con este calcular la edad en años, se deben hacer los cambios pertinentes"
            + "\n al proyecto para que cumpla este requisito o historia de usuario.\n"
            + "Nota: Opcion 1. Estudiantes registra los datos y calcula la edad. \nPermite realizar todas las solicitudes solicitadas por la docente\n"
            + "Opcion 2. Profesores no realiza ninguna accion falta el CRUD. \nConfiguracion para calcular la edad ya se encuentra programada\n"
            + "1. Estudiantes\n"
            + "2. Profesores\n"
            + "3. Acudientes\n"
            + "4. Cursos\n"
            + "5. \n"
            + "6. EJECUTE EN ESTA OPCION SU EJERCICIO\n"//NO LA CAMBIE DEJELA ASI-----------
            + "7. \n"
            + "8. \n"
            + "9. \n"
            + "10. Terminar\n";
}//fin del principal

public String MenuEstudiantes()
{
    return "MENU ESTUDIANTES\n\n"
            + "1. Ingreso de estudiantes al Archivo\n"
            + "2. Consultar un estudiante del Archivo\n"
            + "3. Mostrar todos los registros del archivo\n"
            + "4. \n"
            + "5. \n"
            + "6. \n"
            + "7. Volver al menu principal\n";
}//fin del menu de estudiantes

public String MenuProfesores()
{
    return "MENU ESTUDIANTES\n\n"
            + "1. Ingreso de Profesores al Archivo\n"
            + "2. Consultar un Profesor del Archivo\n"
            + "3. Mostrar todos los registros del archivo\n"
            + "4. \n"
            + "5. \n"
            + "6. \n"
            + "7. Volver al menu principal\n";
}//fin del menu de Profesores

}//fin de la clase academiaadasoft
