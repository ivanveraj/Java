package sistemadeinformacioncine_danilo_buitrago;

import java.util.Scanner;

public class Teatro {

    private int Code, T, Tmax;
    private String Name;
    private String Municipality;
    private Sala Room[];

    public Teatro(int C, String N, String M, int CantR) {
        this.T = 0;
        this.Tmax = CantR;
        this.Code = C;
        this.Name = N;
        this.Municipality = M;
        this.Room = new Sala[this.Tmax];
    }

    public int Buscar(int C) {
        for (int i = 0; i < this.T; i++) {
            if (this.Room[i].getCode() == C) {
                return (i);
            }
        }
        return (-1);
    }

    public void Create(int C, String N, int S, int Cant) {
        if (this.T < this.Tmax) {
            this.Room[this.T] = new Sala(C, N, S, Cant);
            this.T++;
            System.out.println("Sala creada correctamente");
        } else {
            System.out.println("No se pueden ingresar mas salas al teatro");
        }
    }

    public void Delete(int C) {
        int B = Buscar(C);
        if (B != -1) {
            for (int i = B; i < this.T; i++) {
                this.Room[i] = this.Room[i + 1];
            }
            this.T--;
            System.out.println("Sala eliminado correctamente" + "\n");
        } else {
            System.out.println("No existe la sala" + "\n");
        }
    }

    public void Consultar(int C) {
        int B = Buscar(C);
        if (B != -1) {
            this.Room[B].Information();
            System.out.println("Sala consultada correctamente");
        } else {
            System.out.println("No existe la sala" + "\n");
        }
    }

    public void Modify(int C) {
        int B = Buscar(C);
        if (B != -1) {
            Scanner sn = new Scanner(System.in);
            int Cap;
            String Name;
            System.out.println("Digite el nombre: ");
            Name = sn.nextLine();
            this.Room[B].setName(Name);
            System.out.println("Digite la capacidad: ");
            Cap = sn.nextInt();
            this.Room[B].setSize(Cap);
            System.out.println("Sala modificada correctamente");
        } else {
            System.out.println("No existe la sala" + "\n");
        }
    }

    public void CreateMovie(int Sala, int CodeM, String T, String P, String G, int D, String De, String F, String H) {
        int B = Buscar(Sala);
        if (B != -1) {
            this.Room[B].CreateMovie(CodeM, T, P, G, D, De, F, H);
        } else {
            System.out.println("No existe la sala");
        }
    }

    public void ModifyMovie(int CodeR, String TitleM) {
        int B = Buscar(CodeR);
        if (B != -1) {
            this.Room[B].Modify(TitleM);
        } else {
            System.out.println("Sala no existe");
        }
    }

    public void DeleteMovie(int CodeR, String TitleM) {
        int B = Buscar(CodeR);
        if (B != -1) {
            this.Room[B].Delete(TitleM);
        } else {
            System.out.println("Sala no existe");
        }
    }

    public void ConsultarMovie(int CodeR, String TitleM) {
        int B = Buscar(CodeR);
        if (B != -1) {
            System.out.println("nombre ");
            this.Room[B].Consultar(TitleM);
        } else {
            System.out.println("Sala no existe");
        }
    }

    public void ConsultarTeatro() {
        this.Information();
    }

    public void ModifyTeatro() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digite el codigo del teatro");
        int Code = sn.nextInt();
        this.setCode(Code);
        System.out.println("Digite el nombre del teatro: ");
        sn.nextLine();
        String Name = sn.nextLine();
        this.setName(Name);
        System.out.println("Digite el municipio del teatro: ");
        String Municipality= sn.nextLine();
        this.setMunicipality(Municipality);
        System.out.println("Teatro modificado correctamente");
    }

    public void Information() {
        System.out.println("Codigo: " + this.Code + "\nNombre: " + this.Name + "\nMunicipio: " + this.Municipality
                + "\nCantidad de salas: " + this.T);
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMunicipality() {
        return Municipality;
    }

    public void setMunicipality(String Municipality) {
        this.Municipality = Municipality;
    }

    public int getT() {
        return T;
    }

    public void setT(int T) {
        this.T = T;
    }

    public int getTmax() {
        return Tmax;
    }

    public void setTmax(int Tmax) {
        this.Tmax = Tmax;
    }

    public Sala[] getRoom() {
        return Room;
    }

    public void setRoom(Sala[] Room) {
        this.Room = Room;
    }

}
