
package academiaadasoft;


public class Acudientes extends Personas
{

    public Acudientes() {
    }
    

    public Acudientes(String Ident, String Nom, String Apell, String Direcc, String Tel, String Celular, String Email, String Nacimiento) {
        super(Ident, Nom, Apell, Direcc, Tel, Celular, Email, Nacimiento);
    }
    
    public Acudientes EntrarDatos(String id)
    {
        IngresarDatos(id);
        Acudientes objA;
        objA=new Acudientes(getIdent(),getNom(), getApell(), getDirecc(), getTel(), getCelular(), getEmail(), getNacimiento());
        return objA;
    }//fin EntrarDAtos
    
    
}//fin clase acudientes
