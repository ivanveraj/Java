package com.mycompany.pinterest;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class ConexionMongoDB {
    public static MongoClient CrearConexion(){
        System.out.println("Prueba de conexion");
        MongoClient M=null;
        M=new MongoClient("localhost",27017);
        return M;
    }
    public static void InsertarImagen(DB db, String Coleccion,int Id, String Autor, String Img, String Titulo, String Descripcion){
        DBCollection C=db.getCollection(Coleccion);
        BasicDBObject Document=new BasicDBObject();
        Document.put("Id",Id);
        Document.put("Autor",Autor);
        Document.put("Img",Img);
        Document.put("Titulo",Titulo);
        Document.put("Descripcion",Descripcion);
        C.insert(Document);
    }
    public static void MostrarColeccion(DB db, String Coleccion){
        DBCollection C=db.getCollection(Coleccion);
        DBCursor i=C.find();
        while(i.hasNext()){
            System.out.println("* "+i.next().get("Id")+" - "+i.curr().get("Autor")+" - "+i.curr().get("Img")+" - "+i.curr().get("Titulo")+" - "+i.curr().get("Descripcion")+" \n ");
        }
    }
    public static void BuscarPorTitulo(DB db, String Coleccion, String Titulo){
        DBCollection C=db.getCollection(Coleccion);
        BasicDBObject Consulta=new BasicDBObject();
        Consulta.put("Titulo",Titulo);
        DBCursor i=C.find(Consulta);
        while(i.hasNext()){
            System.out.println("* "+i.next().get("Id")+" - "+i.curr().get("Autor")+" - "+i.curr().get("Img")+" - "+i.curr().get("Titulo")+" - "+i.curr().get("Descripcion")+" \n ");
        }
    }
    public static void ActualizarDocumento(DB db, String Coleccion, int Id, String Img, String Titulo, String Descripcion){
        DBCollection C=db.getCollection(Coleccion);
        BasicDBObject ActualizarI=new BasicDBObject();
        BasicDBObject ActualizarT=new BasicDBObject();
        BasicDBObject ActualizarD=new BasicDBObject();
        ActualizarI.append("$set", new BasicDBObject().append("Img",Img));
        ActualizarT.append("$set", new BasicDBObject().append("Titulo",Titulo));
        ActualizarD.append("$set", new BasicDBObject().append("Descripcion",Descripcion));
        BasicDBObject BuscarXId=new BasicDBObject();
        BuscarXId.append("Id",Id);
        C.updateMulti(BuscarXId, ActualizarI);
        C.updateMulti(BuscarXId, ActualizarT);
        C.updateMulti(BuscarXId, ActualizarD);
    }
    
    public static void EliminarDocumento(DB db, String Coleccion, int Id){
        DBCollection C=db.getCollection(Coleccion);
        C.remove(new BasicDBObject().append("Id",Id));
    }
    
    public static void BuscarPorId(DB db, String Coleccion, int Id){
        DBCollection C=db.getCollection(Coleccion);
        BasicDBObject Consulta=new BasicDBObject();
        Consulta.put("Id",Id);
        DBCursor i=C.find(Consulta);
        while(i.hasNext()){
            System.out.println("* "+i.next().get("Id")+" - "+i.curr().get("Autor")+" - "+i.curr().get("Img")+" - "+i.curr().get("Titulo")+" - "+i.curr().get("Descripcion")+" \n ");
        }
    }
    public static void main(String []args){
        MongoClient M=CrearConexion();        
        if(M!=null){
            System.out.println("Ingreso a la base de datos correcto");
            DB db=M.getDB("Pruebas");
            /*InsertarImagen(db,"Imagen",123,"Jaider Vera","Base64","Ola","Descripcion");
            InsertarImagen(db,"Imagen",124,"Ivan V","Base64","Olas","Descripcion");
            InsertarImagen(db,"Imagen",125,"Jaider Vera","Base64","Olad","Descripcion");
            InsertarImagen(db,"Imagen",126,"Ivan V","Base64","Ola","Descripcion");
            BuscarPorTitulo(db,"Imagen","Ola");
            System.out.println("Antes del update");
            MostrarColeccion(db,"Imagen");
            ActualizarDocumento(db,"Imagen",123,"Base63666","Oleee","Descripccdxxxx");
            System.out.println("Despues");
            MostrarColeccion(db,"Imagen");*/
            System.out.println("Antes del delete");
            MostrarColeccion(db,"Imagen");
            EliminarDocumento(db,"Imagen",123);
            System.out.println("Despues");
            MostrarColeccion(db,"Imagen");
            
        }else{
            System.out.println("\n\nError: conexion no establecida\n\n");
        }
    }
}
