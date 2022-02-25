package tablashash;

import java.util.Arrays;

public class Hash {
    private int V[];
    public Hash(int N) {
        this.V = new int[N];
        Arrays.fill(this.V, -1);
    }
    public int Hashing(int X, int V){
        int Key = ((X * 2) + 3) % (V- 1); 
        return Key;
    }
    public void Print() {
        String Keys = "";
        String Valores = "";
        for (int i = 0; i < this.V.length; i++) {
            if (i == this.V.length - 1) {
                Keys += "Key:" + i;
            } else {
                Keys += "Key:" + i + " // ";
            }
        }
        System.out.println(Keys);
        for (int i = 0; i < this.V.length; i++) {
            if (i == this.V.length - 1) {
                Valores += "Valor:" + this.V[i];
            } else {
                Valores += "Valor:" + this.V[i] + " // ";
            }
        }
        System.out.println(Valores);
    }

    public void Insert(int X) {
        System.out.println("Insert");
        if (X > 0) {
            int Key =Hashing(X,this.V.length);
            System.out.println("Key:" + Key + " elemento=" + X);
            try {
                while (this.V[Key] != -1) {
                    System.out.println("Colision en el Key:" + Key + " del elemento:" + X);
                    Key++;
                }
                this.V[Key] = X;
            } catch (ArrayIndexOutOfBoundsException E) {
                System.out.println("Insert 2");
                Key =Hashing(X,this.V.length);
                int Cont = 0;
                while (this.V[Cont] != -1) {
                    System.out.println("Colision en el Key:" + Cont + " del elemento:" + X);
                    Cont++;
                    if (Cont ==this.V.length) {
                        Cont--;
                        break;
                    }
                }
                if (this.V[Cont] == -1) {
                    this.V[Cont] = X;
                }
            }
        } else {
            System.out.println("No se permiten valores negativos");
        }
    }

    public String Search(int X) {
        int Key =Hashing(X,this.V.length);
        try {
            while (this.V[Key] != -1) {
                if (this.V[Key] == X) {
                    return ("Elemento encontrado en la Key: " + Key);
                }
                Key++;
            }
        } catch (ArrayIndexOutOfBoundsException E) {
            int Cont = 0;
            Key =Hashing(X,this.V.length);
            while (this.V[Cont] != -1) {
                if (this.V[Cont] == X) {
                    return ("Elemento encontrado en la Key: " + Cont);
                }
                Cont++;
                if (Cont ==this.V.length) {
                    break;
                }
            }
        }
        return ("Elemento no encontrado");
    }

    public String Delete(int X) {
        int Key =Hashing(X,this.V.length);
        try {
            while (this.V[Key] != -1) {
                if (this.V[Key] == X) {
                    this.V[Key]=-1;
                    return ("Elemento ["+X+"] encontrado en la Key: " + Key+" ha sido eliminado");
                }
                Key++;
            }
        } catch (ArrayIndexOutOfBoundsException E) {
            Key =Hashing(X,this.V.length);
            int Cont = 0;
            while (this.V[Cont] != -1) {
                if (this.V[Cont] == X) {
                    this.V[Cont]=-1;
                    return ("Elemento ["+X+"] encontrado en la Key: " + Cont+" ha sido eliminado");
                }
                Cont++;
                if (Cont ==this.V.length) {
                    break;
                }
            }
        }
        return ("Elemento ha eliminar no ha sido encontrado");
    }
    public void Insertt(int X) {
        System.out.println("Insert");
        if (X > 0) {
            int Key =Hashing(X,this.V.length);
            System.out.println("Key:" + Key + " elemento=" + X);
                int Cont = 0;
                while (this.V[Key] != -1) {
                    System.out.println("Colision en el Key:" + Key + " del elemento:" + X);
                    Key++;
                    if(Key==this.V.length){
                        if(Cont==1){
                            Key--;
                            break;
                        }
                        Key=0;
                        Cont++;
                    }
                }
                if(this.V[Key]==-1){
                    this.V[Key] = X;
                }
        } else {
            System.out.println("No se permiten valores negativos");
        }
    }

    
    
}

