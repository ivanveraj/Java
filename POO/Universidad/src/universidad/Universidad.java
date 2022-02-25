/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author PC-JIVJ
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Control C=new Control();
        C.CrearMatriculaP(1010,1005,2,1,"Ivan");
        C.CrearMatriculaP(1011,1005,2,1,"Iva");
        C.CrearMatriculaP(1012,1005,2,1,"Ivana");
        C.CrearMatriculaP(1013,1005,2,1,"Cami");
        /*Matricula M=new Matricula(1010,1005012,2,1,"Ivan");
        MatriculaDistancia MD=new MatriculaDistancia(1011,1005012252,6,1,"Ivan Jaimes");
        System.out.println(M.InfoMatricula());
        System.out.println(MD.InfoMatricula());

        Curso C[]=new Curso[6];
        C[0]=new Teorico(1010,"Calculo",1,30,30,30,30);
        C[1]=new Teorico(1011,"Calculo II",1);
        C[2]=new Teorico(1012,"Calculo III",1);
        C[3]=new Practico(1013,"Calculo IIII",1);
        C[4]=new Practico(1014,"Calculo IIII",1);
        C[5]=new Practico(1015,"Calculo IIII",1);
        for(int i=0;i<C.length;i++){
            System.out.println(C[i].InformacionCurso());
        }*/
    }
    
}
