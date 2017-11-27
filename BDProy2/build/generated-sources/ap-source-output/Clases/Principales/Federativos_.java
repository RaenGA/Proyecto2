package Clases.Principales;

import Clases.Principales.Persona;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T09:50:12")
@StaticMetamodel(Federativos.class)
public class Federativos_ { 

    public static volatile SingularAttribute<Federativos, Date> fechainicio;
    public static volatile SingularAttribute<Federativos, BigDecimal> numeropasaporte;
    public static volatile SingularAttribute<Federativos, String> puesto;
    public static volatile SingularAttribute<Federativos, Persona> persona;

}