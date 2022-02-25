/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pinterest;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
//import javax.servlet.MultipartConfig;
/**
 *
 * @author Usuario
 */
//@MultipartConfig(fileSizeThreshold)
public class Conexion {
    private MongoClient M=null;
    public Conexion(){
        this.M=new MongoClient("localhost",27017);
    }

    public MongoClient getM() {
        System.out.println("Entro a getM");
        return M;
    }

    public void setM(MongoClient M) {
        this.M = M;
    }
    
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
}
