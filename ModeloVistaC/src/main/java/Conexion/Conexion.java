package Conexion;

public class Conexion {
    private Connection C;
    private String Url;
    private String User;
    private String Password;

    public Conexion() {
        try{
            this.Url="jdbc:postgreslq://localhost:5432/TallerUno";
            this.User="postgres";
            this.Password="Jivjmmm08@";
            Class.forName("org.postgreslq.Driver");
            this.C=DriverManager.getConnection(this.Url,this.User,this.Password);
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }

    public Connection getC() {
        return C;
    }
    public void setC(Connection c) {
        C = c;
    }
    public String getUrl() {
        return Url;
    }
    public void setUrl(String url) {
        Url = url;
    }
    public String getUser() {
        return User;
    }
    public void setUser(String user) {
        User = user;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}