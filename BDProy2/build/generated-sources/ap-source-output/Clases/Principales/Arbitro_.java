package Clases.Principales;

import Clases.Principales.Persona;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T08:42:54")
@StaticMetamodel(Arbitro.class)
public class Arbitro_ { 

    public static volatile SingularAttribute<Arbitro, Date> fechainicio;
    public static volatile SingularAttribute<Arbitro, BigDecimal> numeropasaporte;
    public static volatile SingularAttribute<Arbitro, Persona> persona;

}