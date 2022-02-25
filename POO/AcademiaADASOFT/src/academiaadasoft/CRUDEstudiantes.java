package academiaadasoft;

import javax.swing.JOptionPane;

public class CRUDEstudiantes {

    public CRUDEstudiantes() {
    }

    /*metodo para buscar el estudiante en el archivo y si existe NO se permite de nuevo
    su ingreso y si no existe se graba*/
    public void IngresarEstudiante(Archivos objarch, String id) {
        Estudiantes objEst = new Estudiantes();//se crea el objeto estudiantes
        if (Buscar(objarch, id) == false)//si no lo encuentra
        {
            objEst = objEst.EntrarDatos(id);//lee toda la informacion y recibe el objeto
            GrabarEstudiante(objarch, objEst); //metodo que graba fisicamente el registro en memoria
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante YA existe en el archivo");
        }
    }

    public void GrabarEstudiante(Archivos objarc, Estudiantes obje) {
        String texto;
        JOptionPane.showMessageDialog(null, objarc.AbrirArchivoModoEscritura("Estudiantes.txt"));//archivo fisico
        texto = obje.EstructuraReg();//con esto se convierte el objeto estudiante en solo texto, organizado y separado por el split
        JOptionPane.showMessageDialog(null, objarc.EscribirRegistro(texto)); //grabando físicamente el registro en el txt
        JOptionPane.showMessageDialog(null, objarc.CerrarArchivoModoEscritura());
    }//fin grabar estudiante

    public String MostrarTodo(Archivos objarch) {
        //variables auxiliares para manejar el vector de texto por registro
        String texto = "";
        try {
            String I, No, Apell, Direcc, Tel, Cel, Em,Nac,Edad;
            int Ai, Ant;

            String Reg[];//dividir el registro como un vector
            Reg = new String[11];
            JOptionPane.showMessageDialog(null, objarch.AbrirArchivoModoLectura("Estudiantes.txt"));
            Reg = objarch.LeerRegistro(11);
            while (Reg != null) //mientras no eof(“estudiantes.txt”)
            {
                I = Reg[0];//se pasa todo el registro a las variables auxiliares
                No = Reg[1];
                Apell = Reg[2];
                Direcc = Reg[3];
                Tel = Reg[4];
                Cel = Reg[5];
                Em = Reg[6];
                Ai = Integer.parseInt(Reg[7]);
                Ant = Integer.parseInt(Reg[8]);
                Nac=Reg[9];
                Edad=Reg[10];
                Estudiantes objE = null;//se crea el objeto y se inicializa
                objE = new Estudiantes(I, No, Apell, Direcc, Tel, Cel, Em, Ai, Ant,Nac);
                texto = texto + objE.toString() + "\n";
                Reg = objarch.LeerRegistro(11);
            }//Fin mientras
            JOptionPane.showMessageDialog(null, objarch.CerrarArchivoModoLectura());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo leído y cerrado correctamente");
        }
        return texto;
    }//Fin mostrarTodo

    public String Consultarestudiante(Archivos objarch, String id) {
        //variables auxiliares para manejar el vector de texto por registro
        String texto = "";
        try {
            String I, No, Apell, Direcc, Tel, Cel, Em,Nac,Edad;
            int Ai, Ant;

            String Reg[];//dividir el registro como un vector
            Reg = new String[11];
            JOptionPane.showMessageDialog(null, objarch.AbrirArchivoModoLectura("Estudiantes.txt"));
            Reg = objarch.LeerRegistro(11);
            while (Reg != null) //mientras no eof(“estudiantes.txt”)
            {
                I = Reg[0];
                No = Reg[1];
                Apell = Reg[2];
                Direcc = Reg[3];
                Tel = Reg[4];
                Cel = Reg[5];
                Em = Reg[6];
                Ai = Integer.parseInt(Reg[7]);
                Ant = Integer.parseInt(Reg[8]);
                Nac=Reg[9];
                Edad=Reg[10];
                Estudiantes objE;
                objE = new Estudiantes(I, No, Apell, Direcc, Tel, Cel, Em, Ai, Ant,Nac);
                if (I.equals(id)) {
                    texto = objE.toString();
                }
                Reg = objarch.LeerRegistro(11);
            }//Fin mientras
            JOptionPane.showMessageDialog(null, objarch.CerrarArchivoModoLectura());
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, "Archivo leído y cerrado correctamente");
        }
        return texto;
    }//Fin mostrarTodo    

    public boolean Buscar(Archivos objarch, String id) {
        //variables auxiliares para manejar el vector de texto por registro
        boolean sw = false;
        try {
            String I, No, Ap, Di, T, Cel, Em,Nac,Edad;
            int Ai, Ant;

            String Reg[];//dividir el registro como un vector
            Reg = new String[11];
            JOptionPane.showMessageDialog(null, objarch.AbrirArchivoModoLectura("Estudiantes.txt"));
            Reg = objarch.LeerRegistro(11);
            while (Reg != null) //mientras no eof(“estudiantes.txt”)
            {
                I = Reg[0];
                No = Reg[1];
                Ap = Reg[2];
                Di = Reg[3];
                T = Reg[4];
                Cel = Reg[5];
                Em = Reg[6];
                Ai = Integer.parseInt(Reg[7]);
                Ant = Integer.parseInt(Reg[8]);
                Nac=Reg[9];
                Edad=Reg[10];
                if (I.equals(id)) {
                    sw = true;
                }
                Reg = null;
                Reg = objarch.LeerRegistro(11);
            }//Fin mientras
            JOptionPane.showMessageDialog(null, objarch.CerrarArchivoModoLectura());
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, "Archivo leído y cerrado correctamente");
        }
        return sw;
    }//Fin mostrarTodo    

}//fin clase  CRUD
