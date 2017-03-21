package com.company;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by bsanche on 3/15/2017.
 */
public abstract class AbstractDao {


     public void insert() {
      StringBuffer query = new StringBuffer("INSERT INTO " ).append(this.getClass().getSimpleName());
      System.out.println(query.toString());
         Field[] atributes = this.getClass().getDeclaredFields();
         Field compare;
         for (int i=0; i<atributes.length; i++){
             compare=atributes[i];
             query.append(" (").append(compare.getName());
             if (i!=(atributes.length-1))
                 query.append(",");
         }
         // ya hemos puesto los atributos hasta que coincidan con el numero de variables totales
         //ahora necesitamos introducir tantos ? como variables hayan para poder pasar estos parametros hacia donde vayan a ser usados luego
          query.append(") VALUES (");
         for (int i=1; i<atributes.length; i++){
             compare=atributes[i];
             query.append("?,");
             if (i==atributes.length-1)
                 query.append("?)");




         }
         System.out.println(query.toString());

     }

    public void update(){

         StringBuffer query = new StringBuffer("UPDATE ").append(this.getClass().getSimpleName()).append(" SET (");
         Field [] atributes =  this.getClass().getDeclaredFields();
         Field compare;
            for (int i=0; i<atributes.length;i++){
                compare = atributes[i];
                query.append(compare.getName());
                query.append("==?");
                if (i!=atributes.length-1){
                    query.append(",");
                }


            }
        query.append(") WHERE ").append(atributes[0].getName()).append("==?");
        System.out.println(query.toString());

    }

     public void select(String busqueda){

        Class typeclass = this.getClass();
        Field [] atributes = this.getClass().getDeclaredFields();
        StringBuffer query = new StringBuffer("SELECT ").append(busqueda).append(" INTO ").append(this.getClass().getSimpleName()).append(" WHERE ").append(atributes[0].getName()).append("==?");
         System.out.println(query.toString());

     }

     public void delete(){

         Class typeclass = this.getClass();
         Field[] atributes = this.getClass().getDeclaredFields();
         StringBuffer query = new StringBuffer("DELETE FROM ").append(this.getClass().getSimpleName()).append(" WHERE ").append(atributes[0].getName()).append("==?");
         System.out.println(query.toString());

     }
     public void findAll(){

         Field [] atributes = this.getClass().getDeclaredFields();
         StringBuffer query = new StringBuffer("SELECT * INTO ").append(this.getClass().getSimpleName()).append(" WHERE ").append(atributes[0].getName()).append("==?");
         System.out.println(query.toString());
     }



}
